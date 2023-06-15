def shwoDictArgs(**dictArgs):
    print(dictArgs.values())
    #결과값만
    keys = dictArgs.keys()
    for key in keys:
        print(key,":",dictArgs[key])
     #키를 나열
shwoDictArgs(name="HONG",age=25,address="Seoul Korea")