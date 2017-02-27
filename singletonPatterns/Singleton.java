package singletonPatterns;

public class Singleton {
	
	private String db_connection;
	
	private Singleton(String connections){
		db_connection = connections;
	}
	
	private static Singleton s = new Singleton("DB Connections");
	
	public static Singleton getInstance(){
		return s;
	}
	
}
