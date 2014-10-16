import java.util.Calendar;
import java.util.HashMap;


public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void registraDivida( double valor, String credor, String cnpjPagador )
	{
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjPagador);
		
		dividas.put(cnpjPagador, divida);
	}
	
	public void pagaDivida( String pagador, String cnpjPagador, double valor )
	{	
		if ( dividas.containsKey(cnpjPagador) )
		{
			Divida divida = dividas.get( cnpjPagador );
			divida.registra( new Pagamento(valor, pagador, cnpjPagador, Calendar.getInstance()) );
		}
		else
			throw new IllegalArgumentException("CNPJ do pagador Ž inexistente.");
	}
	
}
