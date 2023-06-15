from tkinter import Tk
from tkinter.ttk import Label, Button#lable(라벨은 글자띄우기)

win = Tk()#변수명 = Tk() 이거 사용한다는듯.

lbl=Label(win,text="결과 : 아래 버튼을 누르세요")#브라우저창에 이걸 집어넣는다. win에 넣는다는
but1=Button(win, text="확인")
but2=Button(win, text="취소")


lbl.pack()
but1.pack()
but2.pack()




if __name__ == '__main__':
    win.mainloop()