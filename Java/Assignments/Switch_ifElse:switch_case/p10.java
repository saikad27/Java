class p10{

    public static void main(String[] args) {
        System.out.println("Choose any number from 0 to 5 to select following options:");
	System.out.println("1:Pizza\n2:Burger\n3:Salad\n4:Pasta\n5:Ice Cream\n0:Exit");
	int choice = 3; 

        switch (choice) {
            case 1:
                System.out.println("You selected Pizza. Enjoy your meal!");
                break;
            case 2:
                System.out.println("You selected Burger. Enjoy your meal!");
                break;
            case 3:
                System.out.println("You selected Salad. Enjoy your meal!");
                break;
            case 4:
                System.out.println("You selected Pasta. Enjoy your meal!");
                break;
            case 5:
                System.out.println("You selected Ice Cream. Enjoy your dessert!");
                break;
            case 0:
                System.out.println("Exiting the menu. Bon appétit!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 0 and 5.");
        }
    }
}

