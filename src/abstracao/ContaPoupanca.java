package abstracao;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		//super.atualiza(taxa * 3);
		
		this.saldo += this.saldo * ( taxa * 3 );
	}

}
