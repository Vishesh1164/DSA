n=int(input("Enter range: "))
arr = list(map(int, input().split()))
print(' '.join(str(arr[i]) for i in range(1,n,2)))

#iteration= O(n/2)
# T(C)=O(n)
#S(c)=O(n)
#Auxiliary iteration = O(n/2)
#A(c)=A(n/2)