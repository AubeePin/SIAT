class People :
    name = None
    age = 0
# 이름과 나이
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def __str__(self):
        return f"name:{self.name}age:{self.age}"

class Score :
    kor = 0
    eng = 0
    mat = 0
    total = 0
#국어영어수학 합계
    def __init__(self,kor,eng,mat):
        self.kor=kor
        self.eng=eng
        self.mat=mat
        self.total = self.kor+self.eng+self.mat

    def __str__(self):
        return f"kor:{self.kor} eng:{self.eng} mat:{self.mat} total:{self.total}"

class Student :
    hak_no = 0
    person = None
    sung = None
#학번, 사람 ,
    def __init__(self,hak_no,person,sung):
        self.hak_no=hak_no
        self.person=person
        self.sung=sung

    def __str__(self):
        return f"학번:{self.hak_no}.|{self.person}|{self.sung}"

student01 = Student(1001,People("홍길동", 24),Score(95, 100, 100,))
print(student01)