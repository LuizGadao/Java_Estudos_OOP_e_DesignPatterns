package interfaces;

public class Triangulo implements AreaCalculavel {
	
	private double altura;
	private double largura;

	public Triangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double calculaArea() {
		return altura * largura;
	}

}
