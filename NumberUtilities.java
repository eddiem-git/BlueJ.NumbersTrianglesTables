
public class NumberUtilities {
    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";
        int counter = start;
        while(counter < stop){
            result += counter;
            counter = counter + step;
        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int counter = start;
        while(counter < stop){
            if(counter%2==0) {
                result += counter;
            }
            counter = counter + 1;
        }
        return result;    
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int counter = start;
        while(counter < stop){
            if(counter%2==1) {
                result += counter;
            }
            counter = counter + 1;
        }
        return result;    
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        int counter = start;
        while(counter < stop+1){
            int valueToAdd =  (int)       (Math.pow(counter, exponent));
            result += valueToAdd;
            counter = counter+1;
        }
        return result;    
        //  x = 2^3 // int x = Math.pow(2,3);
    }
}
