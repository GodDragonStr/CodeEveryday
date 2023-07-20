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


