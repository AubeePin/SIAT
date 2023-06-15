class Washer:
    def __init__(self,size,maker):
        self.size = size
        self.maker = maker

    def washing(self):
        detergent()
        print("{}세탁기가 {}킬로의 빨래를 한다~".format(self.maker,self.size))

def detergent():
    print("설탕투입하고싶다.")


washer=Washer(10,"삼성")
washer.washing()

washer=Washer(20,"현대")
washer.washing()