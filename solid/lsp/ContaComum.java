package lsp;

public class ContaComum 
{
	
	private ManipuladorDeSaldo manipuladorDeSaldo;

	public ContaComum() {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}
	
	public ContaComum( double valor )
	{
		this.manipuladorDeSaldo = new ManipuladorDeSaldo(valor);
	}
	
	public void saque( double valor )
	{
		double taxa = 0.10;
		this.manipuladorDeSaldo.saque(valor + taxa);
	}
	
	public void deposita( double valor )
	{
		this.manipuladorDeSaldo.deposita(valor);
	}
	
	public void rende()
	{
		this.manipuladorDeSaldo.rende(0.1);
	}
	
	public double getSaldo(){ return this.manipuladorDeSaldo.getSaldo(); }

}
