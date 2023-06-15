#매개변수가 없고 return만 있는 함수도 있습니다.
def mkPersonDict():
    name = input("성명 입력 >>>")
    phone = input("전화번호 입력 >>>")

    return {"name":name,"phone":phone}

#전화번호 정보를 저장할 리스트 준비
dictList = []
#딕셔너리 생성 함수 호출
dictList.append(mkPersonDict())
dictList.append(mkPersonDict())
dictList.append(mkPersonDict())

for dic in dictList:
    print(dic)