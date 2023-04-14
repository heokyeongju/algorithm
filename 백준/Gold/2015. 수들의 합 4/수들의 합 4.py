# 2023.04.14 부분합
import sys
input = sys.stdin.readline
n, k = map(int, input().split())
A = list(map(int, input().split()))
S = [0] * n
answer = 0

S[0] = A[0]

for i in range(1, n):
    S[i] = A[i] + S[i-1]

count = {}
for i in range(n):
    if S[i] == k:
        answer += 1
    answer += count.get(S[i] - k, 0)
    count[S[i]] = count.get(S[i], 0) + 1

print(answer)