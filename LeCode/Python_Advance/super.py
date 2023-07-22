# from objprint import op

class Person:
    def __init__(self, name):
        self.name = name

class Male(Person):
    def __init(self, age, name):
        super().__init__(name)
        super(Person, self).__init__(name)
        Person.__init__(self, name)
        self.gender = "male"

class A:
    def say(self):
        print("A")

class B(A):
    def say(self):
        super().say()

class D(A):
    def say(self):
        print("D")

class C(B):
    def say(self):
        super().say()

class M(B, D):
    def say(self):
        # super().say()
        B.say(self)

my_object = M()
my_object.say()

