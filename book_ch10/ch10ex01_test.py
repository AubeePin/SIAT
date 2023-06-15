#새파일 생성
#파일에 내용 출력
# 키보드로 데이터를 입력 받기
#입력 받은 데이터 파일에 출력
#파일 닫기
fp = open("10_test.txt","w",encoding ="utf-8")

fp.write("오늘도 새벽반!\n")

str = input("이름 입력하자>>>")
emaile = input("이메일 입력하자>>> ")
phone = input("전화번호를 입력하자>>>")
fp.write(f"{'str'}|{'emaile'}|{'phone'}\n")
fp.write(f"{str}|{emaile}|{phone}")

fp.close()
