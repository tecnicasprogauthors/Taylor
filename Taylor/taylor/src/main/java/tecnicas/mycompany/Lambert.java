import java.lang.Math;
import java.util.ArrayList;

public static class Lambert
{
    public static ArrayList<Double> lambertList(double x)
    {
        if (x >= 1/Math.E) throw new IllegalArgumentException();
        else
        {
            ArrayList<Double> termos = new ArrayList<Double>();
            double termo = 0;
            for (int n = 1; termo >= Math.pow(10, -5); n++)
            {
                termo = ((Math.pow(-n, n-1))/(Util.fatorial(n)))*(Math.pow(x, n));
            }
        }
        return sum;
    }
    public static double lambert(double x)
    {
        return util.somatorio(lambertList(x));
    }
}
