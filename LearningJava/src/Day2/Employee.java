package Day2;

public class Employee {
	private int salary;
	private int bonus;
	public Employee(int s, int b){
		this.salary=s;
		this.bonus=b;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void cal() {
		System.out.println(salary+bonus);
	}
}
