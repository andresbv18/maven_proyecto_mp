package Prubas.del.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	  static Scanner sc = new Scanner(System.in);
	  
	  //Se crea un ArrayList para guardar objetos de tipo Coche.
	     static ArrayList<Coche> coches = new ArrayList();
	     
	     //m�todo main
	     public static void main(String[] args) {
	         leerCoches();
	         System.out.println("\nCoches introducidos:");
	         mostrarCoches();
//	         mostrarPorMarca();
//	         mostrarPorKm();
//	         System.out.println("\nCoche con mayor n�mero de Km: " + mostrarMayorKm());                                
//	         System.out.println("\nCoches ordenados de menor a mayor n�mero de Km");
//	         mostrarOrdenadosPorKm();
	     } //fin m�todo main
	    
	     //M�todo para leer coches e introducirlos en el array
	     public static void leerCoches(){
	  
	         //Declaraci�n de variables para leer los datos de los coches
	         String matricula;
	         String marca;
	         String modelo;
	         int Km;
	   
	         //Variable auxiliar que contendr� la referencia a cada coche nuevo.
	         Coche aux;
	         int i, N;
	   
	         //se pide por teclado el n�mero de coches a leer
	         do {
	             System.out.print("N�mero de coches? ");
	             N = sc.nextInt();
	         } while (N < 0);
	         sc.nextLine(); //limpiar el intro
	   
	         //lectura de N coches
	         for (i = 1; i <= N; i++) {
	             //leer datos de cada coche
	             System.out.println("Coche " + i);
	             System.out.print("Matr�cula: ");
	             matricula = sc.nextLine();          
	             System.out.print("Marca: ");
	             marca = sc.nextLine();
	             System.out.print("Modelo: ");
	             modelo = sc.nextLine();
	             System.out.print("N�mero de Kil�metros: ");
	             Km = sc.nextInt();
	             sc.nextLine(); //limpiar el intro
	    
	             aux = new Coche(); //Se crea un objeto Coche y se asigna su referencia a aux                          
	    
	             //se asignan valores a los atributos del nuevo objeto
	             aux.setMatricula(matricula);
	             aux.setMarca(marca);
	             aux.setModelo(modelo);
	             aux.setKm(Km);
	                       
	             //se a�ade el objeto al final del array
	             coches.add(aux);
	         }
	     } //fin m�todo leerCoches()
	     public static void mostrarCoches(){      
	         for(int i = 0; i< coches.size(); i++)
	             System.out.println(coches.get(i));  //se invoca el m�todo toString de la clase Coche     
	     }}
//	     }//M�todo para mostrar todos los coches de una marca que se pide por teclado                                   
//	     public static void mostrarPorMarca(){
//	         String marca;
//	         System.out.print("Introduce marca: ");
//	         marca = sc.nextLine();
//	         System.out.println("Coches de la marca " + marca);
//	         for(int i = 0; i < coches.size(); i++){
//	             if(coches.get(i).getMarca().equalsIgnoreCase(marca))
//	                 System.out.println(coches.get(i));
//	         }
//	     } //M�todo para mostrar todos los coches con un n�mero de Km inferior                                           
//	     //al n�mero de Km que se pide por teclado
//	     public static void mostrarPorKm(){
//	         int Km;
//	         System.out.print("Introduce n�mero de kil�metros: ");
//	         Km = sc.nextInt();
//	         System.out.println("Coches con menos de " + Km + " Km");
//	         for(int i = 0; i < coches.size(); i++){
//	             if(coches.get(i).getKm() < Km)
//	                 System.out.println(coches.get(i));
//	         }
//	     } //M�todo que devuelve el Coche con mayor n�mero de Km                                                         
//	     public static Coche mostrarMayorKm(){
//	         Coche mayor = coches.get(0);
//	         for(int i = 0; i < coches.size(); i++){
//	             if(coches.get(i).getKm() > mayor.getKm())
//	                 mayor = coches.get(i);
//	         }
//	         return mayor;
//	     }  //M�todo que muestra los coches ordenados por n�mero de Km de menor a mayor                                   
//	     public static void mostrarOrdenadosPorKm(){
//	         int i, j;
//	         Coche aux;
//	         for(i = 0; i < coches.size()-1; i++)
//	             for(j=0; j < coches.size()-i-1; j++)
//	                 if(coches.get(j+1).getKm() < coches.get(j).getKm()){
//	                     aux = coches.get(j+1);
//	                     coches.set(j+1, coches.get(j));
//	                     coches.set(j, aux);                
//	                 }
//	         mostrarCoches();
//	     }
//	 } //fin de la clase principal
