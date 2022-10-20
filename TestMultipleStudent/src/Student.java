class Student {
    // instance...
    String name;
    String id;
    float cgpa; // 3.4
    int completedCredit; // 30

    // method...
    void updateCgpa(int credit,float gpa) { // 3 , 4.0
        this.cgpa = (this.completedCredit * this.cgpa + credit * gpa) / (this.completedCredit + credit);
        this.completedCredit += credit;
    }

    float getCgpa(){
        return this.cgpa;
    }



    // the quick brown fox jump over the lazy dog
    // public
    // name as same as class name
    // no return
    public Student(){
        // this is default constructor...
    }

    public Student(String name, String id, float cgpa, int completedCredit){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.completedCredit = completedCredit;
    }


    public  Student(float cgpa, int completedCredit){
        this.cgpa = cgpa;
        this.completedCredit = completedCredit;
    }


}
