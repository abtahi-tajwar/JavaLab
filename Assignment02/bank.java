public class bank                                       /*Main class */
{
    public static void main(String[] args)              /* Main method */
    {
        Date d = new Date(12,11,1999);
		//Initialized date of birth of the accounts customer
		IDGENARATOR id = new IDGENARATOR();
        Account b = new Account(); 
		DebitAccount a = new DebitAccount(1000, 20000, 1000000,"Md. Abtahi Tajwar", d, "Maksud Ahmed");
		Credit c = new Credit(1000, 20000, 1000000,"Md. Abtahi Tajwar", d, "Maksud Ahmed");
		Savings s = new Savings(1000,"Md. Abtahi Tajwar", d, "Maksud Ahmed");
		System.out.println("------------------");
		//Initialized an account
        a.printAccount();
        if(a.deposite(10000) == true){                     //Checks if the money successfully deposited
            System.out.println("Deposited");
        }
        a.printAccount(); 
		if(a.deposite(10000000) == false){                     //Checks if the money successfully deposited
            System.out.println("Limit excited");
        }
        a.printAccount();		//Prints the account information
        if(a.withdraw(7000) == true){                      //Checks if the money successfully winthdrawn  
            System.out.println("Withdrawn");
        }
        else{
            System.out.println("Not enough money");
        }
        a.printAccount();
        if(a.withdraw(5000) == true){                       //Checks if the money successfully withdrawn
            System.out.println("Withdrawn");
        }
        else{
            System.out.println("Not enough money");
        }
        c.printAccount();
		check(c.deposite(5000));
		c.printAccount();
		check(c.withdraw(10000));
		c.printAccount();
		check(c.withdraw(10000000));
		c.printAccount();
		
		check(s.deposite(10000000));
		s.printAccount();
		check(s.withdraw(100000));
		s.printAccount();
		System.out.println(IDGENARATOR.generate(d));
			
    }
	private static void check(boolean a)
	{
		if(a == true){
			System.out.println("SUCCESSFUL");
		}
		else{
			System.out.println("UNSUCCESSFUL");
		}
	}	
}


