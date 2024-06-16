class time{
	public static void main(String[] args){	
		int date,month,year,hour,day;
		date = 27;
		month = 2;
		year = 2004;
		System.out.println("Birthdate:"+date+"/"+month+"/"+year);
		hour = 3600;
		day = 24*hour;
		month = 30*day;
		year = 12*month;
		System.out.println("Total seconds in a day: "+day);
		System.out.println("Total seconds in a month: "+month);
		System.out.println("Total seconds in a year: "+year);
	}
}
