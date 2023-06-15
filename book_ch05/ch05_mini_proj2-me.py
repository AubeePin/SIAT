import sys

sequence = 1
std_list = []
#두번째 입력창
def menu():
    print("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료")
    no= int(input("1~ 6번 중에 하나만 입력해주세요.>> "))
    return no

#맨위 제목 타이틀
def title():
    print("-"*50)
    print("{:^50}".format("성적 관리 프로그램"))
    print("-"*50)

#입력창 검색시 나오는것 <- 잘몰라도 이미 배운내용이라 보고 따라 치면된다. (나중에는 알아서 칠수있게 자세히 잘 살펴보자)
def search_list():
    search_name = input("이름으로 검색>> ")
    while len(search_name) == 0 :
        print("검색어 입력 하지 않았습니다.")
        search_name = input("이름으로 검색 >>")

        newList=[]
        for s in std_list :
            if s['name'] == search_name:
                newList.append(s)

        if len(newList) == 0:
            print("검색 결과가 없습니다.")
            return False #검색결과가 없으면 거짓
        print("{: <3}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}".format('seq', 'name', 'kor', 'eng', 'mat','total', 'avg', 'grade', 'rank'))
        print("-"*60)
        for i, s in enumerate(newList):
            print("{: <3}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}".format(s['seq'], s['name'], s['kor'], s['eng'], s['mat'],s['total'], s['avg'], s['grade'], s['rank']))
            return True #검색결과가 있을 경우 True 반환


#메뉴창에 숫자넣을때 의 조건?
# #대괄호에 숫자들어가면 랭스라고 알려주었다. 랭스? 범위?
def menu(*menuItemList):
    print("{:-^50}".format(menuItemList[0]))
    for i, item in enumerate(menuItemList):
        if i != 0:
            print(i, ".", item, sep="", end=" ")
        #sep와 seq이 다른가보다?
        #이부분은 모르겠지만 수업시간에 넣었으니 넣어본다. - 나중에 물어봐야겠다. 새벽이라 누구에게 물어볼수가 없네.. ㅠ
    no = int(input("\n선택>>"))
    while not(no in range(1, len(menuItemList))):
        print("입력 범위를 초과했습니다.({}~{}사이 입력)".format(1,len(menuItemList)))
        no = int(input("다시 선택"))
    print("-"*50)
    return no

#학생 성적 계산 + 다 알려주셧다. 그러나 내가 못하는것뿐 ㅠ...
def input_std() :
    global sequence
    print("입력")
    std = {
            "seq" : sequence,
            "name" : input("성명>>"),
            "kor" : int(input("국어점수>>")),
            "eng" : int(input("영어점수>>")),
            "mat" : int(input("수학점수>>")),
            "total" : 0,
            "avg" : 0.0,
            "grade" : "F",
            "rank" : 1
    }
    std["total"] = std["kor"] + std["eng"] + std["mat"]
    std["avg"] = std["total"] / 3.0
    std["grade"] =  "A" if std["avg"] >= 90 else ("B" if std["avg"] >=80 else ("C" if  std["avg"] >=70 else ("D" if  std["avg"] >=60 else "F")))

    std_list.append(std)
    sequence = sequence + 1
    #내부에 넣어도되지만 미리 넣어도 될것같았따.


#메인 + 시퀸스 포함되게 넣었다
def process():
    title()
    global sequence

    while True :
        no = menu("성적관리메뉴","1.입력"," 2.출력"," 3.검색", "4.수정", "5.삭제", "6.종료")
        if no == 1:
            print(":::입력 기능:::")
            #def대해서 아까 어제 물어봣엇고 함수내부에 넣으면 그걸 실행된다는걸 알았다.
            input_std()
            #외부에 인풋 스튜드 이미 복붙했고! 여기에 넣어본다. 아직도 에러가 뜬다 (울고싶다.)

        elif no == 2:
            print(":::출력 기능:::")
            #전화번호부 폰 출력 기능을 살펴보니까 맨위에 복붙한거 비슷해서 복붙하기로 한다.
            print("{: <3}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}".format('seq', 'name', 'kor', 'eng',
                                                                                          'mat', 'total', 'avg',
                                                                                          'grade', 'rank'))
            print("-" * 75)
            for i, s in enumerate(std_list):
                #()안에 좀 변경했다 출력은 학생리스트에서 하는거니까.
                print("{: <3}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}|{: ^8}".format(s['seq'], s['name'],
                                                                                              s['kor'], s['eng'],
                                                                                              s['mat'], s['total'],
                                                                                              s['avg'], s['grade'],
                                                                                              s['rank']))
        elif no == 3:
            print(":::검색 기능:::")
            pass
        elif no == 4:
             print(":::수정 기능:::")
             pass
        elif no == 5:
             print(":::삭제 기능:::")
             pass
        elif no == 6:
             print(":::종료 기능:::")
             pass








if __name__ == '__main__' :
    process()