package labWork_2_2_5c;

/**
 * Created by Bulik on 14.07.2016.
 */
public class A {
    public  void  calcSquare(int a, int b){
        System.out.println("Rectangle -> " +a*b);
    }
    public void  calcSquare(int side){
        System.out.println("foursquare->  "+ side*side);
    }
    public void calcSquare(double radius){
        System.out.println("Circle -> " + Math.PI*radius * radius);
    }

}
