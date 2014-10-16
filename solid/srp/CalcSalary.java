package srp;

public class CalcSalary {
	
	public double calc( Worker worker )
	{
		//essa classes n‹o para de crecer nunca, para cada tipo de funcion‡rio  necessario criar um if.
		
		// agora com a refatoracao n‹o faz mais sentido ter essas classe.
		return worker.getJobTitle().getRuleCalcSalary().calcSalary( worker.getSalary() );
		
		/*
		if ( worker.getJobTitle().equals( JobTitle.DEVELOPER ) )
			return new CalcSalaryDeveloper().calcSalary( worker.getSalary() );  //calcSalaryDeveloper( worker.getSalary() );
		else if ( worker.getJobTitle().equals( JobTitle.DATABASE ) || worker.getJobTitle().equals( JobTitle.TESTER ) )
			return new CalcSalaryDatabase().calcSalary( worker.getSalary() ); //calcSalaryDatabase( worker.getSalary() );
		
		
		throw new RuntimeException( "funcion‡rio inv‡lido." );
		*/
	}

	/*
	private double calcSalaryDatabase(double salary) {
		if ( salary > 2000 )
			return salary * 0.85;
		else
			return salary * 0.9;
	}

	private double calcSalaryDeveloper(double salary) {
		if ( salary > 3000 )
			return salary * 0.8;
		else
			return salary * 0.85;
	}
	*/

}
