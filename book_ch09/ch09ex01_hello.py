def say_hello(name):
    print("Hello",name)


def say_hello2(name):
    print("good morning",name)


# main 블럭에서 사용하지 않으면 import 순간 바로 실행 됨.


if __name__ == '__main__':
    say_hello("홍길동")
    say_hello2("김길동")