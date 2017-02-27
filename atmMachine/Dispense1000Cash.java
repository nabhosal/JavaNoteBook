package atmMachine;

public class Dispense1000Cash implements DispenseCash{
	
	private DispenseCash next;
	private final int NOTE_AMOUNT = 1000;
	
	@Override
	public void setNextChain(DispenseCash next) {
		this.next = next;
	}

	@Override
	public void dispenseAmount(Currency cur) {
		
		if(cur.getAmount() >= NOTE_AMOUNT){
			
			int noOfNotes =  cur.getAmount() / NOTE_AMOUNT;
			int remainder = cur.getAmount() % NOTE_AMOUNT;
			System.out.println("Dispensing Rs" + NOTE_AMOUNT + ":  "+noOfNotes);
			if(remainder != 0)
				next.dispenseAmount(new Currency(remainder));
		}else{
			next.dispenseAmount(cur);
		}
		
	}

}
