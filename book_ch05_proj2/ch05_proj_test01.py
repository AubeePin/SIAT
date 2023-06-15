#1교시

lis = [
    {"score": 95, "rank":1},
    {"score": 85, "rank":1},
    {"score": 75, "rank":1},
    {"score": 10, "rank":1},
    {"score": 60, "rank":1},
    {"score": 75, "rank":1},
]

#lis반복한다.
#score를 비교한다.
#다른요소의 score가 현재요소의 score크면 rank 증가
#랭크를 하나하나 따지면서 비교하는거라 와일문을 넣는다 (계속 반복이라)

i = 0;
while i < len(lis) :
    lis[i]["rank"] = 1
    j = 0;
    while j < len(lis) :
        if lis[i]['score'] < lis[j]['score'] :
            lis[i]["rank"] = lis[i]["rank"] + 1
        j += 1
    i += 1


# 반복문을 이용한 정렬
# 선택 정렬이 제일 쉽다.
i = 0
while i<len(lis)-1 :
    j = i+1
    while j<len(lis) :
        if lis[i]['score'] < lis[j]['score'] :
            # 파이썬에서는 튜플을 이용한 swap 가능
            (lis[i], lis[j]) = (lis[j], lis[i])
        j += 1
    i += 1

for std in lis :
    print(std)