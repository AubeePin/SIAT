from tkinter import Tk,Label,Button

win = Tk()
win.geometry("600x400+100+100")

top_lable=Label(win,text="top", background="Cyan")
top_lable.pack(side="top",fill="x")#fill 뜻은 채우다 임.. 색상을 다 채우려나봅니다 top 글자있는 부분의 전체

left_lable = Label(win, text="left")
left_lable.pack(side = "left")

right_lable = Label(win, text="right")
right_lable.pack(side = "right")

bottom_lable = Label(win, text="bottom")
bottom_lable.pack(side = "bottom")

btn = Button(win, text="btn")
btn.pack(side="bottom",anchor ="e")#anchor 눈 사용되지않는 공간에서 e는 우측중앙


if __name__ == '__main__':
    win.mainloop()