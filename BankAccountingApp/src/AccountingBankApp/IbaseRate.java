package AccountingBankApp;

public interface IbaseRate {

	// only Method to get BaseRate
	default double GetBaseRate() {
		return 2.5;
	}
}
