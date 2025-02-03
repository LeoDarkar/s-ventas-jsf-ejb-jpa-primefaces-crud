/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.ventas.service;

import com.sistema.ventas.model.entity.Persona;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author leyun
 */
@Local
public interface IUPersonaService {

    Persona guardar(Persona persona);

    Persona actualizar(Persona persona);

    void eliminar(Persona persona);

    List<Persona> listarPersonas();

}
