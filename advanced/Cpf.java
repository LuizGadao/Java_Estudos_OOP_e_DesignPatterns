
public class Cpf implements IDocumentos {
	
	private String cpf;
	
	public Cpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean ehValido(String valor) {
		if ( valor.length() < 11 )
			return false;
		
		return true;
	}

	@Override
	public String getValor() {
		return cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( !( obj instanceof Cpf ) )
			return false;
		else if ( ! ( obj.toString().equals( this.cpf ) ) )
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.cpf.hashCode();
	}

}
