class IDGENARATOR
{
    private static int serial_no = 0;
	public IDGENARATOR()
	{
		serial_no++;
	}
    public static String generate(Date d)
    {
		String f = "";
        String a = Integer.toString(serial_no);
		int len = a.length();
		if(len <= 5){
			int size;
			size = (5 - len);
			for(int i = 0; i < size; i++){
				f += "0";
			}
			f += a;
			f = d.toString() + f;
		}		
		else{
			f = Integer.toString(serial_no);
			f = d.toString() + f;
		}
		
		return f;
		
    }
}