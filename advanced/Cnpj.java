
public class Cnpj implements IDocumentos {
	
	private String cnpjCredor;
	
	public Cnpj() {
		super();
	}
	
	public Cnpj(String cnpj) {
		setCnpjCredo( cnpj );
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredo(String cnpj) {
		if ( ehValido( cnpj ) )
			this.cnpjCredor = cnpj;
	}
	
	@Override
	public String toString() {
		return this.cnpjCredor;
	}

	@Override
	public boolean ehValido( String cnpj ) {
		if ( cnpj.length() < 5 )
			throw new IllegalArgumentException("CNPJ INVçLIDO.");
		
		return true;
	}
	
	@Override
	public String getValor() {
		return this.cnpjCredor;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( ! (obj instanceof Cnpj) )
			return false;
		else if ( ! obj.toString().equals( this.cnpjCredor ) )
			return false;
			
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.cnpjCredor.hashCode();
	}

	

}
