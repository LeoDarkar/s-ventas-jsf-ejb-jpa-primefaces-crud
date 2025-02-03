/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.ventas.controller;

import com.sistema.ventas.model.entity.Persona;
import com.sistema.ventas.service.IUPersonaService;
import jakarta.ejb.EJB;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

/**
 *
 * @author leyun
 */
@Getter
@Setter
@Named(value = "personaMB") //MB manage bean
@ViewScoped //toda la info se queda en pantalla hasta reiniciar
public class PersonaController implements Serializable {

    @EJB
    private IUPersonaService personaService;

    private Persona persona;

    
    private List<Persona> personas;
    
    public void nuevo() {
        persona = new Persona();

    }
    
    public void guardar() {

        if (persona.getIdPersona() == null) {
            personaService.guardar(persona);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Persona agregada"));
        }else{
            personaService.actualizar(persona);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Persona editada"));
        }
        nuevo();
        PrimeFaces.current().executeScript("PF('dlgPersonaRegistro').hide()");
        PrimeFaces.current().ajax().update("form:messages", "form:dt-persona");
    }
    
    public List<Persona> getPersonas(){
        return personas =personaService.listarPersonas();
    }

}
