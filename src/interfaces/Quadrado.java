package interfaces;

public class Quadrado implements AreaCalculavel {
	
	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
