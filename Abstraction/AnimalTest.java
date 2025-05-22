public class AnimalTest {
    public static void main(String[] args){
        Animal dog = new Dog("Tuffy");
        dog.makeSound();
        dog.eat();
        Animal cat = new Cat("Senorita");
        cat.makeSound();
        cat.eat();
    }
}
