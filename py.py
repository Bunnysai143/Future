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

# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# s = "abc"
# ans=""
# # for i in range(0,len(s)-1):
# #     print(s[i])
# #     if(s[i+1].isdigit() and  not s[i].isdigit()):
# #         None
# #     elif(s[i+1].isdigit() and s[i].isdigit()):
# #         None
# #     elif(not s[i+1].isdigit() and s[i].isdigit()):
# #         ans+=s[i+1]
# #     elif(not s[i+1].isdigit() and not s[i].isdigit()):
# #         ans+=s[i]
# #         ans+=s[i+1]
# #     else:
# #         ans+=s[i]

# l=0
# h=len(s)-1
# while l<h:
#     if(not s[l+1].isdigit()):
#         ans+=s[l]
#     if(s[l+1].isdigit and not s[l].isdigit):
#         ans+=""
#     else:
#         ans+=s[l]
#     l+=1


# print("ans",ans)

s = "daabcbaabcbc"
part = "abc"
le=len(part)
temp=""

dic={}
for i in s:
    if i in dic:
        dic[i]+=1
    else:
        dic[i]=0
print(dic)
for i in range(len(part)-1):
    if part[i] in dic:
        if(dic[part[i]]==dic[part[i+1]]):
            dic.pop(part[i])
            dic.pop(part[i+1])
        elif(dic[part[i]]%2!=0):
            dic.pop(part[i])
            
        
print(dic)
# for i in range(len(s)):
#     if(s[i:i+le]!=part):
#         temp+=s[i:i+le]
    
    
# print(set(temp))
# print(s)


# # 
# for i in s:
# #     if i in part:
# #         ans+=i
# #     else:
# #         print(i)
# # print(ans)

        
# # Online Python compiler (interpreter) to run Python online.
# # Write Python 3 code in this online editor and run it.
# print("Try programiz.pro")

s="ab22"

# print(not h.isdigit())
ans=[]
for i in range(len(s)):
    if(not s[i].isdigit()):
        print(s[i])
        ans.append(s[i])
    
    if(len(ans)>=1):
        if(s[i].isdigit()):
            ans.pop()
    
    
print(ans)



# h=[1,2]
# h.pop()
# h.pop()
# print(h)
nums = [2,11,10,1,3]
k = 10

n=nums.copy()

n.sort()
print(n)
# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
n=4
k=4
arr=[i for i in range(1,n+1) if n%i==0]

if(len(arr)>=k):
    print(arr[k-1])
else:
    print(-1)






if len(nums)>2:
     for i in range(len(nums)-1):
         if(not min(nums)>=k):
             
             h=min(n[i], n[i+1]) * 2 + max(n[i],n[i+1])
             print(n[i+1])
             print("before",nums)
            #  nums.remove(n[i+1])
            #  n.remove(n[i+1])
             index=nums.index(n[i+1])
             
             nums[index]=h
             
             nums.remove(nums[nums.index(n[i])])
                
             print("after",nums)
             n[i]=h
             n.remove(n[i+1])
             print("demo",n)
             
print(nums)
nums = [1,3,2,1,5,4]
k = 2
h=0
for i in range(len(nums)):
    f=i - k
    l=i+k
    if(f>=0 and nums[i]>nums[f]):
            h+=nums[i]
    elif(l<len(nums) and nums[i]>nums[l]):
            h+=nums[i]
            

    
print(h)
        
        