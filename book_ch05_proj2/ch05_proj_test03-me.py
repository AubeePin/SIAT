todo_list = [
    {"seq":1, "title":"친구 만나기", "done":("완료")},
    {"seq":2, "title":"과제 하기", "done":("미완")},
    {"seq":3, "title":"붕어 밥 주기", "done":("미완")}
]
sequence = 4


def title():
    print("{:-^50}".format("Todo List"))


#아까 메뉴를 만들엇는데 밑에 있는 메뉴와 충돌되서 하나만 지웟습니다.
def menu(*menuItemList) :
    print("{:-^50}".format(menuItemList[0]))
    for i, item in enumerate(menuItemList) :
        if i != 0 :
            #0번째는 타이틀이라  != 0 으로 인해 0번은 제외.
            print(i, ".", item, sep="", end=" ")
    no = int(input("\n선택: "))
    while not(no in range(1, len(menuItemList)) ):
        print("입력 범위를 초과 했습니다.({}~{}사이 입력)".format(1, len(menuItemList)-1))
        no = int(input("다시 선택: "))
    print("-" * 50)
    return no

def search_list_number():
    search_number = input("번호를 입력하세요 >> ")
    while int(search_number) == 0 :
        print("번호 입력하지 않앗습니다.")
        search_number = input("번호를 제대로 입력하세요")

    newList = []
    for no in todo_list:
        if no['seq'] == search_number:
            newList.append(no)

    if len(newList) == 0:
        print("검색 결과 없습니다.")
        return False

    print("{: <3}|{:^15}{: ^10}".format('seq', 'title', 'done'))
    print("-" * 50)
    for i, t in enumerate(todo_list):
        print("{: <3}|{:^15}{: ^10}".format(t['seq'], t['title'], t['done']))

        return True


def process():
    title()
    global sequence

    while True:
        print("{: <3}|{:^15}{: ^10}".format('seq', 'title', 'done'))
        print("-" * 50)
        for i, t in enumerate(todo_list):
            print("{: <3}|{:^15}{: ^10}".format(t['seq'], t['title'], t['done']))

        no = menu("MENU","입력","수정","삭제")

        if no == 1:
            print(":::INPUT:::\n")

            t={
                "seq": sequence,
                "title":input("할일 추가>> "),
                "done":input("미완/완료 >> ")
            }
            todo_list.append(t)

            sequence = sequence + 1
            title()

        elif no == 2:
            print(":::MODIFY:::\n")
            t_no = menu("MODIFY", "번호 변경", "할일 수정", "미완/완료")
            if t_no==1:
                search_list_number()
            elif t_no==2:
                pass
            elif t_no==3:
                pass
            else:
                print("해당사항 없습니다.")


        elif no == 3 :
            print(":::DELETE:::\n")

            del_idx = int(input("삭제 할 번호 입력 >>"))

            del todo_list[del_idx-1]
            print("삭제 완료!")
            title()
        else:

            print("{: <3}|{:^15}{: ^10}".format('seq', 'title', 'done'))
            print("-" * 50)
            for i, t in enumerate(todo_list):
                print("{: <3}|{:^15}{: ^10}".format(t['seq'], t['title'], t['done']))



# ---------------- MODIFY -----------------
# 수정 할 항목 번호 입력 : 3
# [3] (미) 청소하기
#
# ------------------ MENU -----------------
# 1.상태수정 2.할일수정 3.삭제
# 선택: 1




if __name__ == '__main__':
    process()


