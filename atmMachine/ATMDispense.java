package atmMachine;

import java.util.Scanner;

public class ATMDispense {
	
	private DispenseCash chain;
	private DispenseCash thausandNoteDispenser;
	private DispenseCash hundredNoteDispenser;
	private DispenseCash fivehundredNoteDispenser;
	
	public ATMDispense(){
		
		thausandNoteDispenser = new Dispense1000Cash();
		fivehundredNoteDispenser = new Dispense500Cash();
		hundredNoteDispenser = new Dispense100Cash();
		
		chain = thausandNoteDispenser;
		thausandNoteDispenser.setNextChain(fivehundredNoteDispenser);
		fivehundredNoteDispenser.setNextChain(hundredNoteDispenser);
	}
	
	public static void main(String[] args) {
		
		ATMDispense atm = new ATMDispense();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("Enter Amount : ");
			int amount = in.nextInt();
			if(amount % 100 != 0){
				System.out.println("incorrect amount");
				continue;
			}
			atm.chain.dispenseAmount(new Currency(amount));
		}
	}

}
