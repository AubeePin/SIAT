class People:
    name = None
    age = 0
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def __str__(self):
        return f"성함 : {self.name} \n나이 : {self.age}"

class score:
    kor=0
    eng=0
    mat=0
    total=0
    def __init__(self,kor,eng,mat):
        self.kor=kor





student1=People("서민경",31)
print(student1)