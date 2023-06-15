#파이썬 함수 선언 부분.
#새미콜론(;)은 꼭 사용 하지 않아도 된다.
def main():
    print("Hello Python world")
    #탭을 사용하면 함수 블럭 내부
    if True :
        print("이것은 if 문 내부에서 출력 한 것")




#탭이 없다면 함수 외부이다.
print(__name__)


if __name__=='__main__' :
   # 함수는 호출 해야 실행 한다.
    main()