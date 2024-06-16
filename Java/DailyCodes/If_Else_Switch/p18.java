class p18{

	public static void main(String[] args){

		String friend = "Kanha";
		System.out.println("Before Switch");
		switch(friend){

			case "Ashish":
				System.out.println("Barclays");
				break;
			case "Kanha":
				System.out.println("BMC Software");
				break;
			case "Rahul":
				System.out.println("Infosys");
				break;
			case "Badhe":
				System.out.println("IBM");
				break;
			default:
				System.out.println("In default state");
		}
		System.out.println("After Switch");
	}
}
