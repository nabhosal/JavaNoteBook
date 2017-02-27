package threads;

public enum EnumWithMethod {
	
	NILESH{
		public String getFather(){ return "Ashok"; };
		public String getMother(){ return "Jyoti"; };
		public String getParents(){ return "{ "+getFather()+", "+getMother()+" }"; };
	},
	CHETANA{
		public String getFather(){ return "Sudhakar"; };
		public String getMother(){ return "Ranjana"; };
		public String getParents(){ return "{ "+getFather()+", "+getMother()+" }"; };
	},
	PRATIK{
		public String getFather(){ return "Prakash"; };
		public String getMother(){ return "Jyoti"; };
		public String getParents(){ return "{ "+getFather()+", "+getMother()+" }"; };
	};
	
	public String getFather(){ throw new AbstractMethodError(); };
	public String getMother(){ throw new AbstractMethodError(); };
	abstract String getParents();
}
