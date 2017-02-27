package strategyPatterns;

public abstract class Duck  {
	
	FlyBehaviour fly;
	
	public void setFly(FlyBehaviour fly) {
		this.fly = fly;
	}
	
	public void setQuick(QuackBehaviour quack) {
		this.quack = quack;
	}
	
	QuackBehaviour quack;
	
	abstract void display();
	
	public void performFly(){
		fly.fly();
	}
	
	public void performQuack(){
		quack.quack();
	}
}
