package lsp;

public class ContaEstudante {
	
	private ManipuladorDeSaldo manipuladorDeSaldo;

	public ContaEstudante( double saldo ) {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo(saldo);
	}
	
	public void deposita( double valor )
	{
		this.manipuladorDeSaldo.deposita(valor);
	}
	
	public void saque( double valor )
	{
		this.manipuladorDeSaldo.saque(valor);
	}
	
	//nao é necessario implementar esse método.
	/*
	public void rende()
	{
		this.manipuladorDeSaldo.rende(0);
	}
	*/

}
