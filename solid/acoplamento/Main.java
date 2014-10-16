package acoplamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<IAcaoAposGerarNota> listAcoes = new ArrayList<IAcaoAposGerarNota>();
		listAcoes.add( new EnviadorDeEmail() );
		listAcoes.add(  new NotaFiscalDAO() );
		
		GeradorDeNotaFiscal geradorDeNotaFiscal; 
		geradorDeNotaFiscal = new GeradorDeNotaFiscal( listAcoes );
		//geradorDeNotaFiscal = new GeradorDeNotaFiscal( new EnviadorDeEmail(), new NotaFiscalDAO());
		
		NotaFiscal nf = geradorDeNotaFiscal.gera( new Fatura(10000) );
		
		System.out.println(nf);
		
	}

}
