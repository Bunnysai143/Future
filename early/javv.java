// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1, 4, 45, 6, 10, 8};
        int target=16;
        boolean ans=false;
        int len=arr.length;
        int l=0;
        int temp=0;
        int r=len-1;
        Arrays.sort(arr);
        System.out.println("h");
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[l]+arr[r]==target){
                ans=true;
                break;
            }
            else if((arr[l]+arr[mid])>target){
                r=mid-1;
            }else if((arr[mid]+arr[r])>target){
                l=mid+1;
            }else if((arr[l]+arr[mid])<target){
                l=mid+1;
            }else if((arr[mid]+arr[r])>target){
                r=mid+1;
            }
            
        }
        System.out.println(ans);
    }
}


