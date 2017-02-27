package java8Lambda;

public class Lambdable {
	
	private class Mult implements Lamable{

		@Override
		public int MultByTwo(int number) {
			// TODO Auto-generated method stub
			return number * 2;
		}
		
	}
	
	public static void print(Lamable l){
		l.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lamable m = (number) -> {return number * 2;};
		System.out.println(m.MultByTwo(3));
		
		Lamable m1 = (number) -> {return number * 4;};
		System.out.println(m1.MultByTwo(3));
		
		// Mult mult = (number) -> {return number * 2;}; it gives compile time errors
	}

}
