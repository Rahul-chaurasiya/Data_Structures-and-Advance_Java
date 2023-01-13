
// Java program to demonstrate working of Collections.sort() 
import java.util.*;

// A user-defined Point class implementing Comparable interface
class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P) {
        return this.x - P.x;
    }
}

class GfG {
    public static void main(String[] args) {
        // Create a list of Integers
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));

        // List is sorted in the natural order
        Collections.sort(list);

        // Displaying the points
        for (Point p : list)
            System.out.println(p.x + " " + p.y);
    }
}
