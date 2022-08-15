public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT = 1;
        int WAGE_PER_HR = 20;
        int FULL_DAY_HR = 8;

        int empCheck = (int)(Math.floor(Math.random()*10)%2);

        if(empCheck == IS_PRESENT){
            System.out.println("Employee is present...");
            System.out.println("Full Day Wage is: "+( WAGE_PER_HR * FULL_DAY_HR ));
        }else {
            System.out.println("Employee is absent...");
            System.out.println("Absent Day Wage is: "+ 0 );
        }
    }
}
