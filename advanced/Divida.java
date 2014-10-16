
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Divida {
	
	private double total;
	private String credor;
	private IDocumentos documento;
	//private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private Pagamentos pagamentos = new Pagamentos();
	
	public Divida() {
		super();
	}

	public Divida( double valor, String credor, IDocumentos documento ) {
		this.total = valor;
		this.credor = credor;
		
		this.documento = documento;
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
	
	public IDocumentos getDocumento() {
		return documento;
	}
	
	public void setDocumento(IDocumentos documento) {
		this.documento = documento;
	}
	
	public List<Pagamento> getPagamentos() {
		return pagamentos.getTodosPagamentos();
	}
	
	public void registra( Pagamento pagamento )
	{
		pagamentos.adicionaPagamento( pagamento, total );
	}
}
