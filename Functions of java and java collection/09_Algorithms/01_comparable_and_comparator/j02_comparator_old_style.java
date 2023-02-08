
// A sample Java program to implementing Comparator alongside Arrays.sort(). 
import java.util.*;

// Point class which does not implement Comparable interface. Thus the objects of this class are not comparable.
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // This method is used to return the string version of the point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// This class implements Comparator interface to compare
class MyCmp implements Comparator<Point> {
    // Sorts the Point objects according to x-coordinates in natural order
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }
}

// Main class
class j02_comparator_old_style {
    public static void main(String[] args) {
        // Array of 3 objects
        Point arr[] = {
                new Point(10, 20),
                new Point(5, 45),
                new Point(25, 35) };

        // Sorting the object containing the array by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());

        // Displaying the sorted points
        System.out.println(Arrays.toString(arr));
    }
}
