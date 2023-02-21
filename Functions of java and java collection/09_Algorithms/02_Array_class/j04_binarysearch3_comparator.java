
// A sample Java program to implement Arrays.binarySearch() for non-primitive types
import java.util.*;

// Point class which does not implement Comparable interface. Thus the objects of this class are not comparable.
class Point {
    int x, y;

    // Costructor intialising x & y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// This class implements Comparator interface to compare
class MyCmp implements Comparator<Point> {
    // Sorts the Point objects according to x-coordinates in natural order
    public int compare(Point p1, Point p2) {
        // Considered the natural order
        return p1.x - p2.x;
    }
}

// Main class
class j04_binarysearch3_comparator {
    public static void main(String[] args) {
        // Array of 3 objects
        Point arr[] = {
                new Point(10, 20),
                new Point(20, 15),
                new Point(25, 5),
                new Point(40, 100) };

        Point p = new Point(25, 5);

        // An extra parameter is passed with the object of MyCmp class
        System.out.println(Arrays.binarySearch(arr, p, new MyCmp()));
    }
}
