import java.util.concurrent.*;

public class MyTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        singleton04();
        Callable<Singleton5> callable = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Singleton5> submit1 = pool.submit(callable);
        Future<Singleton5> submit2 = pool.submit(callable);
        Singleton5 singleton51 = submit1.get();
        Singleton5 singleton52 = submit2.get();

        System.out.println(singleton51 == singleton52);

        pool.shutdown();

    }

    private static void singleton04() throws InterruptedException, ExecutionException {
        //        Singleton04 instance4 = Singleton04.getSingleton();
//        Singleton04 instance42 = Singleton04.getSingleton();
//        System.out.println(instance4);
//        System.out.println(instance42);

        Callable<Singleton04> callable= new Callable<Singleton04>() {
            @Override
            public Singleton04 call() throws Exception {
                return Singleton04.getSingleton();
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(2);
//        pool.execute(futureTask1); //给线程池直接提交任务  注意submit() 有返回值，execute()没
//        pool.execute(futureTask2);
        Future<Singleton04> futureTask1 = pool.submit(callable);
        Future<Singleton04> futureTask2 = pool.submit(callable);
        Singleton04 singleton04 = futureTask1.get();
        Singleton04 singleton05 = futureTask2.get();
        System.out.println(singleton04==singleton05);
        System.out.println(singleton04);
        System.out.println(singleton05);

        pool.shutdown();
    }
}
