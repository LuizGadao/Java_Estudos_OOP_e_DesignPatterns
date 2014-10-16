import java.util.Calendar;


public class Pagamento {
	private double valor;
	private String pagador;
	private Cnpj cnpj;
	private Calendar data;
	
	public Pagamento() {
		super();
	}

	public Pagamento(double valor, String pagador, String cnpjPagador, Calendar data) {
		this.valor = valor;
		this.pagador = pagador;
		
		this.cnpj = new Cnpj();
		this.cnpj.setCnpjCredo(cnpjPagador);
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
	
	public String getCnpj() {
		return cnpj.getCnpjCredor();
	}
	
	public void setCnpj(String cnpjPagador) {
		if ( this.cnpj == null )
			this.cnpj = new Cnpj();
		
		this.cnpj.setCnpjCredo(cnpjPagador);
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
}
