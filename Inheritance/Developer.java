class Developer extends Employee {
    String programmingLanguage;
    Developer(String Name,double salary,String programmingLanguage){
        super(Name,salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void work(){
        System.out.println("Develper:"+Name+" is working on the language:"+programmingLanguage);
    }
}
