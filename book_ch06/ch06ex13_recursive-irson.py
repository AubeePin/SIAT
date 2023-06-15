total= 0


def recursive(i):
    global total
    if i <= 10:
        total += i
        # if문일때 이거고
        # if i <10:
        #     print(i,"+ ",end="")
        # else:
        #     print("=",total)

        #삼항연산자로 이용해보았다.
        print(i,"+ ", end="") if i<10 else print("=",total)


        recursive(i+1)

    else:
        return

recursive(1)