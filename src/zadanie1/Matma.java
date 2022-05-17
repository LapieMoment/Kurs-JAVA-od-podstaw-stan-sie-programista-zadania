package zadanie1;

public class Matma {

    public static double PI = 3.14;
    public int radius;
    public int lengthA;
    public int lengthB;

    public Matma(int radius){
        this.radius = radius;
    }
    public Matma(int lengthA, int lengthB){
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    public static double circumferenceOfWheel(int radius){
        return PI*radius;
    }
    public static double AreaeOfWheel(int radius){
        return PI*2*radius;
    }
    public static double circumferenceOfRectangle(int lengthA, int lengthB){
        return lengthA*2 + lengthB*2;
    }
    public static double AreaeOfRectangle(int lengthA, int lengthB){
        return lengthA* lengthB;
    }



}
