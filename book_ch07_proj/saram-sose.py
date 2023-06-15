class Saram:
    def __init__(self, seq, name, phone):
        self.seq = seq
        self.name = name
        self.phone = phone

    def __str__(self):
        print("자동 호출...")
        return f"{self.seq}, {self.name}, {self.phone}"


class PhoneBook:
    saram_list = [
        Saram(101, "일지매", "010-1010-1010"),
        Saram(102, "홍길동", "010-1010-2222"),
        Saram(103, "이순신", "010-1010-3333")
    ]

    def __init__(self):
        print("PhoneBook 객체 생성")
        no = self.menu()
        if no == 1:
            self.drow_list()
        elif no == 2:
            pass
        else:
            pass

    def menu(self):
        print("::::: MENU :::::")

    def drow_list(self):
        print("::::: 사용자 목록 :::::")
        for s in self.saram_list:
            print(s)


if __name__ == '__main__':
    PhoneBook()