
import java.util.*;

// user-defined class
class Point {
    int x, y;

    // constructor to assign values
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString() method to print string in comma representation
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Main class
class j09_toString2 {
    public static void main(String[] args) {
        // This is a non-primitive array of Point type
        Point arr[] = {
                new Point(30, 10),
                new Point(10, 20),
                new Point(5, 30) };

        // Converts th arrays using user-defined class
        System.out.println(Arrays.toString(arr));
    }
}
