package videoclub;

public abstract class Contenido {	// Creamos la clase abstracta Contenido con los atributos: nombre y calificacion.
	
	protected String nombre;	// Usamos el modificador de acceso "protected", para que puedan acceder a dichos atributos, 
	protected int calificacion;	// las subclases que hereden de Contenido, ya sean vecinas (de su mismo paquete) como en 
								// este caso, o externas (de otro).	
	
	public Contenido()	// Creamos un constructor vacio con sus valores por defecto,
	{
		this.nombre="";
		this.calificacion=0;		
	}
	
	public Contenido(String nombre, int calificacion)	// y otro constructor al que le pasamos los 2 atributos por el main.
	{
		this.nombre=nombre;
		this.calificacion=calificacion;	
	}
	//-----------------------------------------------------------------
	// getNombre
	//-----------------------------------------------------------------

	public String getNombre() {	
		return nombre;
	}
	//-----------------------------------------------------------------
	// setNombre
	//-----------------------------------------------------------------

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//-----------------------------------------------------------------
	// getCalificacion
	//-----------------------------------------------------------------

	public int getCalificacion() {
		return calificacion;
	}
	//-----------------------------------------------------------------
	// setCalificacion
	//-----------------------------------------------------------------

	public void setCalificacion(int calificacion) { 
		this.calificacion = calificacion;			
	}
	//-----------------------------------------------------------------
	// toString
	//-----------------------------------------------------------------
	@Override 
	public String toString() {
		return "Contenido [nombre=" + nombre + ", calificacion=" + calificacion + "]";
	}	
}
