import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


public class GerenciadorDeDividas {
	
	public void efetuaPagamento( Divida divida, String pagador, IDocumentos documento, double valor )
	{
		Calendar calendar = Calendar.getInstance();
		
		divida.registra( new Pagamento(valor, pagador, documento, calendar) );
		
	}

}
