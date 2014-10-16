
public class Cnpj {
	
	private String cnpjCredor;
	
	public Cnpj() {
		super();
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredo(String cnpjCredo) {
		this.cnpjCredor = ehValido( cnpjCredo );
	}
	
	private String ehValido(String cnpj ) {
		
		if ( cnpj.length() < 5 )
			throw new IllegalArgumentException("CNPJ INVçLIDO.");
		
		return cnpj;
	}
	
	@Override
	public String toString() {
		return this.cnpjCredor;
	}

}
