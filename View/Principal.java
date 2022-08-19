package View;

import Controller.Somatoria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Somatoria somatoria = new Somatoria();
		
		int numero = 5;
		
		double resultado = somatoria.SomatoriaTotal(numero);
		
		System.out.println(resultado);
	}

}
