
public class RelatorioDeDivida {
	
	Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio()
	{
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Documento: " + divida.getDocumento());
		System.out.println("Valor da divida: " + Utils.formatarParaReais( divida.getTotal() ) );
		System.out.println( String.format("Valor pago: %s \n", Utils.formatarParaReais( divida.getValorPago() ) ) );
	}
	
	public static void main(String[] args) {
		
		Divida  divida = new Divida(10000, "Luiz Carlos", new Cnpj("00.000.002/00002-02") );
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		
		Pagamento pg1 = new Pagamento();
		pg1.setValor(2000);
		pg1.setPagador("M‹e");
		pg1.setDocumento( new Cpf( "255.369.558-89" ) );
		
		divida.registra(pg1);
		relatorioDeDivida.geraRelatorio();
		
		Pagamento pg2 = new Pagamento();
		pg2.setValor(6000);
		pg2.setPagador("Pai");
		pg2.setDocumento( new Cpf( "255.369.558-99" ) );
		
		divida.registra(pg2);
		relatorioDeDivida.geraRelatorio();
		
		Pagamento pg3 = new Pagamento();
		pg3.setValor(2100);
		pg3.setPagador("Pai");
		pg3.setDocumento( new Cpf( "255.369.558-99" ) );
		
		divida.registra(pg3);
		relatorioDeDivida.geraRelatorio();
	}

}
