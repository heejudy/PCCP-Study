N = int(input())
cards = set(map(int, input().split()))

M = int(input())
nums = list(map(int, input().split()))

for x in nums:
    if x in cards:
        print(1, end=' ')
    else:
        print(0, end=' ')