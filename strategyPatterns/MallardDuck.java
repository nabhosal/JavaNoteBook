package strategyPatterns;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		fly = new FlyWithoutWings();
		quack = new Quack();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm MallardDuck");
	}

}
