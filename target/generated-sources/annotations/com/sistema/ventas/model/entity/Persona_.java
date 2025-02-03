package com.sistema.ventas.model.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Persona.class)
public abstract class Persona_ {

	public static final String CEDULA = "cedula";
	public static final String SEXO = "sexo";
	public static final String NOMBRE = "nombre";
	public static final String EDAD = "edad";
	public static final String ID_PERSONA = "idPersona";

	
	/**
	 * @see com.sistema.ventas.model.entity.Persona#cedula
	 **/
	public static volatile SingularAttribute<Persona, Integer> cedula;
	
	/**
	 * @see com.sistema.ventas.model.entity.Persona#sexo
	 **/
	public static volatile SingularAttribute<Persona, Character> sexo;
	
	/**
	 * @see com.sistema.ventas.model.entity.Persona
	 **/
	public static volatile EntityType<Persona> class_;
	
	/**
	 * @see com.sistema.ventas.model.entity.Persona#nombre
	 **/
	public static volatile SingularAttribute<Persona, String> nombre;
	
	/**
	 * @see com.sistema.ventas.model.entity.Persona#edad
	 **/
	public static volatile SingularAttribute<Persona, Integer> edad;
	
	/**
	 * @see com.sistema.ventas.model.entity.Persona#idPersona
	 **/
	public static volatile SingularAttribute<Persona, Integer> idPersona;

}

