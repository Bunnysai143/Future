// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean fun(int[] ar1,int[] ar2){
        
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]!=ar2[i]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        int[] ar1={1,2,3};
        int[] ar2={1,2,3};
        System.out.println(fun(ar1,ar2));
        
    }
}