#list - 배열 처럼 index 첨자를 사용한다.
#set - key나 index가 없다. 중복된 데이터가 없다.
#dict - key를 사용한다. key와 value의 쌍으로 요소가 저장된다. key의 중복 없다.
import random

lotto = set()
print('type:', type(lotto))

lotto.add(1)
lotto.add(1)
lotto.add(2)
lotto.add(2)
lotto.add(2)
lotto.add(3)
lotto.add(3)
print(len(lotto))
for i in lotto:
    print(i,end="\t")