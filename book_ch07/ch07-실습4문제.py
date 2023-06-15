class Music:

    def __init__(self,track,title,singer):
        self.track=track
        self.title=title
        self.singer=singer

    def play(self):
        print(f"{self.track}번 트랙 {self.singer}의 {self.title} 실행 중 입니다.")

    def insert(self,sing,name):
        print('곡목입력  >> ', self.sing)
        print('가수 입력 >> ', self.name)
        self.sing=sing
        self.name =name



class MusicPlayer:
    list=[]
    seq=1

    def __init__(self):
        pass

    def insert(self, m):
        list.append(m)

    def menu(self):
        print("::::메뉴::::")
        print("1.추가 2.제거 3.전곡 실행 4.종료")
        print(int(input("선택: ")))



musicplay-


