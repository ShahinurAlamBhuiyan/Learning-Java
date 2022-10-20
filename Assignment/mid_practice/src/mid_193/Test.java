package mid_193;

public class Test {
    public static void testFnc(Human h) {
        h.whoAmI();
    }

    public static void main(String[] args) {
        testFnc(new Human());
        testFnc(new Student());
        testFnc(new GradStudent());
        Human h = new GradStudent();
        ;
        h.whoAmI();
        Student s = (Student) h;
        s.whoAmI();
        GradStudent gs = (GradStudent) s;
        gs.whoAmI();
    }
}


class Human{
    public void whoAmI(){
        System.out.println("I am human"); }
}
class Student extends Human{
    public void whoAmI(){ System.out.println("I am student");
    }
}


class GradStudent extends Student{ public void whoAmI(){
    System.out.println("I am graduate student"); }
}