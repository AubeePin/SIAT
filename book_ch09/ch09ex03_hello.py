#파일에서 사용 할 함수 즉시 import
from ch09ex01_hello import say_hello


if __name__ == '__main__':
    # 함수를 import해서 바로 사용
    say_hello("park")