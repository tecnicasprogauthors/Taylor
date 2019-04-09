import Util.java

public class ExpLog
{

	public static ArrayList<double> exp(int x)
	{
		ArrayList<double> resultado = new ArrayList<double>();
		int n = 0;
		while(resultado.get(resultado.size() - 1) > 0.000001)
		{
			resultado.add((x**n)/fatorial(n));
			n++;
		}
	return resultado;
	}


	public static double expSum(ArrayList<double> x)
	{
		return somatorio(0, x.size() - 1, x);
	}


	public static ArrayList<double> log(int x)
	{
		ArrayList<double> resultado = new ArrayList<double>();
		int n = 0;
		if(Math.abs(x) < 1)
		{
			throw new IllegalArgumentException();
		}
		while(resultado.get(resultado.size() - 1) > 0.000001)
		{
			resultado.add((((-1)**n)/n+1)*(x**(n+1)));
			n++;
		}
	return resultado;
	}

	public static double logSum(int x)
	{
		return somatorio(0, x.size() - 1, x);
	}
}
