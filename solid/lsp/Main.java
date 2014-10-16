package lsp;

public class Main {

	public static void main(String[] args) {
		
		ContaComum contaComum = new ContaComum(10000.0);
		showSaldo(contaComum.getSaldo());
		
		contaComum.saque(9000);
		showSaldo(contaComum.getSaldo());
		
		contaComum.rende();
		showSaldo(contaComum.getSaldo());

	}
	
	public static void showSaldo(double valor)
	{
		System.out.println( "saldo: " + valor );
	}

}
