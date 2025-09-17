package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int smallest, middle, largest;
        if (a <= b && a <= c){
            smallest = a;
        } else if (b <= a && b <= c){
            smallest = b;
        } else {
            smallest = c;
        }

        if (a >= b && a >= c){
            largest = a;
        } else if (b >= a && b >= c){
            largest = b;
        } else {
            largest = c;
        }

        if ((a != smallest) && (a != largest)) {
            middle = a;
        } else if ((b != smallest) && (b != largest)) {
            middle = b;
        } else {
            middle = c;
}

        return smallest + "," + middle + "," + largest;
    }
}
