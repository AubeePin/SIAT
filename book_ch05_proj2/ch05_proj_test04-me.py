sequence = 4

todo_list = [
    {"seq":1, "done":"완료", "title":"친구 만나기"},
    {"seq":2, "done":"미완료", "title":"과제하기"},
    {"seq":3, "done":"미완료", "title":"붕어 밥 죽기"}
]

def title():
    print("{:-^50}".format("Todo List"))
    print("{: <3}|{: ^15}|{: ^20}".format('seq','done','title'))
    print("-" * 50)
    for i, t in enumerate(todo_list):
        print("{: <3}|{: ^15}|{: ^20}".format( t['seq'], t['done'],t['title']))

def menu(*menuItemList) :
    print("{:-^50}".format(menuItemList[0]))
    for i, item in enumerate(menuItemList) :
        if i != 0 :
            print(i, ".", item, sep="", end=" ")
    no = int(input("\n선택: "))
    while not(no in range(1, len(menuItemList)) ):
        print("입력 범위를 초과 했습니다.({}~{}사이 입력)".format(1, len(menuItemList)-1))
        no = int(input("다시 선택: "))
    print("-" * 50)
    return no

def modify():
    title()
    sequence = int(input("수정 할 번호 >>"))
    for t in todo_list:
        if t['seq'] == sequence:
            t_no = menu("수정 선택", "미완/완료 수정", "할일 수정")
            if t_no == 1:
                t['done'] = input("미완/완료 수정 >>")
            elif t_no == 2:
                t['title'] = input("할일 수정 >>")
            print("수정완료")



def process():
    title()
    global sequence


    while True:

        no = menu("MENU", "입력", "수정", "삭제")

        if no == 1:
            t = {
                'seq': sequence,
                'done': input("미완/완 >> "),
                'title': input("할일 입력 >> ")
            }
            todo_list.append(t)
            sequence = sequence + 1
            title()
        elif no == 2:
         modify()
         title()

        elif no == 3:
            del_idx = int(input("삭제할 번호 입력>> "))
            del todo_list[del_idx-1]

            print("삭제완료")
            title()

if __name__ == '__main__':
    process()
    title()