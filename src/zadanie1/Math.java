package zadanie1;

public class Math {

    private int[] arrayOfElements;

    public Math(int[] Array){
        this.arrayOfElements = Array;
    }

    public int sumElements(){
        int result = 0;
        for (int i = 0; i < arrayOfElements.length; i++) {
            result = arrayOfElements[i] + result;
        }
        return result;
    }
    public int averageFromElements(){
        int result = 0;
        for (int i = 0; i < arrayOfElements.length; i++) {
            result = arrayOfElements[i] + result;
        }
        result = result / arrayOfElements.length;
        return result;
    }
    public int minValueFromElements(){
        int minValue = arrayOfElements[0];
        for (int i = 0; i < arrayOfElements.length; i++) {
            if(arrayOfElements[i] < minValue){
                minValue = arrayOfElements[i];
            }
        }
        return minValue;
    }
    public int maxValueFromElements(){
        int minValue = arrayOfElements[0];
        for (int i = 0; i < arrayOfElements.length; i++) {
            if(arrayOfElements[i] > minValue){
                minValue = arrayOfElements[i];
            }
        }
        return minValue;
    }

}
