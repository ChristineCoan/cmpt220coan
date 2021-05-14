import java.util.*;
//Problem3 not sure why i put 4
public class Problem4 {
//had an error with vs code and running the programs didnt say an error but couldnt run to check
    public class RationalTest {
    public void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter the first rational number: ");
                String rational1 = sc.nextLine();
                
                System.out.print("Enter the second rational number: ");
                String rational2 = sc.nextLine();
                
                sc.close();
                
                Rational rat1 = Rational.parseRationalNumber(rational1);
                Rational rat2 = Rational.parseRationalNumber(rational2);
                
                System.out.println(rat1+" + "+rat2+" = "+rat1.add(rat2));
    }
}
    public static class Rational extends Number implements Comparable<Rational> {
        // Data fields for numerator and denominator
        private long numerator = 0;
        private long denominator = 1;
        //Construct a rational with default properties
        public Rational() {
                this(0, 1);
        }
        //Construct a rational with specified numerator and denominator
        public Rational(long numerator, long denominator) {
                long gcd = gcd(numerator, denominator);
                this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
                this.denominator = Math.abs(denominator) / gcd;
        }
        //Find GCD of two numbers
        private long gcd(long n, long d) {
                long n1 = Math.abs(n);
                long n2 = Math.abs(d);
                int gcd = 1;

                for (int k = 1; k <= n1 && k <= n2; k++) {
                        if (n1 % k == 0 && n2 % k == 0)
                                gcd = k;
                }

                return gcd;
        }
        //Return numerator
        public long getNumerator() {
                return numerator;
        }
        //Return denominator
        public long getDenominator() {
                return denominator;
        }
        //Add a rational number to this rational
        public Rational add(Rational secondRational) {
                long n = numerator * secondRational.getDenominator() + denominator
                                * secondRational.getNumerator();
                long d = denominator * secondRational.getDenominator();
                return new Rational(n, d);
        }
        //Subtract a rational number from this rational
        public Rational subtract(Rational secondRational) {
                long n = numerator * secondRational.getDenominator() - denominator
                                * secondRational.getNumerator();
                long d = denominator * secondRational.getDenominator();
                return new Rational(n, d);
        }
        //Multiply a rational number to this rational
        public Rational multiply(Rational secondRational) {
                long n = numerator * secondRational.getNumerator();
                long d = denominator * secondRational.getDenominator();
                return new Rational(n, d);
        }
        //Divide a rational number from this rational
        public Rational divide(Rational secondRational) {
                long n = numerator * secondRational.getDenominator();
                long d = denominator * secondRational.numerator;
                return new Rational(n, d);
        }
        public String toString() {
                if (denominator == 1)
                        return numerator + "";
                else
                        return numerator + "/" + denominator;
        }
        // Override the equals method in the Object class
        public boolean equals(Object other) {
                if ((this.subtract((Rational) (other))).getNumerator() == 0)
                        return true;
                else
                        return false;
        }
        // Implement the abstract intValue method in Number
        public int intValue() {
                return (int) doubleValue();
        }
        // Implement the abstract floatValue method in Number
        public float floatValue() {
                return (float) doubleValue();
        }
        // Implement the doubleValue method in Number
        public double doubleValue() {
                return numerator * 1.0 / denominator;
        }
        // Implement the abstract longValue method in Number
        public long longValue() {
                return (long) doubleValue();
        }
        // Implement the compareTo method in Comparable
        public int compareTo(Rational o) {
                if (this.subtract(o).getNumerator() > 0)
                        return 1;
                else if (this.subtract(o).getNumerator() < 0)
                        return -1;
                else
                        return 0;
        }
        public static Rational parseRationalNumber(String s) {
                if (s.contains("/")) {
                        String words[] = s.split("/");
                        long numerator = Long.parseLong(words[0].trim());
                        long denominator = Long.parseLong(words[1].trim());
                        return new Rational(numerator, denominator);
                } else {
                        return new Rational(Long.parseLong(s.trim()), 1);
                }
        }
    }
}
