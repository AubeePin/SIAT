#Step 02

class Super:
    def __init__(self,name):
        self.name = name

    def show(self):
        print("이름은 %s입니다."% self.name)

# person = Super('홍길동')
# person.show()

class Sub(Super):
    def __init__(self,name,jop):
        super().__init__(name)
        self.job = jop

    # Override
    def show(self):
        super().show()
        print("직업은 %s입니다." %self.job)
        print(f"{self.name}님의 직업은 {self.job}입니다.")

person2 = Sub("홍길동", "도둑")#불러줘야 객체가 생성 된다.
person2.show()