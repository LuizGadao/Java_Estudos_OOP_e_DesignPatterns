package trycatch;

public abstract class Conta {
	
	protected double saldo;
	
	public Conta(){};
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void deposita( double valor )
	{
		if ( valor < 0 )
			throw new ValorInvalidoException("O valor informado para deposito � negativo.", valor  );
		else
			saldo += valor;
	}
	
	public void saca( double valor )
	{
		if ( saldo < valor )
		{
			throw new ValorInvalidoException("O valor informado para saque � insuficiente.", valor ); 
		}
		else
			saldo -= valor;
	}
	
	public abstract void atualiza( double taxa );
	
	public double getSaldo(){ return this.saldo; } 

}
