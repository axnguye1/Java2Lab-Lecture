public class FloatingPoint{
    public static void main(String[] args){
        double frac= 1.0/6.0;
        double shouldBeOne= frac + frac + frac + frac + frac +frac;
        System.out.println("result is:"+ shouldBeOne);
        //never use == to compare floating point numbers
        //becasue of possible rounding error
        double tolerance = 0.00001;
        if( Math.abs(shouldBeOne - 1.0)< tolerance)
            System.out.println("numbers are equal to tolerance of" + tolerance);
        else
            System.out.println("numbers are not equal");

    }
}