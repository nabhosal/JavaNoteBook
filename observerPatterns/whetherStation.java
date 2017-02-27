package observerPatterns;

/*
 * DP 4 : design based on loosely coupled 
 * 
 */

public class whetherStation {

	public static void main(String[] args) {
		
		WhetherData whetherdata = new WhetherData();
		
		ForcastAddedByTwo add = new ForcastAddedByTwo(whetherdata);
		ForcastMultBy2 mult =  new ForcastMultBy2(whetherdata);
		
		whetherdata.setMeasurment(1, 2, 3);
		whetherdata.setMeasurment(10, 20, 30);
		whetherdata.setMeasurment(100, 200, 300);
	
	}

}
