class Student{
    String Name;
    int roll;

    static String SchoolName;

    Student(String Name,int roll){
        this.Name=Name;
        this.roll=roll;
    }

    void display(){
        System.out.println("Name of the Student: "+ Name);
        System.out.println("Roll Number of a Student: "+ roll);
        System.out.println("School Name: "+ SchoolName);
    }
}
public class StudentTest {
    public static void main(String[] args){
        Student.SchoolName = "Vanasthali Public School";
        Student s1 = new Student("Alice",101);
        s1.display();

        Student s2 = new Student("Bob",102);
        s2.display();
        
        Student.SchoolName = "Delhi Public School";
        Student s3 = new Student("Rock",103);
        s3.display();
    }
}
