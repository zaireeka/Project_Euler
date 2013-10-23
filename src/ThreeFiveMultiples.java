/**
 * Created with IntelliJ IDEA.
 * User: mixoftwo
 * Date: 02/09/2013
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */
public class ThreeFiveMultiples {

    public static void main (String arg[]){
        int sum=0;
        for (int i=0; i<1000; i++){
            if ((i%3==0) || (i%5==0)){
                sum = sum + i;
            }
        }

        System.out.println("your sum:" + sum);
    }

}
