#include <iostream>
#include "Sales_item.h"

Sales_item sales_item_sum () {
    Sales_item sum_item;
    if (std::cin >> sum_item) {
        sum_item += sales_item_sum();
        return sum_item;
    }
    return sum_item;
}

int main () {

    std::cout << sales_item_sum() << std::endl;
    
    return (0);
}