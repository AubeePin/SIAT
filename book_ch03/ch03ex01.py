# ch03ex01.py

#파이썬 변수 선언
name = "홍길동"
age = 26

print(name,"님은 ",age," 세입니다.",sep="",end='\n')
print("%s님은 %d세 입니다." %("김길동",33))
print("{}님은 {}세입니다.".format("김범준",34))
print(f"{name}님은 {age}세 입니다.")

#여러줄 문자열(따옴표 3개)
infoData = """
이것은 여러줄 문자열
주소 : {}\n 
전화번호 : {}
""".format("서울시 강남구","010-1234-5678")

print(infoData)

sql = """
insert into saram
valuse({},{},{})
""".format("hong", "홍길동",33)

print(sql)