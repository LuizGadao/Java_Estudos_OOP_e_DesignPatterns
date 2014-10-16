package srp;

public class Main {

	public static void main(String[] args) {
		
		Worker developer = new Worker("Luiz", "08227801609", 1000, JobTitle.DEVELOPER);
		Worker database = new Worker("Luiz", "08227801609", 1000, JobTitle.DATABASE);
		
		//calcular salarios.
		System.out.printf( "developer: %.2f\n", developer.getJobTitle().getRuleCalcSalary().calcSalary( developer.getSalary() ) );
		//apenas chame calcSalary, uma maneira mais elegante.
		System.out.printf( "database: %.2f\n ", database.calcSalary() );
		
		//CalcSalary calcSalary = new CalcSalary();
		//System.out.printf( "developer: %.2f\n", calcSalary.calc( developer ) );
		//System.out.printf( "database: %.2f\n ", calcSalary.calc( database ) );
		

	}

}
