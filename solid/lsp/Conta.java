package lsp;

public class Conta {
	
	protected double saldo;
	
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

}
