
public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String result = "";
        for(int i = 1; i <= numberOfStars; i++){
            result += "*";

        }
        return result;
    }

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for( int i = 1; i <= numberOfRows; i++){
           
            result += getRow(i);
            result += "\n";
        }
        return result;
    }

    
    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
