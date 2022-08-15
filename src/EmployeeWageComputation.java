public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

//        declared constants for the required calculations
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;
        int FULL_TIME_HR = 8;
        int PART_TIME_HR = 4;

//        checking random value between 0 to to 2
        int empCheck = (int)(Math.floor(Math.random()*10)%3);

//        checking employee is full-time or part-time or absent
        if(empCheck == IS_FULL_TIME){
            System.out.println("Employee is Present and is Full Time...");
            System.out.println("Full Day Wage is: "+( WAGE_PER_HR * FULL_TIME_HR ));
        } else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is Present and is Part Time...");
            System.out.println("Full Day Wage is: "+( WAGE_PER_HR * PART_TIME_HR ));
        }else {
            System.out.println("Employee is Absent...");
            System.out.println("Full Day Wage is: "+( 0 ));
        }
    }
}
