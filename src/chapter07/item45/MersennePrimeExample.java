package chapter07.item45;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;

public class MersennePrimeExample {

    private static final BigInteger TWO = new BigInteger("2");
    public static void main(String[] args) {

        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(merssene -> merssene.isProbablePrime(50))
                .limit(20)
                .forEach(merssene -> System.out.println(merssene.bitLength() + " - " + merssene));
    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}
