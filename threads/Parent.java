package threads;

public enum Parent {
	
	CHETANA("Sudhakar", "Ranjana"), 
	NILESH("Ashok", "Jyoti"),
	PRATIK("Prakash", "Jyoti");
	
	Parent(String father, String mother){
		this.father = father;
		this.mother = mother;
	}
	
	private String father;
	public String getFather() {
		return father;
	}
	
	private String mother;
	public String getMother() {
		return mother;
	}
	
	public String toString(){
		return "{"+father+", "+mother+"}";
	}
}
