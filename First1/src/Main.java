public class Main {
    public static void main(String[] args) {
//        BlockClass blockClass = new BlockClass();
//        blockClass.show();
        String s1 = "hello";
        String s2 = "hello";
        if(s1 == s2){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}

class BlockClass{
    public String info;

    public  BlockClass(){
        info = "From blockTest";
        System.out.println(info);
    }

    {
        info = "from block 1";
        System.out.println(info);
    }

    {
        info = "from block 2";
        System.out.println(info);
    }

    public void show(){
        info = "From show method";
        System.out.println(info);
    }


}