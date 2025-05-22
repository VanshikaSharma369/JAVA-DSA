abstract class Animal{
    String Name;
    Animal(String Name){
        this.Name = Name;
    }
    abstract void makeSound();

    void eat(){
        System.out.println(Name+" is eating.");
    }
}