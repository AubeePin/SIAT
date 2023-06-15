str1= input("문자열 입력>>")
inStr= input("찾을 단어>>")
newStr= input("교체할 단어>>")

print(f"{'결과':-^20}")
modify= str1.index(inStr)
print(f"{str1[:modify]}")#전체문자열에서 모디파이 입력한것 전까지
print(f"{newStr}")#바꿀단어도 출력
print(f"{str1[modify+len(inStr):]}")
print(f"{str1[:modify]}{newStr}{str1[modify+len(inStr):]}")