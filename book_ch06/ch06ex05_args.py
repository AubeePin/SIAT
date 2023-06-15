def findMax(*args):
    print("args의 타입은:",type(args))

    max = 0
    for num in args:
        if num > max :
            max = num

    return max

maxinum = findMax(10)
print("가장 큰 수는 :", maxinum)

maxinum = findMax(2,5,10,30,100,40,7,9)
print("가장 큰 수는 :", maxinum)