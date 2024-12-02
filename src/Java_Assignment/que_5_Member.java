package Java_Assignment;

public class que_5_Member{
    public String Name;
    int Age;
    long PhoneNumber;
    String Address;
    int Salary;
    public que_5_Member(String name, int age, long phoneNumber, String address, int salary){
        this.Name = name;
        this.Age = age;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.Salary = salary;

    }
    public void printSalary(){
        System.out.println(Salary);
    }
    public void ManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);

        printSalary();
    }
    public void EmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);
        // System.out.println("Specialization: " + specialization);
        printSalary();
    }


    public static class Manager extends que_5_Member{
        public Manager(String name, int age, long phoneNumber, String address, int salary) {
            super(name, age, phoneNumber, address, salary);

        }


    }
    public  class Employee extends que_5_Member {

        public Employee(String name, int age, long phoneNumber, String address, int salary) {
            super(name, age, phoneNumber, address, salary);
        }

    }

    public static void main(String[] args) {
        que_5_Member manager1 = new que_5_Member("sunny",22,963535264,"maharashtra",50000);
        manager1.ManagerDetails();
        System.out.println("-----------------------------------------------------------------------------------------");
        que_5_Member employee1 = new que_5_Member("abcd",23,98764535,"abc",5000);
        employee1.EmployeeDetails();



    }


}
