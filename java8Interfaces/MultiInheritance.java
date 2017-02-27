package java8Interfaces;

public class MultiInheritance implements Interface1, Interface2{
	
	@Override
	public void log(String stmt) {
		// TODO Auto-generated method stub
		Interface1.super.log(stmt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
