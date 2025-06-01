class Day1 {
    String brand;
    String model;
    int year;
    Day1(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }
}
public class DayTest{
    public static void main(String[] args){
        Day1 car1 = new Day1("Kia","Seltos",1987);
        System.out.println("Car detalis:");
        car1.display();
    }
}
