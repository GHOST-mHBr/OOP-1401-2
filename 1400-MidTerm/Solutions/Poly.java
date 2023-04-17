import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Poly {
    private ArrayList<Nom> noms = new ArrayList<>();
    private ArrayList<Integer> degrees = new ArrayList<>();

    public Poly(ArrayList<Nom> nomials) {
        noms = nomials;
        getDegree();
    }

    public int getDegree() {
        if (degrees.size() == 0) {
            for (int i = 0; i < noms.size(); i++) {
                degrees.add(noms.get(i).getSumOfDegrees());
            }
        }
        return Collections.max(degrees);
    }

    public int getDegree(int i) throws ArrayIndexOutOfBoundsException {
        return Collections.max(noms.stream().map(x -> x.getDegree(i - 1)).collect(Collectors.toList()));
    }

    public int calculate(Point p) {
        // int sum = 0;
        return noms.stream().map(x -> x.calc(p)).reduce(0, Integer::sum);
    }

    public int size() {
        return noms.size();
    }

    public int getSum() {
        int s = 0;
        for (int i = 0; i < 32; i++) {
            Integer[] data = { 0, 0, 0, 0, 0 };
            data[0] = i % 2;
            data[1] = (i >> 1) % 2;
            data[2] = (i >> 2) % 2;
            data[3] = (i >> 3) % 2;
            data[4] = (i >> 4) % 2;
            Point p = new Point(new ArrayList<Integer>(Arrays.asList(data)));
            var ss = calculate(p);
            s+=ss;
        }
        return s;
    }

    @Deprecated
    private int calcDegree(int i) throws ArrayIndexOutOfBoundsException {
        return noms.stream().map(x -> x.getDegree(i)).reduce(0, Integer::sum);
    }
}
