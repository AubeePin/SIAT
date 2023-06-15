import random

number = 0
count = 5
min = 1
max = 100

def check():
    global count
    global min
    global max
print('정답을 맞출 수 있는 기회는 %d입니다.' %count)
user_num = 0
while user_num < min or user_num > max:
    print('정답은 %d~%d사이 입니다.' %(min,max))