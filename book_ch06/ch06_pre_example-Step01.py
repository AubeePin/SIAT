#Step
import random

def game():
    print('::::: 높다 낮다 게임 시작 :::::')
    min = 1
    max = 100
    count =5

    number = random.randint(min,max)
    print('컴퓨터가 %d부터 %d사이의 난수를 발생시켰습니다.(힌트:%d)'%(min,max,number))
    print()

    while count > 0 :
        print('정답은 %d~%d사이 입니다.'%(min,max))
        user_num = int(input('시스템이 발생 시킨 난수 값은 무엇일까? >> '))
        count -= 1

    if count == 0 :
        print('기회가 모두 소진되어 실격 되었습니다.')

    if __name__ == '__main__' :
        while True :
            game()
            isPlay = input('다시 시도 y 입력>>')
            if isPlay != 'y' :
                print('수고했습니다.')
                break