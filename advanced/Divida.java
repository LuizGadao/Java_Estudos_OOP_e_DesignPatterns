
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Divida {
	
	private double total;
	private String credor;
	private Cnpj cnpjCredor;
	//private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private Pagamentos pagamentos = new Pagamentos();
	
	public Divida() {
		super();
	}

	public Divida( double valor, String credor, String cnpjCredor) {
		this.total = valor;
		this.credor = credor;
		
		this.cnpjCredor = new Cnpj();
		this.cnpjCredor.setCnpjCredo( cnpjCredor );
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getValorPago() {
		return pagamentos.getTotalPago();
	}
	
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	
	public String getCnpjCredor() {
		return cnpjCredor.toString();
	}
	
	public void setCnpjCredor(String cnpjCredor) {
		if ( this.cnpjCredor == null )
			this.cnpjCredor = new Cnpj();
		
		this.cnpjCredor.setCnpjCredo( cnpjCredor );
	}
	
	public List<Pagamento> getPagamentos() {
		return pagamentos.getTodosPagamentos();
	}
	
	public void registra( Pagamento pagamento )
	{
		pagamentos.adicionaPagamento( pagamento );
	}
}
