# 객체를 생성하고 사용 하는 부분을 보면
# 클래스를 유추 할 수 있다.
# 아래 클래스 사용부분을 보고 클래스 구현 하시오.

class Car :
    # 필드
    #name = None
    #year = 0
    #company = "";
    speed = 0

    def __init__(self, name, year, company):
        self.name = name
        self.year = year
        self.company = company


    def run(self):
        if self.speed == 0 :
            self.speed = 30

        print(f"{self.company} {self.name}가 {self.year}년이 {self.speed}킬로로 달린다.")


    def stop(self):
        if self.speed != 0 :
            self.speed = 0

        print(f"{self.company} {self.name}가 정지.")


    def speed_up(self):
        self.speed += 10


    def speed_down(self):
        self.speed -= 10


# 클래스 밖


sonata = Car("SONATA", 2019, "HYUNDAI")
sonata.run() # 현대 소나타가 2019년이 50킬로로 달린다.

sonata.speed_up()
sonata.run() # 현대 소나타가 2019년이 60킬로로 달린다.

sonata.speed_up()
sonata.run() # 현대 소나타가 2019년이 70킬로로 달린다.

sonata.speed_donw()
sonata.speed_donw()
sonata.run() # 현대 소나타가 2019년이 50킬로로 달린다.

sonata.stop() # 현대 소나타 정지!


# 클래스 외부