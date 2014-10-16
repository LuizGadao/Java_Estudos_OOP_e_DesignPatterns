import java.util.Calendar;


public class Pagamento {
	private double valor;
	private String pagador;
	private IDocumentos documento;
	private Calendar data;
	
	public Pagamento() {
		super();
	}

	public Pagamento(double valor, String pagador, IDocumentos documento, Calendar data) {
		this.valor = valor;
		this.pagador = pagador;
		
		this.documento = documento;
		this.data = data;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getPagador() {
		return pagador;
	}
	
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	
	public IDocumentos getDocumento() {
		return documento;
	}
	
	public void setDocumento(IDocumentos documento) {
		this.documento = documento;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
}
