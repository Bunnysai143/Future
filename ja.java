// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static Integer fun(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        
        System.out.println(fun(4));
        
        
        
    }
}