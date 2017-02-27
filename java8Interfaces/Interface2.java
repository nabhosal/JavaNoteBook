package java8Interfaces;

public interface Interface2 {

	default void log(String stmt){
		System.out.println(stmt);
	}
}
