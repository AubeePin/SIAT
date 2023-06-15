total = 0

def num(i):
    global total

    if i <= 10 :
        total += i

        if i == 10:
            print(str(i)+"=",end="")
        else:
            print(str(i) + "+", end="")
        num(i + 1)
    else:
        return

num(1)
print(total)


