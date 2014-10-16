package srp;

public class CalcSalaryDatabase implements ICalcSalary {

	@Override
	public double calcSalary(double valueSalary) {
		if ( valueSalary > 2000 )
			return valueSalary * 0.85;
		else
			return valueSalary * 0.9;
	}

}
