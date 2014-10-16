
public class TestaPagamentos {
	
	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		
		Pagamento pg1 = new Pagamento();
		pg1.setValor(1000);
		
		Pagamento pg2 = new Pagamento();
		pg2.setValor(50);
		
		Pagamento pg3 = new Pagamento();
		pg2.setValor(50000);
		
		pagamentos.adicionaPagamento(pg1);
		pagamentos.adicionaPagamento(pg2);
		
		System.out.println("total: " + pagamentos.getTotalPago() );
		System.out.println("pg1 foi pago? " + (pagamentos.foiPago(pg1) ? "sim" : "n‹o") );
		System.out.println("pg3 foi pago? " + (pagamentos.foiPago(pg3) ? "sim" : "n‹o") );
	}

}
