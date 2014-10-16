package trycatch;

public class ValorInvalidoException extends RuntimeException {

	
	private double value;
	
	public ValorInvalidoException(String arg0, double value) {
		super(arg0);
		this.value = value;
	}
	
	public double getValue(){ return this.value; }

}
