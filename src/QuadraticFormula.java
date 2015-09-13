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
	
	public static long[] rationalize(double n){
		long[] frac = new long[2];
		double den;
		String dec_string;
		double dec_length;
		double div;
		long numerator, denominator;
		if (n%1==0){
			frac[0]=Math.round(n);
			frac[1]=1;
		}
		else{
			dec_string = Double.toString(Math.abs(n));
			dec_length = dec_string.length() - dec_string.indexOf('.') - 1;
			den = Math.pow(10.0,dec_length);
			n*=den;
			div = gcd(n,den);
			n/=div;
			den/=div;
			numerator = (long) n;
			denominator = (long) den;
			frac[0]=numerator;
			frac[1]=denominator;
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
	
	public static double[] quadForm(double a, double b, double c){
		double[] solutions = new double[2];
		double num1 = b*-1 + Math.sqrt(Math.pow(b,2.0) - 4*a*c);
		double num2 = b*-1 - Math.sqrt(Math.pow(b,2.0) - 4*a*c);
		solutions[0] = num1/(2*a);
		solutions[1] = num2/(2*a);
		return solutions;
	}
	
	
	
	
	
	
	
	public static void main (String[] args){
		double[] sol = quadForm(1,4,-8);
		System.out.println(sol[0] + " " + sol[1]);
		
	}
	
}
