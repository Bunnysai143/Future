// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static List<List<Integer>> generate(int numRows){
        
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        
        arr.add(arr1);
        for(int i=1;i<numRows;i++){
            List<Integer> demo = new ArrayList<>();
            
            demo.add(1);
            
            for(int j=1;j<i;j++){
                int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                demo.add(val);
            }
            
            demo.add(1);
            
            arr.add(demo);
            
            
        }
        
        
        
        
        
        // System.out.println(arr);
        return arr;
        
        
    }
    public static void main(String[] args) {
        // System.out.println(generate(5));
        
        System.out.println(generate(5));
        
        
        
       
    }
}

arr=[]
nums=5
arr.append([1])
for i in range(1,nums):
    a=[]
    a.append(1)
    for j in range(1,i):
        val=arr[i-1][j]+arr[i-1][j-1]
        a.append(val)
    a.append(1)
    
    arr.append(a)
print(arr)




// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {10,9,1,8,7};
        int len=arr.length;
        int ans=0;
        
        for(int i=0;i<len-2;i++){
            List<Integer> demo = new ArrayList<>();
            int sum=0;
            for(int j=i;j<(i+3);j++){
                int a=arr[j];
                sum=sum+a;
                demo.add(sum);
            }
            int a=Collections.max(demo);
            ans=Math.max(ans,a);
            
        }
      System.out.println(ans);  
    }
}


//way 2 for max sum of sl  of 3 brute


 int[] arr = {10,9,1,8,7};
        int ans=0;
        int sl=3;
        int len = arr.length;
        for(int i=0;i<len-(sl-1);i++){
            int j=i+(sl);
            int temp=0;
            // System.out.println(i+" "+j);
            for(int k=i;k<j;k++){
                temp+=arr[k];
               
            }
            ans=Math.max(ans,temp);
            
        }
        System.out.println(ans);


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean checkunique(String s){
         HashSet<Character> set =new HashSet<>();
         for(int i=0;i<s.length();i++){
             if(!set.add(s.charAt(i))){
                 return false;
                
             }
             
         }
         return true;
        
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
       
        String s = "aababcabc";
        int len=s.length();
        int sl=3;
        int count=0;
        for(int i=0;i<=len-sl;i++){
            int j=i+sl;
            
                if(checkunique(s.substring(i,j))){
                    count+=1;
                }
                
        }
        System.out.println(count);
        
        
    }
} 


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        int limit = 4;
        int[] nums = {1,60,34,84,62,56,39,76,49,38};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.println(nums[i]+" "+nums[j]); 
                if((Math.abs(nums[i]-nums[j]))<=limit){
                int val=nums[i];
                nums[i]=nums[j];
                nums[j]=val;
                
               
                
                
            }
            }
            
        }
        System.out.println(Arrays.toString(nums));
    }
}



// System.out.println("Try programiz.pro");
        // int[] arr={9,4,1,7};
        // int k=2;
        // int ans=Integer.MAX_VALUE;
        // Arrays.sort(arr);
        // for(int i=0;i<=arr.length-k;i++){
        //     int j=i+k-1;
        //     // System.out.println(i+" "+j);
        //     int temp=arr[j]-arr[i];
        //     ans=Math.min(ans,temp);
            
        // }
        // System.out.println(ans);



python



# # nums=[1,2,3]

# # ans=[]

# # ans=nums[1:]+nums[:1]
  

# # print(ans)

# # print(nums[1%3])



# A= [1,2,3]
# ans=False
# for i in range(len(A)):
#     B=A[i:]+A[:i]
#     if B==sorted(A):
#         ans=True
# print(ans)



nums =  [1,5,8]
ans1=0
ans=0
for i in range(len(nums)):
    sdfsdf
    for j in range(i,len(nums)):
        h=sorted(list(set((nums[i:j+1]))))
        
        if(len(set(nums))!=1):
          
            if nums[i:j+1]==h:
                ans1=max(ans1,len(nums[i:j+1]))
            
            h.reverse()
            
            if nums[i:j+1]==h and len(nums[i:j+1])>1:
                ans=max(ans,len(nums[i:j+1]))
        else:
            ans=1
            
# sddfprint(inc,"ince")
# print(dic,"dic")
print(max(ans,ans1))
         
     
     

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1};
        int k=3;
        int len =arr.length;
        int l=0;
        int count=0;
        int ans=0;
        for(int r=0;r<len;r++){
            count+=arr[r]; 
            
            // System.out.println(arr[l]);
            while(count>10){
                count-=arr[l];
                l++;
            }
                 ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
        
    }
}





