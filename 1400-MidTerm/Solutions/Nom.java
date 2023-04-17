import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Nom {
    private int co = 1;
    private Point values;

    public Nom(int coef, ArrayList<Integer> pows) {
        co = coef;
        values = new Point(pows);
    }

    public int calc(Point point) throws InputMismatchException {
        int d = co;
        //if (point.contains(0))
          //  return 0;
        if (point.size() != values.size()) {
            throw new InputMismatchException("the point dimension was incorrect");
        }
        for (int i = 0; i < point.size(); i++) {
            var pow = values.get(i);
            if (pow > 0) {
                if(point.get(i) == 0){
                    return 0;
                }
                d *= point.get(i);
            }
        }
        return d;
    }

    public int getDegree(int index) {
        return values.get(index);
    }

    public int getDegree(){
        return Collections.max(values);
    }

    public int getSumOfDegrees(){
        return values.stream().reduce(0,Integer::sum);
    }

}
