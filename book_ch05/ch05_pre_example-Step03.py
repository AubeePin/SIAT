import random

lotto = set()

while len(lotto)<6:
    lotto.add(random.randint(1,45))

print("--- 로또번호 생성 ---")

for i in lotto:
    print(i,end="\t")