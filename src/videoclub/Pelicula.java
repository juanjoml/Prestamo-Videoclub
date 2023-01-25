package videoclub;

// Creamos la clase Pelicula, que hereda de la superclase Contenido, con los atributos: genero, publicacion y director. 
public class Pelicula extends Contenido{ 
	
	private String genero;		// Solo escribimos los atributos propios no heredados (los de la clase padre, ya los sabe).		
	private int publicacion;			
	private String director;
	
	/* Creamos un constructor con todos los parametros: en el constructor hay que indicar los de su clase padre 
	   (nombre y calificacion). */
	
	public Pelicula(String nombre, int calificacion, String genero, int publicacion, String director)
	{
		/*  Para ello hay 2 metodos: 
		    Una forma : Usar los metodos set de ambos atributos, heredados de la clase padre Contenido
		  		this.setNombre(nombre);
		  		this.setCalificacion(calificacion); 
		    Otra forma (la que usamos aqui): usar la funcion super, que llama al constructor padre, con sus atributos. */
		
		super (nombre, calificacion); 							 
		this.genero = genero;
		this.publicacion = publicacion;
		this.director = director;
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
	// getPublicacion
	//-----------------------------------------------------------------
	public int getPublicacion() {
		return publicacion;
	}
	//-----------------------------------------------------------------
	// setPublicacion
	//-----------------------------------------------------------------
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	//-----------------------------------------------------------------
	// getDirector
	//-----------------------------------------------------------------
	public String getDirector() {
		return director;
	}
	//-----------------------------------------------------------------
	// setDirector
	//-----------------------------------------------------------------
	public void setDirector(String director) {
		this.director = director;
	}
	//-----------------------------------------------------------------
	// toString: Eclipse no incluye en el toString los atributos de la superclase y se los tenemos que 
	//  agregar manualmente con "nombreVariable=" + this.getNombreVariable()
	//-----------------------------------------------------------------
	@Override
	public String toString() {
		return "Pelicula [nombre=" + this.getNombre() + ", calificacion= "+ this.getCalificacion() 
		+ ", genero=" + genero + ", publicacion=" + publicacion + ", director=" + director + "]";
	}
}
