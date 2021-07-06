import java.io.*;

//local variable defined inside the method
//instance variable outside the method but inside the class and 
//accesale by methods
//class varible is defined with static variable

////contructor : 
//polymorphism

//creating an object
public class opps {
    public Employee(String name ){
       System.out.println("Employee_name"+name);
    }
    public static void main(String args[]){
        System.out.println("creating an object");
        Employee obj1=new Employee("Ganesh");


    }


    
}
