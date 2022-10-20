class Constructor {
    public int age;
    String name;
    long mobile;
    int id;
    void sayHi(){
        System.out.println("Hello!");
        System.out.println(name + " age: " + age);
    }

    // Constructor
    Constructor (){};
    Constructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    Constructor (String name, int age, long mobile, int id){
        this(name, age);
        this.mobile = mobile;
        this.id = id;
    }

    void sayHii(){
//        System.out.println("Hello!");
        System.out.println(name + " age: " + age);
        System.out.println("Mobile: "+mobile + " Id: " + id);
    }
}


class Child_const extends Constructor{

    Child_const (String name, int age){
        super(name, age);
    }
    void hello(){
        System.out.println("Welcome" + age);
    }
}