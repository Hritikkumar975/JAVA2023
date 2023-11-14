// Program to show example of Dynamic Method Dispatch.
class Car{
    String c,n,e;
    int hp,t;
    void body(){
    }
    void specs(){
        System.out.println("This is a "+c+" color "+n+". It has 8.0L Turbo-Charged "+e+" engine, Which produces "+hp+"ps of HorsePower and a torque of "+t+"Nms. It has 7 speed dual-clutch transmission. With a 5 star N-cap Safety Ratings");
    }
}
class Bugatti extends Car{
     void body(){
        c="Blue";
        n="Bugatti Chiron";
        e="W16";
        hp=1500;
        t=1000;
    }
}
class McLaren extends Car{
     void body(){
        c="Orange";
        n="McLaren 720s";
        e="V8";
        hp=916;
        t=900;
    }
}
class I14{
    public static void main(String str[]){
        Car obj=new Bugatti();
         obj.body();
        obj.specs();
        obj=new McLaren();
        obj.body();
        obj.specs();
    }
}