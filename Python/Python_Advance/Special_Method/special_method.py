
class A:

    def __new__(cls) -> None:
        print("__new__")

        # return super().__new__(cls)
    
    def __init__(self) -> None:
        print("__init__")


    def __del__(self) -> None:
        print("__del__")
    
    
a = A()
b = a

del a
