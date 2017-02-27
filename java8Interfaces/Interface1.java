package java8Interfaces;

public interface Interface1 {
	
	default void log(String stmt){
		System.out.println(stmt);
	}
}
