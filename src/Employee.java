/**
 * Created by tlt31 on 3/30/15.
 */
public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    Employee(String empName, int empIdNumber, String empDepartment, String empPosition){
        name = empName;
        idNumber = empIdNumber;
        department = empDepartment;
        position = empPosition;
    }

    Employee(String empName, int empIdNumber){
        name = empName;
        idNumber = empIdNumber;
        department = " ";
        position = " ";
    }

    Employee(){
        name = " ";
        idNumber = " ";
        department = " ";
        position = " ";
    }
}


