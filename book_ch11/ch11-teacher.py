from tkinter import Tk

win = Tk()

win.geometry("640x400+100+100")#창크기와(x) 좌표(+)
win.title("TkInter Window")#창 열면 그 제목나오게 하는. 타이틀명
win.resizable(False, False)#창크기를 변경 못하게 하는것.

if __name__ == '__main__':
    win.mainloop()