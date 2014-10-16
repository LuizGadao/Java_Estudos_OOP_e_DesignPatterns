package acoplamento;

import java.util.List;


public class GeradorDeNotaFiscal 
{

	

	//private EnviadorDeEmail enviadorDeEmail;
	//private NotaFiscalDAO notaFiscalDao;
	private List<IAcaoAposGerarNota> acoes;
	
	public GeradorDeNotaFiscal(List<IAcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}
	
	/*
	public GeradorDeNotaFiscal( EnviadorDeEmail enviadorEmail, NotaFiscalDAO dao ) {
	
		this.enviadorDeEmail = enviadorEmail;
		this.notaFiscalDao = dao;
	}*/
	
	public NotaFiscal gera( Fatura fatura )
	{	
		NotaFiscal nf = new NotaFiscal( fatura.getValor(), calcImposto(fatura.getValor()) );
		
		for( IAcaoAposGerarNota acao : acoes )
			acao.executa( nf );
		
		//enviadorDeEmail.enviaEmail(nf);
		//notaFiscalDao.persiste(nf);
		return nf;
	}
	
	private double calcImposto( double valor )
	{
		return valor * 0.52;
	}
	
	
}
