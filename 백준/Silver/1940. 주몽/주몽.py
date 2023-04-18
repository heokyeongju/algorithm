# 2023.04.18 투포인터
import sys
input = sys.stdin.readline
N = int(input())
M = int(input())
arr = list(map(int,input().split()))
count = 0
i = 0 # start index
j = N-1 # end index

arr.sort()

while i < j:
    if arr[i] + arr[j] == M:
        count += 1
        i += 1
        j -=1
    elif arr[i] + arr[j] < M:
        i += 1
    else:
        j -=1

print(count)