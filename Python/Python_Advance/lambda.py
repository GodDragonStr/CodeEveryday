import numpy

# import torch

def std_lambda():
    f = lambda x,y: x + y
    print(f(1, 2))


def sort_lambda():
    # <_io.TextIOWrapper name='./LeCode/Python_Advance/country.csv' mode='r' encoding='cp936'>
    f = open(file='./LeCode/Python_Advance/country.csv', mode="r")
    country_info = []
    for line in f:
        if country_info == []:
            country_info.append(line.strip().split(';')[1:])
            continue
        country_info.append(line.strip().split(';')[1:4]+[int(line.strip().split(';')[4])])
    
    # country_info.sort()
    # country_info.pop()
    country_info = country_info[1:]
    # sort by comparing the population of country
    country_info.sort(key=lambda info: info[3])

    
    
    with open('./LeCode/Python_Advance/country_pro.csv', mode='w+') as f:
        for _ in country_info:
            print(f"{_[0]} : \t {_[3]:,}")
            f.write(f"{_[0]},{_[3]:,}\n")


if __name__ == '__main__':
    # std_lambda()
    sort_lambda()
    