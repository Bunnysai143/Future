// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int left(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=0){
                r=mid-1;
                
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public static int leftt(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=1){
                r=mid-1;
            }else{
                l=mid+1;
 }
        }
        return l;
        
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={0,0,0,0,0,0,0,0,0};
        int left=left(arr);
        int right=arr.length-leftt(arr);
        System.out.println(right);
    }
}