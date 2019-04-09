import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import Util.java

public class Trig {

    public double cosine(double x, int n) {

        List<Double> list = new ArrayList<Double>();

        double resp = 0;

        for (int i = 0; i < n; i++) {
            resp = (Math.pow(-1, i) / fatorial(2 * i)) * Math.pow(x, (2 * i));
            list.add(resp);
            resp = x;
        }

        return somatorio(0, n, list);
    }

    public double sine(double x, int n) {

        List<Double> list = new ArrayList<Double>();

        double resp = 0;

        for (int i = 0; i < n; i++) {
            resp = (Math.pow(-1, i) / fatorial((2 * i) + 1)) * Math.pow(x, ((2 * i)) + 1);
            list.add(resp);
            resp = x;
        }

        return somatorio(0, n, list);
    }
