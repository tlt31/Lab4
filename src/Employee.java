/**
 * Created by tlt31 on 3/30/15.
 */
public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    Employee(String this.name, int this.idNumber, String this.department, String this.position){
        name = this.name;
        idNumber = this.idNumber;
        department = this.department;
        position = this.position;
    }

    Employee(String this.name, int this.idNumber){
        name = this.name;
        idNumber = this.idNumber;
        department = " ";
        position = " ";
    }

    Employee(){
        name = " ";
        idNumber = " ";
        department = " ";
        position = " ";
    }

    public void setName(){
        this.name = name;
    }

    public void setIdNumber(){
        this.idNumber = idNumber;
    }

    public void setDepartment(){
        this.department = department;
    }

    public void setPosition(){
        this.position = position;
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


