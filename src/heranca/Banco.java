package heranca;

import java.util.ArrayList;

public class Banco 
{
	private ArrayList<Conta> contas = new ArrayList<Conta>();

	public Banco(){}
	
	public Banco(ArrayList<Conta> contas) {
		super();
		this.contas = contas;
	}
	
	public void addConta( Conta newConta )
	{
		this.contas.add( newConta );
	}
	
	public void addVariasContas( ArrayList<Conta> newContas )
	{
		for( Conta conta : newContas )
			this.contas.add( conta );
	}
	
	public Conta getConta( int value )
	{
		return this.contas.get( value );
	}
	
	public ArrayList<Conta> getContas(){ return contas; } 
	
	public int getTotalDeContas(){ 
		return this.contas.size(); 
	}
	
	
}
