package videoclub;

// Creamos la clase Prestamo, con los atributos contenidoPrestado (de tipo Contenido, como Pelicula y Videojuego) y persona.
public class Prestamo {
	
	private Contenido contenidoPrestado; 										
	private String persona;
	
	// Creamos un constructor al que le pasamos los 2 atributos desde el main.
	public Prestamo (Contenido contenidoPrestado, String persona)	
	{
		this.contenidoPrestado = contenidoPrestado;
		this.persona = persona;	
	}
	//-----------------------------------------------------------------
	// getContenidoPrestado
	//-----------------------------------------------------------------
	public Contenido getContenidoPrestado() {	// Creamos sus getters y setters.
		return contenidoPrestado;
	}
	//-----------------------------------------------------------------
	// setContenidoPrestado
	//-----------------------------------------------------------------
	public void setContenidoPrestado(Contenido contenidoPrestado) {
		this.contenidoPrestado = contenidoPrestado;
	}
	//-----------------------------------------------------------------
	// getPersona
	//-----------------------------------------------------------------
	public String getPersona() {
		return persona;
	}
	//-----------------------------------------------------------------
	// setPersona
	//-----------------------------------------------------------------
	public void setPersona(String persona) {
		this.persona = persona;
	}
	//-----------------------------------------------------------------
	// toString: imprime las variables contenidoPrestado (que sera un objeto Pelicula o Videojuego) y persona.
	//-----------------------------------------------------------------
	@Override
	public String toString() {
		return "Prestamo [contenidoPrestado=" + contenidoPrestado + ", persona=" + persona + "] \n";
	}
}