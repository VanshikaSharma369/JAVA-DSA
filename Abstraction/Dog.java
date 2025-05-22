class Dog extends Animal {
    Dog(String Name){
        super(Name);
    }
    @Override
    void makeSound(){
        System.out.println(Name+" makes sound woof woof.");
    }
}
