import tkinter as tk
import tkinter.font as tkFont
from tkinter.ttk import *

class App:
    def __init__(self, root):
        #setting title
        root.title("고객관리시스템")
        #setting window size
        width=800
        height=451
        screenwidth = root.winfo_screenwidth()
        screenheight = root.winfo_screenheight()
        alignstr = '%dx%d+%d+%d' % (width, height, (screenwidth - width) / 2, (screenheight - height) / 2)
        root.geometry(alignstr)
        root.resizable(width=False, height=False)

        GLabel_88=tk.Label(root)
        ft = tkFont.Font(family='Times',size=30)
        GLabel_88["font"] = ft
        GLabel_88["fg"] = "#333333"
        GLabel_88["justify"] = "center"
        GLabel_88["text"] = "고객 관리 시스템"
        GLabel_88.place(x=30,y=30,width=395,height=58)

        GButton_343=tk.Button(root)
        GButton_343["bg"] = "#f0f0f0"
        ft = tkFont.Font(family='Times',size=10)
        GButton_343["font"] = ft
        GButton_343["fg"] = "#000000"
        GButton_343["justify"] = "center"
        GButton_343["text"] = "데이터 저장"
        GButton_343.place(x=50,y=310,width=235,height=30)
        GButton_343["command"] = self.GButton_343_command

        GLabel_943=tk.Label(root)
        ft = tkFont.Font(family='Times',size=16)
        GLabel_943["fg"] = "#333333"
        GLabel_943["justify"] = "left"
        GLabel_943["text"] = "결과: "
        GLabel_943.place(x=50,y=380,width=200,height=30)

        GLabel_341=tk.Label(root)
        ft = tkFont.Font(family='Times',size=10)
        GLabel_341["font"] = ft
        GLabel_341["fg"] = "#333333"
        GLabel_341["justify"] = "center"
        GLabel_341["text"] = "서       명"
        GLabel_341.place(x=20,y=140,width=70,height=25)

        GLabel_425=tk.Label(root)
        ft = tkFont.Font(family='Times',size=10)
        GLabel_425["font"] = ft
        GLabel_425["fg"] = "#333333"
        GLabel_425["justify"] = "center"
        GLabel_425["text"] = "전        화"
        GLabel_425.place(x=20,y=180,width=70,height=25)

        GLabel_131=tk.Label(root)
        ft = tkFont.Font(family='Times',size=10)
        GLabel_131["font"] = ft
        GLabel_131["fg"] = "#333333"
        GLabel_131["justify"] = "center"
        GLabel_131["text"] = "이미일"
        GLabel_131.place(x=20,y=230,width=70,height=25)

        self.txt01=tk.Entry(root)
        self.txt01.place(x=120,y=130,width=180,height=30)

        self.txt02=tk.Entry(root)
        self.txt02.place(x=120,y=180,width=180,height=30)

        self.txt03=tk.Entry(root)
        self.txt03.place(x=120,y=230,width=179,height=30)

        self.header_list = ['no', 'name', 'phone', 'email']

        self.tree = Treeview(root, columns=self.header_list, show="headings")
        self.tree.place(x=320,y=130,width=400,height=200)

    def GButton_343_command(self):
        print(self.txt01.get(), self.txt02.get(), self.txt03.get())




if __name__ == "__main__":
    root = tk.Tk()
    app = App(root)
    root.mainloop()