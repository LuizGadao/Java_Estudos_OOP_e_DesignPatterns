package acoplamento;

public class EnviadorDeEmail implements IAcaoAposGerarNota {
	
	public void executa( NotaFiscal nf )
	{
		System.out.println( "email enviado, valor nota: " + nf.getValor() );
	}
}
