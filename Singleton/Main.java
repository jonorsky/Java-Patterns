public class Main{
  public static void main(String[] args){
    Employee nico= new Employee();
    HourlyEmployee jem = new HourlyEmployee();
    SalaryEmployee ed = new SalaryEmployee();
    System.out.println(jem.companyID == nico.companyID);
  }
}
