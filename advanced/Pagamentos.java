import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;


public class Pagamentos {
	
	private ArrayList<Pagamento> _pagamentos = new ArrayList<Pagamento>();
	private double valorPago;

	public Pagamentos() {
		super();
	}
	
	public void adicionaPagamento( Pagamento pg )
	{
		this.paga( pg.getValor() );
		this._pagamentos.add( pg );
	}
	
	public ArrayList<Pagamento> getPagamentosAntesDe( Calendar date )
	{
		ArrayList<Pagamento> pgs = new ArrayList<Pagamento>();
		for (Pagamento pagamento : _pagamentos) {
			if ( pagamento.getData().before( date ) )
				pgs.add( pagamento );
		}
		
		return pgs;
	}
	
	public ArrayList<Pagamento> getPagamentosPorCnpj( String cnpj )
	{
		ArrayList<Pagamento> pgs = new ArrayList<Pagamento>();
		for (Pagamento pagamento : _pagamentos) {
			if ( pagamento.getCnpj().equals( cnpj ) )
				pgs.add( pagamento );
		}
		
		return pgs;
	}
	
	public ArrayList<Pagamento> getPagamentosMaiorQue( double valor )
	{
		ArrayList<Pagamento> pgs = new ArrayList<Pagamento>();
		for (Pagamento pagamento : _pagamentos) {
			if ( pagamento.getValor() > valor )
				pgs.add( pagamento );
		}
		
		return pgs;
	}
	
	public double getTotalPago(){ return this.valorPago; }
	
	private void paga( double valor )
	{
		if ( valor <= 0 )
			throw new IllegalArgumentException("valor inv‡lido");
		
		if ( valor > 100 )
			valor -= 8;
		
		this.valorPago += valor;
	}
	
	public List<Pagamento> getTodosPagamentos() {
		return Collections.unmodifiableList( _pagamentos );
	}
	
	public boolean foiPago( Pagamento pg )
	{
		return this._pagamentos.contains( pg );
	}

}
