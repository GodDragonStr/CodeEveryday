import os 

libs = {"numpy", "matplotlib", "pandas", "docopt", "pygame"}


# 捕获异常判断
try:
    for lib in libs:
        os.system("pip install " + lib)
    print("Install Successfully")
except:
    print("Failed Somehow")


