package java8Interfaces;

public interface Interface3 extends Interface1, Interface2{

	@Override
	default void log(String stmt) {
		// TODO Auto-generated method stub
		Interface1.super.log(stmt);
	}

}
