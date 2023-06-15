#피클 모듈을 불러옵니다.
import pickle

from pprint import pprint
#딕셔너리 객체 데이터
person1 = {
    'name':'홍길순',
    'height':170,
    'weight':60
}
person2 = {
    'name':'홍길동',
    'height':200,
    'weight':80
}

#딕셔너리 객체 데이터를 리스트로 만듭니다.
people = [person1,person2]

#데이터를 저장합니다.
#피클은 바이너리로 저장되므로 'wb'모드로 파일을 엽니다.
with open('people.plckle','wb') as f:
    pickle.dump(people,f)

#저장된 데이터를 읽습니다.
with open('people.plckle','rb') as f:
    loaded_people = pickle.load(f)

pprint(loaded_people)