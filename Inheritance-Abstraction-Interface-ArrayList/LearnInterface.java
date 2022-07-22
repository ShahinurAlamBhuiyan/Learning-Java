// Interface contain only method signature.
interface LearningInterface{
    String company = "Tesla";

    // Methods.
    public void learn();
    public boolean workHard();

    /*
    void workHard(){
        System.out.println("Yes!");
    }
     -> throwing error because this is an interface class.
    */

}

class Worker implements LearningInterface{
    String name = "Hasib";
    @Override
    public void learn(){
        System.out.println("Name: " + name+ ". He is a good worker in " + LearningInterface.company);
    }

    @Override
    public boolean workHard(){
        return true;
    }
}


class Dreamer implements LearningInterface{
    String name = "Akash";
    @Override
    public void learn(){
        System.out.println("Name: " + name+ ". He is a good dreamer in " + LearningInterface.company);
    }

    @Override
    public boolean workHard(){
        return  false;
    }
}