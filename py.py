nums =  [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1]
count=0
k=2
l=0
ans=0
for i in range(len(nums)):
    if(nums[i]==0):
        count+=1
    while(count>2):
        if(nums[l]==0):
            count-=1
        l+=1;
    ans=max(ans,i-l+1)
    
print(ans)