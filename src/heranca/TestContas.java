package heranca;

import java.util.ArrayList;

public class TestContas {

	public static void main(String[] args) {
		
		ArrayList<Conta> contas  = new ArrayList<Conta>();
		contas.add( new Conta( 1000 ) );
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(1000);
		
		contas.add( cc );
		contas.add( cp );
		
		Banco banco = new Banco();
		banco.addVariasContas( contas );
		
		AtualizadorDeContas atualizador = new AtualizadorDeContas( 0.1 );
		
		for( Conta conta : banco.getContas() )
		{
			//conta.atualiza(0.1);
			atualizador.update( conta );
			System.out.println( "saldo " + conta.getSaldo() );
		}
		
		System.out.println( "Salto total: " + atualizador.getTotal() );
		System.out.println( String.format("total de juros pago: %.2f", atualizador.getTotalJuros() ) );
	}

}
