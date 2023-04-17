import java.util.ArrayList;
import java.util.Arrays;

public class Q1{
    public static void main(String args[]){
        Nom nom1 = new Nom(1,new ArrayList<Integer>(Arrays.asList(0,5,0,2,4)));
        Nom nom2 = new Nom(5,new ArrayList<Integer>(Arrays.asList(1,2,0,0,0)));
        Nom nom3 = new Nom(-2,new ArrayList<Integer>(Arrays.asList(0,0,2,2,2)));
        Nom nom4 = new Nom(9,new ArrayList<Integer>(Arrays.asList(0,0,0,0,0)));
        ArrayList<Nom> noms = new ArrayList<>();
        noms.add(nom1);
        noms.add(nom2);
        noms.add(nom3);
        noms.add(nom4);
        
        Poly poly = new Poly(noms);
        Point p = new Point(new ArrayList<>(Arrays.asList(1,0,1,1,0)));

        System.out.println(poly.calculate(p));
        for(int i = 1 ; i < poly.size()+1 ; i++){
            System.out.println(poly.getDegree(i));
        }
        System.out.println(poly.getDegree());
        System.out.println(poly.getSum());
    }
}