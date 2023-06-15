def mKVerTicalTotal(*scoreList):
    totalList=[]
    for list in scoreList:
        for i, score in enumerate(list):
            try:
                totalList[i]+=score
            except:
                totalList.append(score)

    return totalList

totalList = mKVerTicalTotal([60,60,60],[90,90,90],[30,30,30,100])
print(totalList)