// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Main {
    public static int binCheck(int[] arr,int t){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;  
            else if(t>arr[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5};
        int t=0;
        int ans=binCheck(arr,t);
        System.out.println(ans);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static char isCheck(char[] arr,int t){
        int r=arr.length-1;
        int l=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>t){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(r>=0){
            return arr[r];
        }
        return 'a';
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        char[] arr={'c','e','j','k','y'};
        char target='z';
        System.out.println(isCheck(arr,target));
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public  int LeftMost(int[] nums,int target){
        if(nums.length<=0){
            return -1;
        }
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(l>nums.length){
            return -1;
        }
        if(nums[l]!=target){
            return -1;
        }
        return l;
    }
    public  int RightMost(int[] nums,int target){
        if(nums.length<=0){
            return -1;
        }
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]!=target){
            return -1;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<Integer> li=new ArrayList<>();
        int[] nums={};
        int target=0;
        li.add(LeftMost(nums,target));
        li.add(RightMost(nums,target));
        System.out.println(li)
        
    }
}