
#open()함수를 쓰기 모드로 실행 하면 파일 생성 됨.
#상대 경로에 파일이 생성된다.
#한글 사용 할 때는 encoding = "UTF-8" 속성 필요하다.
fp = open("io_test.txt","w",encoding="utf-8")

#파일에 내용쓰기
fp.write("Hello world\n")

#input
str = input("입력>>>")
fp.write(str)

#열려진 파일 닫기(close)
fp.close()



