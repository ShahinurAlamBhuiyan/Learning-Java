class Student {
    String name; // null
    String id; // null
    float cgpa; // 0
    int completedCredit; // 0

    // Constructors
    public Student(){
        // Do nothing. behave like empty constructor.
    }

    public Student(String name, String id, float cgpa, int completedCredit){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.completedCredit = completedCredit;
    }


    public void calculateCGPA(float gpa, int credit){
        cgpa = (cgpa*completedCredit + gpa*credit)/(credit + completedCredit);
        completedCredit += credit;
    }

    public void getInfo(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Total Credit: "+ completedCredit);
    }

}

