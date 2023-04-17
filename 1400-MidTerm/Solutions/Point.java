import java.util.*;

public class Point extends ArrayList<Integer>{
    // private ArrayList<Integer> coordinates = new ArrayList<>();

    public Point(ArrayList<Integer> coordinates) {
        this.addAll(coordinates);
    }

    public Point(int d, ArrayList<Integer> data) {
        if (data.size() != d) {
            throw new IllegalArgumentException("Bad input => the data and the size do not match");
        }
        // this.clear();
        this.addAll(data);
    }
}
