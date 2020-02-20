class Account
{
    protected String name, nom;                //Name and nominee name of a customer
    protected String id;                           //Id of a customer
    protected Date dob;                         //Date of birth of a customer. Used custom Date class defined on the top of this file
    protected double balance;                   //Total balance of a customer
    public Account()
    {		
		name="";
		nom="";                //Name and nominee name of a customer
		Date dob=new Date();
	}
    protected Account(String name, String id, Date dob, String nom)    //Permiterized constructor of account class
    {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.nom = nom;
    }
    protected boolean deposite(double amount)                       //Deposites total money into bank balance
    {
        this.balance += amount;
        System.out.println("Deposited "+amount+"tk");
        return true;
        
    }
    protected boolean withdraw(double amount)                       //Withdraws money from total balance
    {
        if(this.balance > amount)
        {
            this.balance -= amount;
            //System.out.println("Deposited "+amount+"tk");
            return true;
        }
        else{
            return false;
        }
    }
    protected void printAccount()                                   //Prints the complete info of the account of a customer
    {
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Nomination Name: "+this.nom);
        System.out.println("Current Balance: "+this.balance);
        System.out.println("Date of birth: "+dob.getDate());
    }
}