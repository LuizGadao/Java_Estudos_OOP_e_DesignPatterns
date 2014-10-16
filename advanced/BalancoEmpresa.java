import java.util.Calendar;
import java.util.HashMap;


public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void registraDivida( double valor, String credor, IDocumentos documento )
	{
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setDocumento( documento );
		
		dividas.put( documento.getValor(), divida);
	}
	
	public void pagaDivida( String pagador, IDocumentos documento, double valor )
	{	
		if ( dividas.containsKey(documento) )
		{
			Divida divida = dividas.get( documento );
			divida.registra( new Pagamento(valor, pagador, documento, Calendar.getInstance()) );
		}
		else
			throw new IllegalArgumentException("CNPJ do pagador Ž inexistente.");
	}
	
}
