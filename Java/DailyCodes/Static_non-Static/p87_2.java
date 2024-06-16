class p87_2{
        void fun(){
                System.out.println("In fun method");
        }
        static void run(){
                System.out.println("In run method");
        }
        public static void main(String[] args){

                System.out.println("In main method");
                run();
		p87_2 obj = new p87_2();
		obj.fun();
        }
}
