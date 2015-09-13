import java.util.ArrayList;
import java.util.Arrays;
public class QuadraticFormula {
	
	
	
	
	
	public static long gcd (double a, double b){
		long a1;
		long b1;
		if (a>b){
			a1 = (long) a;
			b1 = (long) b;
		}
		else{
			a1 = (long) b;
			b1 = (long) a;
		}
		long tempb;
		while (b1 != 0){
			tempb = b1;
			b1 = a1%(b1*(a1/b1));
			a1 = tempb;
		}	
		return a1;
	}
	
	
	
	
	
	public static double[] rationalize(double n){
		double[] frac = new double[2];
		double den;
		String dec_string;
		double dec_length;
		double div;
		if (n%1==0){
			frac[0]=Math.round(n);
			frac[1]=1;
		}
		else{
			dec_string = Double.toString(Math.abs(n));
			dec_length = dec_string.length() - dec_string.indexOf('.') - 1;
			den = Math.pow(10.0,dec_length);
			n*=den;
			System.out.println(n + " " + den);
			div = gcd(n,den);
			System.out.println(div);
			frac[0]=n/div;
			frac[1]=den/div;
		}
		return frac;
	}
	
	
	
	
	
	
	
	
	
	public static boolean hasSolution (double a, double b, double c){
		double value = (Math.pow(b,2.0) - 4*a*c);
		if (value < 0)
			return false;
		else
			return true;
	}
	
	
	
	
	
	
	
	
	
	public static void main (String[] args){
		double[] rat = rationalize(3.66);
		System.out.println(rat[0] + "/" + rat[1]);
	}
	
}
