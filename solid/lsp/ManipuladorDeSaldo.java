package lsp;

public class ManipuladorDeSaldo {

	private double saldo;
	
	public ManipuladorDeSaldo() {
		super();
	}
	
	public ManipuladorDeSaldo(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void deposita(double valor)
	{
		if (valor > 0)
			this.saldo += valor;
	}
	
	public void saque( double valor )
	{
		if ( valor <= saldo )
			this.saldo -= valor;
	}
	
	public void rende( double porcentagem )
	{
		this.saldo += this.saldo * porcentagem;
	}
	
	public double getSaldo(){ return this.saldo; } 
	
	

}
