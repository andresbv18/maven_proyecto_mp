package deber.nonaccess.finall;

//No se pude extender una clase final
public class TrianguloRectangulo extends Triangulo {
	// no se puede sobre escribir un metodo final del padre
	public void medirArea() {

		System.out.println("");
	}
}