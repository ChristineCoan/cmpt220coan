public class Problem3 {
    public static void main(String[] args) {
        final double Radius= 5;
        double x1=0;
        double y1=0;
        double x2= Math.random();
        double y2=Math.random();
        double distance = Math.pow(x2-y2,2)+ Math.pow(x1-y1,2);
        distance=Math.sqrt(distance);
        System.out.println("The point is (" + x2 + ", "+ y2 + ") is " + "and its distance to the center is "+distance); 
    }
}
