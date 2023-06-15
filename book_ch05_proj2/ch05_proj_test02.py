# 2~3교시
#선택정렬 연습
#선택정렬, 삽입정렬, 버블정렬
########################################################
# numList = [9,8,7,4,1,3,2,6,5]
# newList = [0,0,0,0,0,0,0,0,0]이건쌤이 한거.
#
# for i in range(0,len(numList)):
#     m = max(numList)
#     newList[i] = m
#     numList.remove(m)
#
# print(newList)
########################################################
#정렬 되도록 출력하라.
#for문을 이용해볼것



# for i in range(0,len(numList)):
#    for j in range(i+1, len(numList)):
#     if numList[i] < numList[j]:
#         for j in len(numList)  :
#
#         (numList[i],numList[j]) = (numList[j],numList[i])
#
#     for std in numList:
#         print(numList)

        # 내가한거 아직 모자르네 왜 이렇게 되는지 물어봐야겠다.

numList = [9,8,7,4,1,3,2,6,5]

for i in range(0, len(numList)):
    for j in range(i+1, len(numList)):
        if(numList[i]<numList[j]):
            (numList[i], numList[j]) = (numList[j], numList[i])

print(numList)

for i in range(0, len(numList)):
    for j in range(i + 1, len(numList)):
        if (numList[i] > numList[j]):
            (numList[i], numList[j]) = (numList[j], numList[i])

print(numList)

