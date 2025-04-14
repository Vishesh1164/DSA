#you are given array of integers task is to double only the even elements
#  in the array and find maximum value from modified array

n=int(input("Enter n: "))

arr= list(map(int,input().split()))
max=0
for i in range(n):
    if(arr[i]%2==0):
        arr[i]=arr[i]*2
    if(max<arr[i]):
        max=arr[i]
print(arr)
print("max = "+max)

