class Savings extends Account
{
	public Savings()
	{
		IDGENARATOR id = new IDGENARATOR();
		super.name = "none";		
		super.dob = new Date();
		super.nom = "none";
		super.id = IDGENARATOR.generate(dob);
	}
	public Savings(double amount, String name, Date dob,
					String nom)
	{
		IDGENARATOR id = new IDGENARATOR();	
		
		super.balance = amount;
		super.name = name;
		super.dob = dob;
		super.nom = nom;
		super.id = IDGENARATOR.generate(dob);
		
		
	}
	
	@Override
	public boolean deposite(double amount)
	{
		super.balance += amount;
		return true;
	}
	@Override
	public boolean withdraw(double amount)
	{
		super.balance -= amount;
		return true;
	}
	public void printAccount()
	{
		super.printAccount();
	}
}