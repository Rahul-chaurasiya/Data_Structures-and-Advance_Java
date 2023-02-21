
// A sample Java program to implement Arrays.binarySearch() for non-primitive types
import java.util.Arrays;

// A user-defined Point class implementing Comparable interface
class Point implements Comparable<Point> {
    int x, y;

    // Costructor initializing x & y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the nature of sorting i.e., according to x-coordinate
    public int compareTo(Point P) {

        // Comparing two objects by Subtracting the passed object from current object This compares the passed element with the middle element and decides whether to go left or right of the array
        return this.x - P.x;
    }
}

// Main class
class j04_binarySearch2_comparable {
    public static void main(String[] args) {
        // Array of 3 objects
        Point arr[] = {
                new Point(10, 20),
                new Point(20, 15),
                new Point(25, 5),
                new Point(40, 100) };

        Point p = new Point(25, 5);

        System.out.println(Arrays.binarySearch(arr, p));
    }
}
