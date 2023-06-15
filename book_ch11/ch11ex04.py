from tkinter import Tk
from tkinter.ttk import Label,Entry,Button

win = Tk()

win.geometry("250x180+100+100")
win.title("고객입력창")
win.resizable(False,False)


lbl_name=Label(win,text="성명")
lbl_phone=Label(win,text="폰번호")
lbl_email=Label(win,text="e-mail")

entry_name=Entry(win)
entry_phone=Entry(win)
entry_email=Entry(win)

btn_ok=Button(win,text="확인")
btn_cancel=Button(win,text="취소")

lbl_name.pack()
entry_name.pack()
lbl_phone.pack()
entry_phone.pack()
lbl_email.pack()
entry_email.pack()
btn_cancel.pack(side="bottom")#먼저 밑으로 쓰면 가장밑으로 위치됨.
btn_ok.pack(side="bottom")


if __name__ == '__main__':
    win.mainloop()