import java.lang.Object;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time1 (hour minute second): ");
        int hour, minute, second;
        hour = input.nextInt();
        minute = input.nextInt();
        second = input.nextInt();
        Time time1 = new Time(hour, minute, second);
        System.out.println(time1);
        System.out.println("Elapsed seconds in time1: " + time1.getSeconds());

        System.out.print("\nEnter time2 (elapsed time): ");
        long seconds = input.nextLong();
        Time time2 = new Time(seconds);
        System.out.println(time2);
        System.out.println("Elapsed seconds in time2: " + time2.getSeconds());
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        Time time3 = (Time) time1.clone();
        System.out.println("time3 is created as a clone of time1");
        System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));
    }
}

class Time implements Comparable<Time> {
    private long t;

    public Time() {
        t = System.currentTimeMillis() / 1000;
    }

    public Time(long t) {
        this.t = t;
    }

    public Time(int h, int m, int s) {
        t = (((h * 60) + m) * 60) + s;
    }

    public int getHour() {
        return (int) (t / 3600) % 24;
    }

    public int getMinute() {
        return (int) (t - (getHour() * 3600)) / 60 % 60;
    }

    public int getSecond() {
        return (int) t % 60;
    }

    public long getSeconds() {
        return t;
    }

    public String toString() {
        return String.format("%d hours %d minutes %d seconds", getHour(), getMinute(), getSecond());
    }

    public int compareTo(Object arg0) {
        return (int) (t - ((Time) arg0).t);
    }

    public Time clone() {
        Time T2 = new Time();
        T2.t = t;
        return T2;
    }

    public boolean equals(Time T) {
        return T.t == t;
    }
}
