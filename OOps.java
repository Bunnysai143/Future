//constructor and class 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        Kiet room1=new Kiet(209,76,"Cai-Ds");
        room1.display();
        System.out.println();
        Kiet room2=new Kiet(210,76,"Cai-Hs");
        room2.display();
        
    }
}

class Kiet{
    int door;
    String branch;
    int count;
     
    public Kiet(int d,int c,String b){
        
        door=d;
        branch=b;
        count=c;
        
    }
    public void display(){
        System.out.println("DoorNo: "+door);
        System.out.println("Branch: "+branch);
        System.out.println("Student count: "+count);
    }
}


//this key word usage

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        Kiet room1=new Kiet(209,76,"Cai-Ds");
        room1.display();
        System.out.println();
        Kiet room2=new Kiet(210,54,"Cai-Hs");
        room2.display();
        
    }
}

class Kiet{
    int door;
    String branch;
    int count;
     
    public Kiet(int door,int count,String branch){
        this.door=door;
        this.branch=branch;
        this.count=count;
    }
    public void display(){
        System.out.println("DoorNo: "+door);
        System.out.println("Branch: "+branch);
        System.out.println("Student count: "+count);
    }
}


//multiple constructors

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        Kiet room1=new Kiet(209,76,"Cai-Ds");
        room1.display();
        System.out.println();
        Kiet room2=new Kiet(210,54,"Cai-Hs");
        room2.display();
        Kiet dis=new Kiet("lavya");
        
        
    }
}
class Kiet{
    int door;
    String branch;
    int count;
     public Kiet(String name){
        System.out.println("hello"+name);
    }
    public Kiet(int door,int count,String branch){
        this.door=door;
        this.branch=branch;
        this.count=count;
    }
    
    public void display(){
        System.out.println("DoorNo: "+door);
        System.out.println("Branch: "+branch);
        System.out.println("Student count: "+count);
    }
}

// constructor practive 


class Main {
    public static void main(String[] args) {
        ChaiShop open= new ChaiShop();
        open.menuDisplay();
        
        ChaiShop c= new ChaiShop();
        c.orderPlace(1,2,2,2);
        c.bill();
        
    }
}

class ChaiShop{
    int Lemon_Teaprice=10;
    int Ice_Coffeprice=12;
    int Biscutprice=5;
    int Boost_Milkprice=15;
    
    int orderL=0;
    int orderI=0;
    int orderB=0;
    int orderM=0;
    int total=0;
    public void orderPlace(int Lemon_Tea,int Ice_Coffe,int Biscut,int Boost_Milk){
        this.orderL=Lemon_Tea*Lemon_Teaprice;
        this.orderI= Ice_Coffe*Ice_Coffeprice;
        this.orderB=Biscut*Biscutprice;
        this.orderM=Boost_Milk*Boost_Milkprice;
        this.total=this.orderL+this.orderI+this.orderB+this.orderM;
      
    }
     
    public void menuDisplay(){
        System.out.println("          Menu           ");
        System.out.println("Timmings"+" "+"7 Am - 6 Pm");
        System.out.println();
        System.out.println("Lemon-Tea"+" "+this.Lemon_Teaprice);
        System.out.println();
        System.out.println("Ice-Coffe"+" "+this.Ice_Coffeprice);
        System.out.println();
        System.out.println("Biscut"+" "+this.Biscutprice);
        System.out.println();
        System.out.println("boost-milk"+" "+this.Boost_Milkprice);
        System.out.println();
    }

  
    public void bill(){
        System.out.println("        Bill                ");
        System.out.println("Leamon Tea: "+orderL);
        System.out.println("Ice Coffe: "+this.orderI);
        System.out.println("Biscut: "+this.orderB);
        System.out.println("Boost Milk "+this.orderM);
        System.out.println();
        System.out.println("Total Bill: "+this.total);
        System.out.println("Thanks For Visiting,Come Again,Have a Nice Day");
    }
    
    
    
    
}


//