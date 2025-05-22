class Cat extends Animal {
    Cat(String Name){
        super(Name);
    }
    @Override
    void makeSound(){
        System.out.println(Name+" makes the sound meow meow.");
    }
}
