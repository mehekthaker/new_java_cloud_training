//Contains abstract method withdraw(), parameterized constructor and a deposit method 
public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;

//setters and getters for accNo	
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public int getAccNo() {
		return accNo;
	}
	
//setters and getters for accNm		
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
//setters and getters for accBal	
	public void setAccBal(float accBal)
	{
		this.accBal=accBal;
	}
	public float getAccBal() {
		return accBal;
	}
	
//Parameterized constructor	
	BankAcc(int accNo, String accNm, float accBal)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

//abstract method	
	abstract public void withdraw(float amount);

//adds the deposit to the account balance	
	public void deposit(float amount)
	{
		this.accBal += amount;
	}
	
//displays the output	
	@Override
	public String toString()
	{
		return "BankAcc [ accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
