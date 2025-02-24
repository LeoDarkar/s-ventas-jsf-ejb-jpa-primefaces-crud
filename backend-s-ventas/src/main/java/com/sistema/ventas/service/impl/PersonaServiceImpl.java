/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.ventas.service.impl;

import com.sistema.ventas.model.entity.Persona;
import com.sistema.ventas.repository.PersonaRepository;
import java.util.List;
import com.sistema.ventas.service.IUPersonaService;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author leyun
 */
@Stateless //tramee sin estado pero ese rato que ejecute me traes la info y luego desaparezca
public class PersonaServiceImpl implements IUPersonaService {

    @PersistenceContext
    private EntityManager em;

    @EJB
    private PersonaRepository personaRepository;

    @Override
    public Persona guardar(Persona persona) {
        em.persist(persona);
        return persona;
    }

    @Override
    public Persona actualizar(Persona persona) {
        return em.merge(persona);
    }

    @Override
    public void eliminar(Persona persona) {
        em.remove(em.merge(persona));
    }

    @Override
    public List<Persona> listarPersonas() {
        return em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
    }

}
