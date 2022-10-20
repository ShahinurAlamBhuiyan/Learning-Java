package practice;

public class Application {
    public static void main(String[] args) { Course c1=new Course("OOP","CSI211",3); Course c2=new Course("SPL","CSI121",1);
        c1.display(); c2.display(); c1.updateCourse(c2); c1.display(); c2.display();
    } }


 class Course {
    String name, id;
    int credit;
    public Course(String name, String id, int credit) {
        this.name = name; this.id = id; this.credit = credit;
    }
    public void display() {
        System.out.printf("%s-%s-%d\n", name, id, credit); }
    public void updateCourse(Course c1){ this.name = c1.name;
        this.id = c1.id;
        c1.credit--;
    } }