package atmMachine;

public interface DispenseCash {
	
	void setNextChain(DispenseCash next);
	void dispenseAmount(Currency cur);
	
}
