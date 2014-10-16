package interfaces;

import java.util.ArrayList;

public class GerenciadorDeImposto 
{
	
	private double total;
	//private ArrayList<Tributavel> tributos;
	
	public GerenciadorDeImposto() {
		//tributos = new ArrayList<Tributavel>();
	}
	
	public void addTributo( Tributavel tributo )
	{
		//tributos.add( tributo );
		total += tributo.calculaTributos();
	}

	public double getTotal() {
		return total;
	}
	
}
