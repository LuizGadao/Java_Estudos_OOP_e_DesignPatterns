package srp;


public enum JobTitle {
	DEVELOPER( new CalcSalaryDeveloper() ),
	DATABASE( new CalcSalaryDatabase() ),
	TESTER( new CalcSalaryDatabase() );
	
	private ICalcSalary ruleCalcSalary;
	
	JobTitle( ICalcSalary rCalcSalary )
	{
		this.ruleCalcSalary = rCalcSalary;
	}
	
	public ICalcSalary getRuleCalcSalary()
	{
		return this.ruleCalcSalary;
	}
	
}
