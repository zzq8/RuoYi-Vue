public class Test
{
    public static Test t1 = new Test(); //1
    {
        System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB"); //2
    }
    public static void main(String[] args)
    {
        Test t2 = new Test(); //3
    }
}