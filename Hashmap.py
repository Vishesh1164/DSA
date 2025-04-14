n = int(input())
arr = list(map(int, input().split()))

freq = {}

for i in range(n):
    if arr[i] in freq:
        freq[arr[i]] += 1
    else:
        freq[arr[i]] = 1

    if freq[arr[i]] == 1:
        print(arr[i])
        break
