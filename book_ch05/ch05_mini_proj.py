import sys

sequence = 5
pList = [
    {"seq":1, "name":"HONG", "phone":"010-1111-1111", "addr":"서울시 강남구"},
    {"seq":2, "name":"KIM", "phone":"010-1111-2222", "addr":"대구시 수성구"},
    {"seq":3, "name":"LEE", "phone":"010-1111-3333", "addr":"부산시 사하구"},
    {"seq":4, "name":"PARK", "phone":"010-1111-4444", "addr":"광주시 송정동"}
]


######

def search_list_name() :
    search_name = input("이름으로 검색 >>")
    while len(search_name) == 0:
        print("검색어를 입력 하지 않았습니다.")
        search_name = input("이름으로 검색 >>")

    newList = []
    for p in pList:
        if p['name'] == search_name:
            newList.append(p)

    if len(newList) == 0:
        print("검색 결과 없습니다.")
        return False

    print("{: <3}|{: ^10}|{: ^20}|{: ^30}".format('no', 'NAME', 'PHONE', 'ADDRESS'))
    print("-" * 60)
    for i, p in enumerate(newList):
        print("{: <3}|{: ^10}|{: ^20}|{: ^30}".format(p['seq'], p['name'], p['phone'], p['addr']))

    # 검색 결과가 있을 경우 True 반환
    return True


######


def menu(*menuItemList) :
    print("{:-^50}".format(menuItemList[0]))
    for i, item in enumerate(menuItemList) :
        if i != 0 :
            #0번째는 타이틀이라  != 0 으로 인해 0번은 제외.
            print(i, ".", item, sep="", end=" ")
    no = int(input("\n선택: "))
    while not(no in range(1, len(menuItemList)) ):
        print("입력 범위를 초과 했습니다.({}~{}사이 입력)".format(1, len(menuItemList)))
        no = int(input("다시 선택: "))
    print("-" * 50)
    return no

# menu("INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END")
# menu("이름 수정","성적 수정")


# 나중에 함수 배우고 MVC - Model + View + Controller 패턴으로 구현 한다.
# 지금은 단순히 제어문과 약간의 함수로만 구현한다.
def phonebook() :
    # 함수 내부에서 외부에 선언된 전역변수 수정 하려면 global 선언 필수. *********(아까 내가 물어본것)
    global sequence

    while True :
        no = menu("MENU", "INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END")

        if no == 1:
            print("::::: INPUT :::::")
            p = {
                "seq": sequence,
                "name": input("성명 입력>> "),
                "phone": input("전화 번호 입력>> "),
                "addr": input("주소 입력>> ")
            }
            pList.append(p)
            # 전역변수 수정하기 위해 함수 내부에서 global로 선언 했다. (아까물어본 결과물)
            sequence = sequence + 1

        elif no == 2 :
            print("::::: OUTPUT :::::")
            print("{: <3}|{: ^10}|{: ^20}|{: ^30}".format('no', 'NAME', 'PHONE', 'ADDRESS'))
            print("-" * 60)
            for i, p in enumerate(pList):
                print("{: <3}|{: ^10}|{: ^20}|{: ^30}".format(p['seq'], p['name'], p['phone'], p['addr']))

        elif no == 3 :
            print("::::: SEARCH :::::")
            s_no = menu("검색 선택", "이름검색", "번호검색", "주소검색")
            if s_no == 1 :
                search_list_name()
            elif s_no == 2 :
                pass
            elif s_no == 3 :
                pass
            else :
                print("해당 사항 없습니다!")
        elif no == 4 :
            print("::::: MODIFY :::::")
            if search_list_name() :
                seq = int(input("수정 할 번호 >>"))
                for p in pList :
                    if p["seq"] == seq :
                        s_no = menu("수정 선택", "이름수정", "번호수정", "주소수정")
                        if s_no == 1 :
                            p["name"] = input("새 이름 입력 >>")
                        elif s_no == 2 :
                            p["phone"] = input("새 번호 입력 >>")
                        elif s_no == 3 :
                            p["addr"] = input("새 주소 입력 >>")
                        else :
                            print("해당 사항 없습니다!")
        elif no == 5 :
            print("::::: DELETE :::::")
            print("{: <3}|{: ^10}|{: ^20}|{: ^30}".format('idx', 'NAME', 'PHONE', 'ADDRESS'))
            print("-" * 60)
            for i, p in enumerate(pList):
                print("{: <3}|{: ^10}|{: ^20}|{: ^30}".format(i, p['name'], p['phone'], p['addr']))
            del_idx = int(input("삭제 할 idx 입력 >>"))
            del pList[del_idx]
            print("삭제 완료!")

        elif no == 6 :
            print("--- 프로그램 종료 ---")
            print("다음에 만나요^^")
            sys.exit(0)

        else :
            pass

if __name__ == '__main__' :
    phonebook()