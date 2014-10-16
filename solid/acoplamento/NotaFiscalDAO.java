package acoplamento;

public class NotaFiscalDAO implements IAcaoAposGerarNota {
	public void executa( NotaFiscal nf )
	{
		System.out.println( "persiste nf, valor: " + nf.getValor() );
	}
}
