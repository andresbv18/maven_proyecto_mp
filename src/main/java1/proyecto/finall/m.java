package proyecto.finall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		// TODO Auto-generated method stub
		 List <Libro> libros=new ArrayList<Libro>();
		  //Se crea un ArrayList para guardar objetos de tipo Coche.
	
		     
		  
		       
		    
		     //Método para leer coches e introducirlos en el array
		
		  
		         //Declaración de variables para leer los datos de los coches
		         String codigo;
		         String nombre;
		         String autor;
		         int anyoPublicacion;
		         String editorial;
		         int cantidadPaginas;
		         int precio;
		         String codigoAutorizacion = null;
		         int tiempoAproxiLectura = 0;
		         
		   
		         //Variable auxiliar que contendrá la referencia a cada coche nuevo.
		         Libro aux;
		         int i, N;
		   
		         //se pide por teclado el número de coches a leer
		         do {
		             System.out.print("Número de libros? ");
		             N = entrada.nextInt();
		         } while (N < 0);
		         entrada.nextLine(); //limpiar el intro
		   
		         //lectura de N coches
		         for (i = 1; i <= N; i++) {
		             //leer datos de cada coche
		             System.out.println("Libro " + i);
		             System.out.print("Codigo: ");
		             codigo = entrada.nextLine();          
		             System.out.print("Nombre: ");
		             nombre= entrada.nextLine();
		             System.out.print("Autor: ");
		             autor = entrada.nextLine();
		             System.out.print("Año de puiblicacion: ");
		             anyoPublicacion= entrada.nextInt();
		             System.out.print("Editorial: ");
		             editorial = entrada.nextLine();
		             System.out.print(": ");
		             cantidadPaginas= entrada.nextInt();
		             System.out.print("Número de Kilómetros: ");
		             precio= entrada.nextInt();
		           
		             String opcion3;
		     		do {
		     			System.out.println("Escoja una opcion");
		     			System.out.println("1_realizar tranferencia");
		     			System.out.println("2.Consultar pagos");
		     			System.out.println("3.Salir\n");
		     			opcion3 = entrada.nextLine();

		     			if (opcion3.equals("1")) {
		     				System.out.println("");

		     			} else if (opcion3.equals("2")) {
		     				System.out.println("No existen pagos");

		     			}else if(opcion3.equals("3")) {
		     				System.out.println("Cerrando el sistema ");
		     			}

		     		} while (!opcion3.equals("3"));
		     		
		     		  entrada.nextLine(); //limpiar el intro
		             aux = new Libro(); //Se crea un objeto Coche y se asigna su referencia a aux                          
		    
		             //se asignan valores a los atributos del nuevo objeto
		             aux.setCodigo(codigoAutorizacion);
		           aux.setNombre(nombre);
		           aux.setAutor(codigoAutorizacion);
		           aux.setAnyoPublicacion(anyoPublicacion);
		           aux.setEditorial(editorial);
		           aux.setCantidadPaginas(cantidadPaginas);
		           aux.setPrecio(precio);
		           aux.setCodigoAutorizacion(codigoAutorizacion);
		           aux.setTiempoAproxiLectura(tiempoAproxiLectura);
		        
		                       
		             //se añade el objeto al final del array
		             libros.add(aux);
	}

	}
}
