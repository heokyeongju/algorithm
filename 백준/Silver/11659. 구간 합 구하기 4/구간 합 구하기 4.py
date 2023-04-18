# 2023.04.18 부분합
import sys
input = sys.stdin.readline
n, k = map(int, input().split())
A = list(map(int, input().split()))
S = [0]
tmp = 0


for i in A:
    tmp = tmp + i
    S.append(tmp)

for num in range(k):
    i,j = map(int, input().split())
    print(S[j] - S[i-1])