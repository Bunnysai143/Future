package oops;
class chaiSHop{
    int cost=100;

    class room{
        String add="apple";
    }

}

public class nestclass {
    public static void main(String[] args){
        chaiSHop shp=new chaiSHop();
        chaiSHop.room rm=shp.new room();

        System.out.println(rm.add);

    }
}
