public class EmployeeWageComputation {

//    declared constants for the required calculations
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HR = 20;
    public static final int FULL_TIME_HR = 8;
    public static final int PART_TIME_HR = 4;
    public static final int WORK_DAY_PER_MONTH = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWorkHr = 0;

        for (int day = 1; day<=WORK_DAY_PER_MONTH; day++) {

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empCheck){
                case IS_FULL_TIME:
                    System.out.println("Employee is Present at Day "+day+" and is Full Time...");
                    totalWorkHr = totalWorkHr + FULL_TIME_HR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Present at Day "+day+" and is Part Time...");
                    totalWorkHr = totalWorkHr + PART_TIME_HR;
                    break;
                default:
                    System.out.println("Employee is Absent at "+day);
                    break;
            }
        }
        System.out.println("Employees Monthly Wage is: "+( WAGE_PER_HR * totalWorkHr ));
    }
}
