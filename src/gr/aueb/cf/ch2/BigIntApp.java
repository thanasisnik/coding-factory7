package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("123215465421321654845233213");
        BigInteger bigNum2 = new BigInteger("21432934298341298128919");
        BigInteger result;


        result= bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
