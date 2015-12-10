package ie.wit.assignment.implObjects;
/*This class is a subclass of parent and is representative of parents who do not pay the full fee upfront*/
public class InstallmentPayment extends Parent
{
	private int frequency; //1, 3, 6
	private float installmentAmount;
	private float amountLeftToPay;

	public InstallmentPayment(int index, String fName, String lName, String address01, String address02, String contactNo, String email,  int frequency, String paymentMethod, int placeInGroup)
	{
		super(index, fName, lName, address01, address02, contactNo, email,  paymentMethod, 5, placeInGroup);
		this.frequency = frequency;
		installmentAmount = calculateInstallmentAmount();
		amountLeftToPay = fee;
	}

	public int getFrequency()
	{
		return frequency;
	}

	public void setFrequency(int frequency)
	{
		this.frequency = frequency;
	}

	public float getInstallmentAmount()
	{
		return installmentAmount;
	}

	public void setInstallmentAmount(){
		installmentAmount = calculateInstallmentAmount();
	}
	public float getAmountLeftToPay(){
		return amountLeftToPay;
	}

	private float calculateInstallmentAmount()
	{
		return fee / frequency;
	}

	@Override
	public void paymentMade()
	{
		amountLeftToPay -= installmentAmount;
		if (amountLeftToPay <= 0){
			fullyPaid = true;
		}
	}
}
