#리스트의선언
#lis = list() 변수이름을 리스트로 하면 식별자가 겹쳐지므로 뒷자리 하나뺌
lis = []

#리스트의 각 요소는 타입이 다를 수 있습니다.
lis.append("홍길동")
lis.append("김길동")
lis.append(100)
lis.append(200)
lis.append(3.14)
print(type(lis))
print(lis)
#리스트에 없는 요소를 index()함수로 검색하면 ValueError발생
#print(lis.index(1000))
#리스트의 범위를 넘은 첨자를 사용하면 IndexError발생
#print(lis[10])



