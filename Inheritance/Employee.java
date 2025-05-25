class Employee {
    String Name;
    double salary;

    Employee(String Name,double salary){
        this.Name = Name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee:"+Name+" has Salary:"+salary);
    }

    void work(){
        System.out.println("Employee:"+Name+" is working.");
    }
}
