import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;


public class Pagamentos {
	
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private double valorPago;

	public Pagamentos() {
		super();
	}
	
	public void adicionaPagamento( Pagamento pg )
	{
		this.paga( pg.getValor() );
		this.pagamentos.add( pg );
	}
	
	public void adicionaPagamento( Pagamento pg, Double valorTotalDivida )
	{
		// Ž o valor total da divida, menos o valor que foi pago.
		double valorRestanteDivida = valorTotalDivida - valorPago;
		// calcula a taxa sobre o valor que vai ser pago, se o valor a ser pago Ž > 100 a taxa Ž de 8.
		valorRestanteDivida += calculaTaxa( pg.getValor() );
		
		//calculo do troco a ser retornardo ao cliente.
		double troco = pg.getValor() - valorRestanteDivida;
		
		//o valor que realmente dever ser pago.
		//se o valor restante da divida Ž maior que o valor do pagamento, pega todo valor do pagamento.
		//caso contr‡rio, pega apenas o valor que dever ser pago.
		double valorAserPago = valorRestanteDivida >= pg.getValor() ? pg.getValor() : valorRestanteDivida;
		
		//abate o valor da taxa no valor a ser pago.
		valorAserPago -= calculaTaxa( valorAserPago );
		
		if ( valorRestanteDivida <= 0 )
		{
			throw new IllegalArgumentException("Divida j‡ foi completamente paga.");
		}
		else if ( troco > 0 )
		{
			System.out.println( String.format("Devolve %s de troco para o cliente.\n", Utils.formatarParaReais( troco )) );
		}
		
		this.paga( valorAserPago );
		this.pagamentos.add( pg );
	}
	
	public ArrayList<Pagamento> getPagamentosAntesDe( Calendar date )
	{
		ArrayList<Pagamento> pgs = new ArrayList<Pagamento>();
		for (Pagamento pagamento : pagamentos) {
			if ( pagamento.getData().before( date ) )
				pgs.add( pagamento );
		}
		
		return pgs;
	}
	
	public ArrayList<Pagamento> getPagamentosPorCnpj( String cnpj )
	{
		ArrayList<Pagamento> pgs = new ArrayList<Pagamento>();
		for (Pagamento pagamento : pagamentos) {
			if ( pagamento.getDocumento().equals( cnpj ) )
				pgs.add( pagamento );
		}
		
		return pgs;
	}
	
	public ArrayList<Pagamento> getPagamentosMaiorQue( double valor )
	{
		ArrayList<Pagamento> pgs = new ArrayList<Pagamento>();
		for (Pagamento pagamento : pagamentos) {
			if ( pagamento.getValor() > valor )
				pgs.add( pagamento );
		}
		
		return pgs;
	}
	
	public double getTotalPago(){ return this.valorPago; }
	
	private double calculaTaxa( double valor )
	{
		return valor > 100 ? 8 : 0;
	}
	
	private void paga( double valor )
	{
		if ( valor <= 0 )
			throw new IllegalArgumentException("valor inv‡lido");
		
		this.valorPago += valor;
	}
	
	public List<Pagamento> getTodosPagamentos() {
		return Collections.unmodifiableList( pagamentos );
	}
	
	public boolean foiPago( Pagamento pg )
	{
		return this.pagamentos.contains( pg );
	}

}
