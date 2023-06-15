class Point:
    def __init__(self,x,y):
        self.x=x
        self.y=y

    def get_x(self):
        return self.x
    def get_y(self):
        return self.y

    def show_point(self):
        print('x=%d,y=%d'%(self.x,self.y))


    def set_point(self,x,y):
        self.x=x
        self.y=y


p1 = Point(10,20)
p1.show_point()

p1.set_point(100,200)
print(p1.get_x(),p1.get_y())

class Point3D(Point):

    def __init__(self,x,y,z):
        super().__init__(x,y)

        self.z = z

    def get_z(self):
        return self.z

    def show_point(self):
        print('x=%d,y=%d,z=%d'%(self.x,self.y,self.z))



    def set_point3D(self,x,y,z):
        super().set_point(x,y) # 부모가 가지고 있는부분

        self.z = z # 부모가 가지고 있지 않는 자식이 가지고 있는 부분

p3d = Point3D(10,20,30)
p3d.show_point()

p3d.set_point3D(100,200,300)
print(p3d.get_x(),p3d.get_y(),p3d.get_z())