# 2023.04.18 투포인터
import sys
input = sys.stdin.readline
n = int(input())
arr = list(map(int,input().split()))
count = 0
arr.sort()

for k in range(n):
    i = 0
    j = n - 1 # k-1이 아닌 이유 : arr에 중복된 수가 있을 수 있음
    x = arr[k]
    while i < j:
        if arr[i] + arr[j] == x:
            if i != k and j != k:
                count += 1
                break # while문 종료 -> k가 1 증가된 다음 for문
            elif i == k:
                i += 1
            elif j == k:
                j -= 1
        elif arr[i] + arr[j] < x:
            i += 1
        else:
            j -= 1

print(count)