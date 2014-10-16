package heranca;

public class Conta {
	
	protected double saldo;
	
	public Conta(){};
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public boolean deposita( double valor )
	{
		if ( valor > 0 )
		{
			this.saldo += valor; 
			return true;
		}
		
		return false;
	}
	
	public boolean saca( double valor )
	{
		if ( saldo > valor )
		{
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public void atualiza( double taxa )
	{
		this.saldo += this.saldo * taxa;
	}
	
	public double getSaldo(){ return this.saldo; } 

}
