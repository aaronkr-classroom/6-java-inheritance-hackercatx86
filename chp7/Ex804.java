public class Ex804 extends Math {

	public static void main(String[] args) {
		int a = 10, b = 5;
		double c = 2.5, d = 4.5;	
		
		Ex804 calc = new Ex804();
			
		System.out.println(a + "+" + b + "=" + calc.add(a,b));
		System.out.println(a + "+" + b + "=" + calc.add(a,c));
		System.out.println(a + "+" + b + "=" + calc.add(c,d));
		
		System.out.println(a + "/" + b + "=" + calc.div(a,b));
		System.out.println(a + "/" + b + "=" + calc.div(a,c));
		System.out.println(a + "/" + b + "=" + calc.div(c,d));
		
		System.out.println(a + "*" + a + "=" + calc.sqr(a));
		System.out.println(b + "*" + b + "=" + calc.sqr(b));
		System.out.println(c + "*" + c + "=" + calc.sqr(c));
		System.out.println(d + "*" + d + "=" + calc.sqr(d));

	}

}
