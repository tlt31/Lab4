/**
 * Created by tim on 3/30/15.
 */
public class c6pc1 {

    public static void main(String[] args){

        Employee e47899 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee e39119 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e81774 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println(e47899.getName() + "    " + e47899.getIdNumber() + "    " +  e47899.getDepartment() + "    " +  e47899.getPosition());
        System.out.println(e39119.getName() + "    " + e39119.getIdNumber() + "    " +  e39119.getDepartment() + "    " +  e39119.getPosition());
        System.out.println(e81774.getName() + "    " + e81774.getIdNumber() + "    " +  e81774.getDepartment() + "    " +  e81774.getPosition());


    }
}
