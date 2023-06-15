class Cook:
    def __init__(self,maker1,maker2):
        self.maker1=maker1
        self.maker2=maker2

    def cooking(self):
        ccc()
        print("{}이 {}을 부어넣는다".format(self.maker1,self.maker2))

def ccc():
    print("소금 ㄴㄴ 설탕")


maker=Cook("백종원","설탕")
maker.cooking()