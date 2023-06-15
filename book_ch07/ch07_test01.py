

#객체를 생성하고 사용 하는 부분을 보면
#클래스를 유추 할 수 있다.
#아래 클래스 사용부분을 보고 클래스 구현 하시오.

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