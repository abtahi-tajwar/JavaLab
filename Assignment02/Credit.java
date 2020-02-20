class Credit extends Account
{
	private double minBalance;
	private double withdrawLimit;
	public Credit()
	{
		minBalance = -100000;
		withdrawLimit = minBalance*0.5;
		IDGENARATOR id = new IDGENARATOR();
		super.name = "none";		
		super.dob = new Date();
		super.nom = "none";
		super.id = IDGENARATOR.generate(dob);
	}
	public Credit(double amount, double minBalance, double withdrawLimit, 
					String name, Date dob,
					String nom)
	{
		IDGENARATOR id = new IDGENARATOR();
		super.balance = amount;
		super.name = name;
		super.dob = dob;
		super.nom = nom;
		super.id = IDGENARATOR.generate(dob);
		
		this.minBalance = minBalance*-1;
		this.withdrawLimit = withdrawLimit*0.5;

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
		if(amount > withdrawLimit)
		{
			return false;
		}
		else{
			if(super.balance - amount < minBalance)
			{
				return false;
			}
			else{
				super.balance -= amount;
				return true;
			}
		}
	}
	public void printAccount()
	{
		super.printAccount();
	}
}