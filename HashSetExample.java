import java.util.*;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        //System.out.println(id);
        return id;
    } 
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee emp=(Employee)obj;
            //System.out.println(this.id);
            //System.out.println(emp.id);
            if(this.id==emp.id)
                return true;
        }
        return false;
    }
}

public class HashSetExample {
public static void main(String[] args) { 
   Set<Employee> set=new HashSet<Employee>();  
   Employee emp1=new Employee(1,"gudu");
   Employee emp2=new Employee(2,"gudu");
   Employee emp3=new Employee(1,"siba");
    set.add(emp1);  
    set.add(emp2);
    set.add(emp3);    
    for(Employee e:set){
        System.out.println(e.id+" "+e.name);  
    }  
  }
}

