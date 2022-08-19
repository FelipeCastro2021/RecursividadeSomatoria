package Controller;

public class Somatoria {

	public Somatoria() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double SomatoriaTotal(int numero) {
		if (numero == 1) {
			return 1.0;
		} else {
			double divisao = (1.0 / numero);
			return SomatoriaTotal(numero - 1) + divisao;
		}
	}
}
