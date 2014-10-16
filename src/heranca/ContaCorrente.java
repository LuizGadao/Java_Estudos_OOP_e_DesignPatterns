package heranca;

public class ContaCorrente extends Conta {


	@Override
	public boolean deposita(double valor) {
		return super.deposita( valor - 0.1 );
	}

	@Override
	public boolean saca(double valor) {
		return super.saca( valor );
	}

	@Override
	public void atualiza(double taxa) {
		// duas vezes o valor da taxa.
		super.atualiza( taxa * 2 );
		//poderia ser
		//this.saldo += this.saldo * ( taxa * 2 );
	}

}
