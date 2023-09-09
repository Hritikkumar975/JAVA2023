class hello{
    int x ;
    char y;
    // hello(int y){
    //     x=y;
    // } 
    // void disp(){
    //     x=12; 
    //     System.out.println(x);
    // }
}
class b extends hello { 
    int q; 
   void disp(){
         x=12; 
         System.out.println(x);
     }

}
class c{
    int p;
    public static void main(String str[]) {
    b obj =new b();
    obj.disp();  
}
}
