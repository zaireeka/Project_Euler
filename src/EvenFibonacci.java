import sun.security.util.BigInt;

import java.math.BigInteger;

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

    public static BigInteger fibCalc() {
        BigInteger maxNum = new BigInteger("4000000");
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger b2;
        BigInteger sum = new BigInteger("0");
        BigInteger testB = new BigInteger("0");

        while(b.compareTo(maxNum)<0) {

            System.out.println("b..." + b);
            if (b.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
               sum = sum.add(b);
               System.out.println("Your sum..." + sum);
               testB=b;
            }
            b2 = a.add(b);
            a = b;
            b = b2;

        }
        System.out.println("last b..." + b);
        System.out.println(sum+" "+testB);
        return sum;
    }
}



