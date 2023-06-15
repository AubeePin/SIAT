grade = 'F'
score = int(input("성적을 입력하세요 : "))

#score<0 or score>100
while not (score in range(0,101)) :
    print("Error!")
    score = int(input("성적을 다시 입력하세요 : "))

if score >= 90 :
    grade = 'A'
elif score >= 80 :
    grade = 'B'
elif score >= 70 :
    grade = 'C'
elif score >= 60 :
    grade = 'D'

num = score % 10
if num > 7 :
    grade = str(grade) + "+"
elif num < 3 :
    grade = str(grade) + "-"

print("{}점은 {}학점입니다.".format(score,grade))