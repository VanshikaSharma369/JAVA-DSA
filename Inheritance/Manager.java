class Manager extends Employee {
    String department;
    Manager(String Name,double salary,String department){
        super(Name,salary);
        this.department = department;
    }
    @Override
    void work(){
        System.out.println("Name:"+Name+" is managing the :"+department);
    }
}
