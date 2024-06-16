class p89{
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
                p89 obj = new p89();
                obj.MethodFun();
                obj.MethodGun();
                obj.MethodRun();

        }
}
