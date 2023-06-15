class Washer:
    def __init__(self,size,maker):
        self.size=size
        self.maker=maker

    def washing(self):
        print("{}세탁기가 {}킬로의 빨래를 한다. " .format(self.maker,self.size))


    def __str__(self):
        return "size:{} , maker:{}".format(self.size,self.maker)


washer=Washer("삼성", 10)
washer.washing()