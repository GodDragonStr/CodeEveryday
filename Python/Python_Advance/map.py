"""map函数能够队课迭代对象快速实现某种操作
"""
my_str = "lower"
print(my_str.upper())
my_str = my_str.upper()
print(my_str.isupper())

directions = ["north", "east", "south", "west"]
directions_upper = []

# 使用循环写转换大写
for direction in directions:
    directions_upper.append(direction.upper())

print(directions_upper)

# 定义函数通过map实现大写转换
def return_upper(input: str):
    return input.upper()

print(list(map(return_upper, directions)))

# 进一步通过lambda简化函数定义
print(list(map(lambda input: input.upper(), directions)))

# 通过map迭代多个对象
a = [1, 2, 3]
b = [4, 5, 6]

print(list(map(lambda x, y: x * y, a , b)))