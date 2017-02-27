package strategyPatterns;

/**
 * @author nileshb
 * 
 * DP principles
 *  1) encapsulate the code that varies 
 *  2) Program to interface not to implementation
 *  3) Favor Composition over inheritance
 *  
 *  Strategy Pattern
 *    Encapsulate the change through composition
 *    use inheritance for non varying code 
 */


public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck rubber = new RubberDuck();
		Duck mallard = new MallardDuck();
		
		rubber.performFly();
		rubber.performQuack();
		
		mallard.performQuack();
		
		rubber.setFly(new FlyWithWings());
		rubber.performFly();
		
	}

}
