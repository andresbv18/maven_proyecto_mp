package deber.nonaccess.finall;

public class Circulo extends Figura {

	public final double pi = 3.14;

	public Circulo() {
		// No se puede reasignar un valor a un atributo final
		pi = 3.15;
	}
}