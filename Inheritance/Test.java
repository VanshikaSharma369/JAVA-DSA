public class Test {
    public static void main(String[] args){
        Manager mgr = new Manager("Alice",3456.78,"Sales");
        Developer dev = new Developer("Bob",345.78,"Java");
        System.out.println("Manager Details:");
        mgr.display();
        mgr.work();

        System.out.println("Developer Details:");
        dev.display();
        dev.work();
    }
}
