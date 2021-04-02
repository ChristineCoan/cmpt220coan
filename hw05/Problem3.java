import java.util.*;
public class Problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
        System.out.print("Enter total seconds: ");
        long seconds=in.nextLong();
        System.out.println("The hours, minutes, and seconds for total seconds "+format(seconds));
	}
	public static String format(long seconds) {
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + seconds % 60 + currentMinuteAndSecond;
			seconds /= 60;
		}
		return seconds + currentMinuteAndSecond;
	}
}