package threads;

public class EnumWithMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(EnumWithMethod.NILESH.name());
		System.out.println(EnumWithMethod.PRATIK.getFather());
		System.out.println(EnumWithMethod.CHETANA.getParents());
		
		System.out.println("For-loop on Enums");
		for(EnumWithMethod m : EnumWithMethod.values()){
			System.out.println(m.getParents());
		}
	}

}
