
public class RoundTest {

	public static void main(String[] args) {
		
		double sum = 0;
		double sum2 = 0;
		double sum3 = 0;
		
		
		for(double d = 1.5; d <= 10.5; d++) {
			double d2 = Math.round(d);
			double d3 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d2, d3);
			
			sum += d;
			sum2 += d2;
			sum3 += d3;
		}
		
		System.out.println("---------------");
		System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum2, sum3);
	}
}
