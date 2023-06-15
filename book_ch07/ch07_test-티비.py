#클래스 만들기 연습

class TV:
    #생성자, 필드, 메소드를 구현 하시오.
    volume = 5

    def __init__(self,tv):
        self.tv=tv
        print(f"{self.tv} TV 생성")
    def powerOn(self):
        print(f"{self.tv} TV 켜기")

    def volumeUp(self):
        self.volume += 1
        print(f"{self.tv} TV 소리 키우기 volume :{self.volume}")

    def volumeDown(self):
        self.volume -= 1
        print(f"{self.tv} TV 소리 줄이기 volume :{self.volume}")

    def powerOff(self):
        print(f"{self.tv} TV 끄기.")


samsungTV = TV("삼성") #삼성 TV생성

samsungTV.powerOn()# 삼성 TV 켜기



samsungTV.volumeUp()# 삼성 TV 소리 키우기 volume : 6


samsungTV.volumeDown()# 삼성 TV 소리 줄이기 volume : 5


samsungTV.powerOff()# 삼성 TV 끄기

