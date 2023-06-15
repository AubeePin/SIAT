#숫자 2개을 입력 받아서 4칙 연산 하기

num1 = int(input("num1 입력 :"))
num2 = int(input("num2 입력 :"))
#형변환 해야 한다.
#int(),floak(),str()...
sum = num1 + num2
print(str(num1) + "+" + str(num2) + "=" + str(sum))

maximum =max(num1,num2)
print(f"{num1}와 {num2}중에 큰 수는 {maximum}이다.")