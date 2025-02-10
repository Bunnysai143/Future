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

