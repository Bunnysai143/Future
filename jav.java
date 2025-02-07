// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,3,1,1,6,7,1,0,1};
        int count=0;
        int k=2;
        int l=0;
        int ans=0;
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==1){
                count+=1;
            }
            while(count>2){
                if(arr[l]==1){
                    count-=1;
                }
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        System.out.println(ans);
        
    }
}




class Main{
    public static void main(String[] args){
        int[] arr={12,1,3,1,1,6,7,1,8,1};
        int count=0;
        int len=arr.length;
        int ans=0;
        int l=0;
        int k=2;
        for(int r=0;r<len;r++){
            
            if(arr[r]%2!=0){
                count+=1;
            }
            
            while(count>2){
                if(arr[l]%2!=0){
                    count-=1;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
            
        }
        System.out.println(ans);
    }
}

