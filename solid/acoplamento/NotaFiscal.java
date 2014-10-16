package acoplamento;

public class NotaFiscal 
{
	private double valor;
	private double imposto;
	
	public NotaFiscal(double valor, double imposto) {
		this.valor = valor;
		this.imposto = imposto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	@Override
	public String toString() {
		return String.format("valor da nota: %.2f imposto: %.2f", valor, imposto );
	}

}
