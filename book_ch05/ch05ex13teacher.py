#폰북 리스트
pList= []

while True:
    print("1.입력 2.출력 3.검색 4.수정 5,삭제 6.종료")
    no = int(input("선택: "))
    if no == 1:
        print("{:-^50}".format("입력기능"))
        people = {}
        people["name"] = input("성명>>> ")
        people["phone"] = input("전화>>> ")
        people["addr"] = input("주소>>> ")
        pList.append(people)
        print("주소 입력 완료!")
    elif no == 2:
        print("{:-^50}".format("출력기능"))
        print("{:^3}{:^10}{:^15}{:^20}".format("번호","성명","전화","주소"))
        print("-"*50)
        for i, p in enumerate(pList):
             print("{:^3}{:^10}{:^15}{:^20}".format(i+1,p["name"],p["phone"],p["addr"]))

    elif no == 3:
        print("{:-^50}".format("검색기능"))

        search = int(input("검색할 번호를 입력: "))
        print("{:^3}{:^10}{:^15}{:^20}".format("번호", "성명", "전화", "주소"))

        for i, p in enumerate([pList[search - 1]]):
            print("{:^3}{:^10}{:^15}{:^20}".format(i + search, p["name"], p["phone"], p["addr"]))

        print("검색내용이 없습니다.")

    elif no == 4:
        print("{:-^50}".format("수정기능"))

    elif no == 5:
        print("{:-^50}".format("삭제기능"))
        del pList[people]
        print(pList)
    elif no == 6:
        print("{:-^50}".format("종료"))
        break
    else:
        print("{:-^50}".format("선택 사항 없음"))