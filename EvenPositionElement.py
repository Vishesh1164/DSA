# Given an array of elements print all its elements only at odd positions in the same order seperated by space
n=int(input("Enter range: "))
arr=list(map(int,input().split()))

# method 1

for i in range(n):
    if(i%2==1):
        print(arr[i],end=" ")
'''
iterations: O(n)
T(c)= O(n)
S(c)= O(n)
A(c)= A(1)
'''
#method 2

for i in range(1,n,2):
    print(arr[i],end=" ")

    '''
iterations: O(n/2)
T(c)= O(n)
S(c)= O(n)
A(c)= A(1)
'''