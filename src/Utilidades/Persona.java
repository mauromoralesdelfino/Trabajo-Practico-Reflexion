package Utilidades;

import Anotaciones.Anotacion1;

public class Persona {

	String nombre;
	String apellido;
	String dni;
	Integer edad;
	
	public Persona()
	{}
	
	public Persona(String nombre, String apellido, String dni, Integer edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	
	@Anotacion1(intentos = 1,nombre2 = "hola String nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Anotacion1(intentos = 2,nombre2 = "hola get dni")
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	@Anotacion1(intentos = 6,nombre2 = "hola MetodoUno")
	public void MetdodoUno()
	{
		
		System.out.println("Hola, estoy dentro del metodo");
	}

	public void MetodoDos()
	{}
	
}
