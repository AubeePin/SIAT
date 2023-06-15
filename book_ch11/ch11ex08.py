from tkinter import Tk,PanedWindow,Menu,LabelFrame
from tkinter.ttk import Label,Button,Entry

win = Tk()

menu_area = Menu(win)
win.configure(menu=menu_area)

menu1 = Menu(menu_area)
menu1.add_command(label="New...")
menu_area.add_cascade(label="File", menu=menu1)





if __name__ == '__main__':
    win.mainloop()