class DebitAccount extends Account
{
	private double depositeRange;
	private double accountLimit;
	public DebitAccount()
	{
		IDGENARATOR id = new IDGENARATOR();
		super.name = "none";
		super.dob = new Date();
		super.nom = "none";
		super.id = IDGENARATOR.generate(dob);
		
		depositeRange = 20000;
		accountLimit = 100000;
	}
	public DebitAccount(double amount, double depositeRange, double accountLimit, String name, 
							Date d, String nom)
	{   
		IDGENARATOR id = new IDGENARATOR();
		super.name = name;
		super.dob = d;
		super.nom = nom;
		super.id = IDGENARATOR.generate(dob);
		this.depositeRange = depositeRange;
		this.accountLimit = accountLimit;
		if(deposite(amount)){
			System.out.println("Successfully Deposited");
		}
		else{
			
			System.out.println("Unable to deposite please check all the criterias");
		}
	}
	
	@Override
	public boolean deposite(double amount)
	{
		if(super.balance > depositeRange){
			return false;
		}
		else{
			if(super.balance + amount > accountLimit)
			{
				return false;
			}
			else{
				super.balance += amount;
				return true;
			}
		}
	}
	
	public boolean withdraw(double amount)
	{
		return super.withdraw(amount);
	}
	public void printAccount()
	{
		super.printAccount();
	}
}