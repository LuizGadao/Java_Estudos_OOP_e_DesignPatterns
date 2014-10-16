package trycatch;

import trycatch.ContaPoupanca;;

public class TestTryCatch {

	public static void main(String[] args) {
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.deposita(100);
		//contaPoupanca.deposita(-5);
		//contaPoupanca.saca(1000);
		
		try {
			contaPoupanca.deposita(-5);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage() + "--valor: " + e.getValue());
		}
		
		try {
			contaPoupanca.saca(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage() + "--valor: " + e.getValue());
		}
		
		
		
		System.out.println("saldo: " + contaPoupanca.getSaldo());
	}

}
