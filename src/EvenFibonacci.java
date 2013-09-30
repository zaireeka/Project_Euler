import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: mixoftwo
 * Date: 02/09/2013
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class EvenFibonacci {

    public static void main(String arg[]) {
        fibCalc();
    }

    public static int fibCalc() {
        long maxNum = 4000000000L;
        int submitted = 0;

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ExecutorCompletionService completionService = new ExecutorCompletionService(executorService);

        for (long i = 1; i < maxNum; i++) {
            completionService.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    long fibStart = 1;
                    long fibnext = 2;
                    long nextFibNum = 0;
                    nextFibNum = fibStart + fibnext;

                    return nextFibNum;
                }
            });
            submitted++;
        }

        while (submitted != 0) {
            try {
                Future future = completionService.take();
                Object blah = future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (ExecutionException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        }
        return 0;
    }
}


