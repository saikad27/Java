class p95{
        int x = 10;
        static int y = 20;

        void fun(){
                System.out.println("In fun");
        }
        static void run(){
                System.out.println("In run");
        }
        public static void main(String[] args){
                p94 obj = new p94();
                System.out.println(x);
                System.out.println(obj.y);
                fun();
                obj.run();
        }
}
