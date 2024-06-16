class p16{

        public static void main(String[] args){

                char ch = 'B';
                System.out.println("Before switch");
                switch(ch){

                        case 'A':System.out.println("A");
                                break;
                        case 'B':System.out.println("B");
                                break;
                        case 'C':System.out.println("C");
                                break;
                        default:System.out.println("In default state");
                }
                System.out.println("After switch");
        }
}
