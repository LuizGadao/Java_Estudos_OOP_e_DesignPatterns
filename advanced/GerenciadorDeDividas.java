import java.util.Calendar;


public class GerenciadorDeDividas {
	
	public void efetuaPagamento( Divida divida, String pagador, String cnpjPagador, double valor )
	{
		Calendar calendar = Calendar.getInstance();
		
		divida.registra( new Pagamento(valor, pagador, cnpjPagador, calendar) );
	}

}
