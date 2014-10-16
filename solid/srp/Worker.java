package srp;

public class Worker {
	private String name;
	private String cpf;
	private double salary;
	private JobTitle jobTitle;
	
	public Worker(){};
	
	public Worker(String name, String cpf, double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}
	
	public Worker(String name, String cpf, double salary, JobTitle jobTitle) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double calcSalary() {
		return this.jobTitle.getRuleCalcSalary().calcSalary( this.salary );
	}
	
	
	
}
