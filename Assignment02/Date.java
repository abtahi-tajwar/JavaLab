class Date                                                  //Date class defined for taking date as input in a specific format
{
    public int day, month, year;
    public Date()
    {
        day = 01;
        month = 01;
        year = 01;
    }
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDate()                                 //To return date in a specific format
    {
        return this.day+"/"+this.month+"/"+this.year;
    }
	@Override
	public String toString()
	{
		String tomonth = Integer.toString(month);
		if(tomonth.length() == 1) tomonth = "0"+tomonth;
		return year+"-"+tomonth+"-";
	}
    
}