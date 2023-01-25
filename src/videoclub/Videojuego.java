package videoclub;

// Creamos la clase Videojuego, que hereda de la superclase Contenido, con los atributos: genero y plataforma. 
public class Videojuego extends Contenido { 
    											
	private String genero;	// Solo escribimos los atributos propios no heredados (los de la clase padre, ya los sabe).	
	private String plataforma;
	
	/* Creamos un constructor con todos los parametros: en el constructor hay que indicar los de su clase padre 
	   (nombre y calificacion). */
	
	public Videojuego (String nombre, int calificacion, String genero, String plataforma)
	{
		super (nombre, calificacion); // Usamos de nuevo la funcion super, que llama al constructor padre, con sus atributos.
		this.genero = genero;
		this.plataforma = plataforma;	
	}
	// Creamos sus getters y setters. Los de su clase padre, como todos sus miembros (atributos/metodos), los hereda.
	//-----------------------------------------------------------------
	// getGenero
	//-----------------------------------------------------------------
	public String getGenero() {	
		return genero;
	}
	//-----------------------------------------------------------------
	// setGenero
	//-----------------------------------------------------------------
	public void setGenero(String genero) {
		this.genero = genero;
	}
	//-----------------------------------------------------------------
	// getPlataforma
	//-----------------------------------------------------------------
	public String getPlataforma() {
		return plataforma;
	}
	//-----------------------------------------------------------------
	// setPlataforma
	//-----------------------------------------------------------------
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	//-----------------------------------------------------------------
	// toString: nuevamente, agregamos los atributos de la superclase
	//-----------------------------------------------------------------
	@Override
	public String toString() {
		return "Videojuego [nombre=" + this.getNombre() + ", calificacion= "+ this.getCalificacion() 
		+ ", genero=" + genero + ", plataforma=" + plataforma + "]";	
	}
}
