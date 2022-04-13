package lesson5;

public class Employee {
    String fullName;
    String position;
    String email;
    long phone;
    int salary;
    int age;



    Employee(String fullName, String position, String email, long phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo(){
        System.out.println(fullName+" "+position+" "+email+" "+phone+" "+salary+" "+age);
    }

}




