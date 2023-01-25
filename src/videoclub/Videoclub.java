package videoclub;

import java.util.ArrayList;
import java.util.Scanner;

public class Videoclub 
{
	public static void main(String[] args) 
	{
		/* Creamos un ArrayList vacio llamado listaPrestamos, que ordena nuestra clase Prestamo. */
		ArrayList<Prestamo> listaPrestamos = new ArrayList<Prestamo>();  
																		
		Scanner scan = new Scanner(System.in);		
		int iterar = 1;
		
		while (iterar==1)	// Creamos un bucle infinito con un menu con opciones, incluida salir del bucle).
		{
			System.out.println("\nMenu de Prestamos del Videoclub: \n");
			System.out.println("\t1. Prestar una pelicula: ");			
			System.out.println("\t2. Prestar un videojuego");			
			System.out.println("\t3. Ver los prestamos realizados");		
			System.out.println("\t4. Borrar un prestamo");		
			System.out.println("\t5. Salir de la aplicacion");	
			System.out.println();	
			System.out.print("Introduce una opcion: ");
			
			int opcion = scan.nextInt();	// Introducimos la opcion.
			
			switch (opcion)		// Creamos el menu con las 5 opciones:
			{
				case 1:
				{
					System.out.println();	// Metemos todos los atributos del objeto Pelicula:					
					System.out.println("Prestar una pelicula: ");					
					System.out.println(" -Nombre: ");	// nombre (del elemento padre Contenido).					
					String nombre = scan.next();					
					System.out.println(" -Calificacion: ");	// calificacion (del elemento padre Contenido).					
					int calificacion = scan.nextInt();					
					System.out.println(" -Genero: ");	// genero					
					String genero = scan.next();					
					System.out.println(" -Publicacion: ");	// publicacion					
					int publicacion = scan.nextInt();					
					System.out.println(" -Director: ");	// y director.					
					scan = new Scanner(System.in);		// Usaremos un nuevo Scanner antes de cada nuevo nextLine que usemos,
					String director = scan.nextLine(); // para que no de error (nextLine imprime una cadena de mas de una palabra).
					
					// Creamos el objeto "pelicula", pasandole con el constructor todos los atributos introducidos.	
					Pelicula pelicula = new Pelicula (nombre, calificacion, genero, publicacion, director); 					
									
					System.out.println("A quien le prestamos la pelicula?");					
					String persona = scan.next();	// Metemos el otro atributo de la clase Prestamo: persona.
					
					Prestamo prestamo = new Prestamo(pelicula, persona); 
					
					/* Creamos el objeto "prestamo", pasandole con el constructor sus atributos introducidos:
					   el de tipo Contenido (en este caso, el objeto pelicula) y persona. */
					
					listaPrestamos.add(prestamo);	// Y con el metodo add, lo agregamos a la lista.					
					break;
				}
			
				case 2:
				{
					System.out.println();	// Metemos todos los atributos del objeto Videojuego:					
					System.out.println("Prestar un videojuego: ");					
					System.out.println(" -Nombre: ");	// nombre (del elemento padre Contenido).				
					String nombre = scan.next();					
					System.out.println(" -Calificacion: ");	// calificacion (del elemento padre Contenido).					
					int calificacion = scan.nextInt();					
					System.out.println(" -Genero: ");	// genero					
					String genero = scan.next();					
					System.out.println(" -Plataforma: ");	// y plataforma.					
					String plataforma = scan.next();
					
					// Creamos el objeto "videojuego", pasandole con el constructor todos los atributos introducidos.
					Videojuego videojuego = new Videojuego (nombre, calificacion, genero, plataforma);					
									
					System.out.println("A quien le prestamos el videojuego?");					
					String persona = scan.next();	// Metemos el otro atributo de la clase Prestamo: persona.
					
					Prestamo prestamo = new Prestamo(videojuego, persona); 
					
					/* Creamos el objeto "prestamo", pasandole con el constructor sus atributos introducidos:
					   el de tipo Contenido (en este caso, el objeto videojuego) y persona. */
					
					listaPrestamos.add(prestamo);	// Y con el metodo add, lo agregamos a la lista.
					break;
				}
				case 3:
				{
					// Imprimimos la lista con toString (convierte la lista en una cadena).
					System.out.println(listaPrestamos.toString());	
					break;
				}
				case 4:
				{
					try			// Usamos try (primera opcion, si encuentra la posicion)
					{
						System.out.println();
						System.out.println("Borrar un prestamo: ");
						System.out.println("-Indice a borrar: ");	// Indicamos y metemos con la variable "indice",  
						int indice = scan.nextInt();				// la posicion a borrar de la lista.
						
						listaPrestamos.remove(indice);	// Y con el metodo remove, la borramos de listaPrestamos.
						System.out.println("Prestamo borrado");
					}
					// Si no estuviera dicha posicion, lo indicamos con catch (Exception e), similar a un else.
					catch (Exception e)	
					{
						System.out.println("Este prestamo no existe en la lista");	
					}					
					break;
				}
				case 5:
				{
					iterar=0;	// Y con la opcion 5, cambiamos la variable del bucle infinito y salimos de este y del menu.				
					break;
				}				
				default: break;			
			}			
		}	
		scan.close();
	}
}