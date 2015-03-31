/**
 * Created by tlt31 on 3/30/15.
 */
public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String ename, int eidNumber, String edepartment, String eposition){
        name = ename;
        idNumber = eidNumber;
        department = edepartment;
        position = eposition;
    }

    public Employee(String ename, int eidNumber){
        name = ename;
        idNumber = eidNumber;
        department = " ";
        position = " ";
    }

    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public void setName(String ename){

        name = ename;
    }

    public void setIdNumber(int eidNumber){

        idNumber = eidNumber;
    }

    public void setDepartment(String eDepartment){

        department = eDepartment;
    }

    public void setPosition(String eposition){

        position = eposition;
    }

    public String getName(){

        return name;
    }

    public int getIdNumber(){

        return idNumber;
    }

    public String getDepartment(){

        return department;
    }

    public String getPosition(){

        return position;
    }
}


