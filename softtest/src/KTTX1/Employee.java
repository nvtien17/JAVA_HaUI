package KTTX1;

class Employee{
	String name;
	int hoursWorked;
	float hourlyRate;
	float tax;
	float grossPay;
	float netPay;
	
	public Employee(String name, int hoursWorked, float hourlyRate){
		this.name = name;
		this.hoursWorked = hoursWorked;
           this.hourlyRate= hourlyRate;
	}
	
	public String getName(){
		return name;
	}
	
	public void calculatePay(){
		int payableHours;
		
		if( hoursWorked <= 40){
			payableHours = hoursWorked;
		}else{
			payableHours = 40+(hoursWorked - 40)* 3/2;
		}
		
		//grossPay = hoursWorked * hourlyRate;
		grossPay = payableHours * hourlyRate;
//           if(grossPay >= 200){
//			tax = grossPay * 20/100;
//		}
           if(grossPay > 200){
   			tax = (grossPay - 200) * 20/100;
   		}
		
		netPay = grossPay - tax;
	}// end calculatePay()
    public static void main(String[] args) {
        Employee employee1 = new Employee("ADAMS", 35, 5.0f);
        Employee employee2 = new Employee("BAKER", 40, 5.0f);
        Employee employee3 = new Employee("CAIRNS", 44, 5.0f);
        Employee employee4 = new Employee("DONALD", 20, 6.0f);

        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "Test", "Name", "Hours", "Rate", "Gross", "Tax", "Net Pay");
        employee1.calculatePay();
        employee2.calculatePay();
        employee3.calculatePay();
        employee4.calculatePay();

        System.out.printf("%10d %10s %10d %10.2f %10.2f %10.2f %10.2f\n",
 1, employee1.name, employee1.hoursWorked, employee1.hourlyRate, employee1.grossPay, employee1.tax, employee1.netPay);
        System.out.printf("%10d %10s %10d %10.2f %10.2f %10.2f %10.2f\n",
  2, employee2.name, employee2.hoursWorked, employee2.hourlyRate, employee2.grossPay, employee2.tax, employee2.netPay);
        System.out.printf("%10d %10s %10d %10.2f %10.2f %10.2f %10.2f\n",
 3, employee3.name, employee3.hoursWorked, employee3.hourlyRate, employee3.grossPay, employee3.tax, employee3.netPay);
        System.out.printf("%10d %10s %10d %10.2f %10.2f %10.2f %10.2f\n",
 4, employee4.name, employee4.hoursWorked, employee4.hourlyRate, employee4.grossPay, employee4.tax, employee4.netPay);
    }
}