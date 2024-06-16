class p88{
        void MethodFun(){
                System.out.println("In fun method");
        }
	void MethodGun(){
		System.out.println("In gun method");
	}
        void MethodRun(){
                System.out.println("In run method");
        }
        public static void main(String[] args){

                System.out.println("In main method");
                MethodFun();
		MethodGun();
		MethodRun();

        }
}
