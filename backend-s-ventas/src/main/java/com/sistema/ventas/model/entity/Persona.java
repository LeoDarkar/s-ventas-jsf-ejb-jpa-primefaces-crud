/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.ventas.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author leyun
 */
@Data //genera getters y setter auto
@AllArgsConstructor //genera contructores con datos generico
@NoArgsConstructor //genera un constructor vacio
@Builder // genera uhn builde para trabajar mas rapido con instancias 

@Entity //refiere que esto es una entidad 
@Table(name = "persona") //referencia a mi tabla de la DB

public class Persona implements Serializable {

    //hacemos referencia a los datos de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Integer idPersona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cedula")
    private int cedula;
    @Column(name = "edad")
    private int edad;
    @Column(name = "sexo")
    private char sexo;

}
