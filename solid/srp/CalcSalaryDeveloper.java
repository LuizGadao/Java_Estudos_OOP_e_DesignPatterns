package srp;

public class CalcSalaryDeveloper implements ICalcSalary {

	@Override
	public double calcSalary(double valueSalary) {
		if ( valueSalary > 3000 )
			return valueSalary * 0.8;
		else
			return valueSalary * 0.85;
	}

}
