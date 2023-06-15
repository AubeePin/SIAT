import random

min = 1
max = 100
k = random.randint(min,max)
numder = 0
cnt = 0
size = 5
yn = "y"

print(":::UP & Down 숫자 맞추기 게임:::")
print(f"숫자를 선택했습니다 (힌트 : {k})")
number = int(input(f"{min} ~{max} 사이 입력 : "))

while numder in range(1,100):
    if k < number :
        print("입력된 숫자가 낮습니다.")
        numder = int(input(f"{min} ~{max} 사이 입력 : "))
    elif k > number:
        print("입력된 숫자가 높습니다.")
        numder = int(input(f"{min} ~{max} 사이 입력 : "))
    else:
        print("정답입니다.")