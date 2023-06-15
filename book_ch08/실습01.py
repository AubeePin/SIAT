name = input("이름 입력 >> ")

while True:
    try:#예외 발생가능성있는 부분에 트라이!
        age = int(input("나이 입력 >> "))
        break#출력 없을경우엔 브랙 넣어서 거기까지 멈춤
    except:#예외가 발생하면 실행합니다.
        print("숫자로 입력해야 합니다. 나이를 다시입력해주세요.")
        continue
#8장 맛보기 예제 참고할것. 컨티뉴는 계속하다/지속하다 라는 뜻을 가지고 있습니다. 컨티뉴 브랙 패스 3개 적절하게 사용할것

print(name + "님은", end="")#여기부터는 실습 문제 보고 따라치면됩니다.
if age < 19:
    print("미성년자 입니다.")
elif age < 35:
    print("청년입니다.")
elif age < 65:
    print("중년입니다.")
else:
    print("노년입니다.")