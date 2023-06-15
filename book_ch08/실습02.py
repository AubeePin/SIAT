fish_list =['오징어','꼴뚜기','대구','명태','거북이']
print("생선을 주문하세요!")
for i, fish in enumerate(fish_list):
    print("(%d)%s"%(i+1,fish),end="")

while True:
    try:
        choice = int(input(">>"))
        print("-"*55)
        if choice <= 0:
            raise("이상하네요?.")
        print(fish_list[choice - 1],end = "")
        break
    except IndexError as e :
        print("IndexError가 발생 했습니다.")
        print("다시 선택", end="")
    except ValueError as e:
        print("ValueError가 발생 했습니다.")
        print("다시 선택", end="")
    except Exception as e:
        print("알 수 없는 예외가 발생 했습니다.")
        print("다시 선택", end="")
        continue


print(" 주문완료")
