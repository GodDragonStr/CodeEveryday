import time
def get_multiple_func(n):

    def multiple(x):
        return x * n
    
    return multiple

double = get_multiple_func(2)
triple = get_multiple_func(3)

print(double(3))
print(triple(3))

def dec(f):
    pass

@dec
def double(x):
    return x * 2

# 等价于下面这种写法
double = dec(double)


# def time_count(f):

#     def count_function(x):
#         start = time.time()
#         ret = f(x)
#         print(format((time.time() - start), '.9f'))
#         return ret

#     return count_function

def time_count(f):
    def count_function(*args, **kwargs):
        start = time.time()
        ret = f(*args, **kwargs)
        print(time.time() - start)

        return ret
    
    return count_function


@time_count
def my_double(x):
    return x ** 2

@time_count
def my_power(a, b):
    return a ** b

print(my_double(20000000000000000000000))
print(my_power(2, 3))



def time_inter(interation):
    # 从这里开始是一个普通的装饰器，inner的输入是一个函数，输出也是一个函数
    def inner(f):
        # 装饰后的操作接口
        def iner_time_count(*args, **kwargs):
            start = time.time()
            for _ in range(interation):
                f(*args, **kwargs)

            return (time.time() - start)
        
        return iner_time_count

    return inner


@time_inter(10000000)
def my_iter_double(x):
    return 2 * x

print(my_iter_double(10))

# 等价于：
# inner = time_inter(interation)
# my_iter_double = inner(my_iter_double)