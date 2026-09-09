package LambdaExpression;

public class RunnableLambdaExpression
{

    public static void main(String[] args) {

        // This is using the regular implementation
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("The Application is Up and running with runnable interface");
            }
        };

        new Thread(runnable).start();

        // using the lambda expression
        Runnable runnable1 = () -> System.out.println("The Application is running with lambda expression");
        new Thread(runnable1).start();


    }

}
