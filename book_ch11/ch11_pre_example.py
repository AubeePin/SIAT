import turtle
import tkinter as tk

class App:
    def __init__(self,win):
        self.win = win
        self.win.title("Raw Turtle")
        self.canvas = tk.Canvas(win)
        self.canvas.config(width= 600, height= 200)
        self.canvas.pack(side=tk.LEFT)
        self.scr = turtle.TurtleScreen(self.canvas)
        self.button = tk.Button(self.win, text="pressme",command=self.press)
        self.button.pack()
        self.t = turtle.RawTurtle