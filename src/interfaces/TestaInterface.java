package interfaces;

public class TestaInterface {

	public static void main(String[] args) {
		
		AreaCalculavel[] shapes = new AreaCalculavel[3];
		shapes[0] = new Quadrado(4);
		shapes[1] = new Triangulo(10, 7);
		shapes[2] = new Circulo(10);
		
		for( AreaCalculavel a : shapes )
			System.out.println( "calculo area: " + a.calculaArea() );
		
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100000);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		GerenciadorDeImposto gerenciadorDeImposto = new GerenciadorDeImposto();
		gerenciadorDeImposto.addTributo( cc );
		gerenciadorDeImposto.addTributo( seguroDeVida );
		
		System.out.printf("Total de tributos: %.2f", gerenciadorDeImposto.getTotal() );
		
		
	}

}
