/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.ventas.repository;

import com.sistema.ventas.model.entity.Persona;
import com.sistema.ventas.repository.persistence.CrudRepository;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;

/**
 *
 * @author leyun
 */

@Stateless
public class PersonaRepository extends CrudRepository<Persona>{

    //mira al constructor del repositoriogeneral y me resiva de forma global mi entidad
    public PersonaRepository() {
        super(Persona.class);
    }

    
    //conexion a la base de datos por persistencecontext con un metodo abstracto
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
//    public void List<Persona> findAllNombre(String nombre){
//        
//    }
    
    //ya puedo usar consultas de query desde aqui
}
