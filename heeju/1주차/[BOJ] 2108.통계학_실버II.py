import statistics

N = int(input())
ls = [int(input()) for _ in range(N)]

def avg(num, list_num):
    return int(round(sum(list_num)/num, 0))

def mid(num, list_num):
    list_num.sort()
    return list_num[num//2]

def freq(list_num):
    # if len(list_num) > 1: 
    #     copy_list_num = list_num.copy()
    #     result = statistics.mode(copy_list_num)
    #     cnt = copy_list_num.count(result)
    #     while result in copy_list_num:
    #         copy_list_num.remove(result)
    #     result1 = statistics.mode(copy_list_num)
    #     if cnt == copy_list_num.count(result1):
    #         return result1
    #     else:
    #         return result
    # else: 
    #     return list_num[0]                --- 시간 초과 발생 
    
    result = 0 
    result1 = 0
    for i in range(list_num):
        m = statistics.mode(list_num)
        if m >= result:
            result = m 
        else:
            if m >= result1:
                result1 = m 

    return statistics.mode(list_num)


def ran(list_num):
    return max(list_num) - min(list_num)

print(avg(N, ls))
print(mid(N, ls))
print(freq(ls))
print(ran(ls))
