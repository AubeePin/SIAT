class Car:
    def __init__(self,name,year,bb):
        self.name=name
        self.year=year
        self.bb=bb
        self.speed = 50
    def run(self):

        print(f"{self.bb} {self.name}가 {self.year}년이고 {self.speed}킬로로 달린다.")

    def speed_up(self):
        self.speed +=10
    def speed_down(self):
        self.speed -=10
    def stop(self):
        self.speed =00

sonata = Car("SONATA",2019, "HYUNDAI")
sonata.run() #현대 소나타 2019년이 50킬로로 달린다.

sonata.speed_up()
sonata.run()# 현대 소나타가 2019년이 60킬로로 달린다

sonata.speed_up()
sonata.run()# 현대 소나타가 2019년이 70킬로로 달린다

sonata.speed_down()
sonata.speed_down()
sonata.run()#현대 소나타가 2019년이 50킬로로 달린다.

sonata.stop()#현대 소나타 정지