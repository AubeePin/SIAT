"""
{
    "o_seq": 1, # 주문 고유 번호
    "o_name" : "", # 주문 상품 명
    "o_option" : [], # 주문 옵션
    "ea_price": 0, # 개당 가격
    "cnt" : 0 # 수량
}
"""
order_list = []
o_sequence = 1

product_list = [{
        "seq":1,
        "name":"아메리카노",
        "price":2000,
        "option":[
            {
                "step":1, "menu":[
                    {"item":"HOT", "opt_price":0},
                    {"item":"ICE", "opt_price":500}
                ]
            },{
                "step":2, "menu":[
                    {"item":"텀블러 할인", "opt_price": -300},
                    {"item":"할인 없슴", "opt_price": 0}
                ]
            },{
                "step":3, "menu":[
                    {"item":"샷 추가", "opt_price": 500},
                    {"item":"추가 없슴", "opt_price": 0}
                ]
            }
        ]
    },{
        "seq":2,
        "name":"에스프레소",
        "price":2000,
        "option":[
            {
                "step":1, "menu":[
                    {"item":"HOT", "opt_price":0},
                    {"item":"ICE", "opt_price":500}
                ]
            }
        ]
    },{
        "seq":3,
        "name":"과일음료",
        "price":4000,
        "option": []
    },{
        "seq":4,
        "name":"까페라떼",
        "price":3000,
        "option": [
            {
                "step":1, "menu":[
                    {"item":"HOT", "opt_price":0},
                    {"item":"ICE", "opt_price":500}
                ]
            }
        ]
    }
]

sequence = 5


def menu() :
    print("{:-^40}".format(" MENU "))
    for i, product in enumerate(product_list) :
        print(f"{i+1}. {product['name']} ({product['price']}원)")
    no = int(input("선택: "))
    while not(no>0 and no <= len(product_list) ) :
        print(f"1 ~ {len(product_list)}사이의 번호를 선택하세요.")
        no = int(input("다시 선택: "))
    return no


def main() :
    global o_sequence
    print("::::::::: 메머드 커피 주문 :::::::::")
    no = menu()
    idx = no -1

    order_list.append({
        "o_seq": o_sequence,  # 주문 고유 번호
        "o_name": product_list[idx]['name'],  # 주문 상품명
        "o_option" : [],
        "ea_price": product_list[idx]['price'],  # 개당 가격
        "cnt": 1  # 수량
    })
    o_sequence += 1

    print(order_list)



if __name__ == '__main__' :
    main()