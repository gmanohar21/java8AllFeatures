package java8NewFeatures.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class employeeFilterPredicateQ3 {
    public static class Employee {
        private String name;
        private double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
    List<Employee> empList=new ArrayList<>();
    empList.add(new Employee("hari", 110.5));
    empList.add(new Employee("giri", 125.5));
    empList.add(new Employee("mani", 290.5));
    empList.add(new Employee("vinay", 320.5));
    //condition based on salary
    Predicate<Employee> empPred=emp->emp.getSalary()>= 120.0 && emp.getSalary()<=300.0;
    List<Employee> filList=filter(empList,empPred);
    //for printing list of values using stream
    filList.stream().forEach(emp->System.out.println(emp.getName()+" ---- "+emp.getSalary()));
    }

    public static List<Employee> filter(List<Employee> e,Predicate<Employee>p){
        List<Employee> newEmp=new ArrayList<>();
        for(Employee emp:e){
        if(p.test(emp)){
            newEmp.add(emp);
        }
        }
        
        return newEmp;
    }
}
