package heranca;

public class AtualizadorDeContas 
{
	private double selic;
	private double total;
	private double totalJuros;
	
	public AtualizadorDeContas(double selic) {
		super();
		this.selic = selic;
	}
	
	public void update( Conta conta )
	{
		double saldoAntigo = conta.saldo;
		conta.atualiza( selic );
		total += conta.getSaldo();
		totalJuros +=  conta.saldo - saldoAntigo;
	}

	public double getTotal() {
		return total;
	}

	public double getTotalJuros() {
		return totalJuros;
	}
	
}
