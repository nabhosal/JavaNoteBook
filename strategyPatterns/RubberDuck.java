package strategyPatterns;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		fly = new FlyWithoutWings();
		quack = new MuteQuack();
	}
	
	@Override
	void display() {
		System.out.println("I'm Rubber Duck");
		
	}
	
	
	
}
