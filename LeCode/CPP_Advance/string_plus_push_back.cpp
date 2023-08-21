#include <iostream>
#include <ctime>
#include <string>
#include <vector>
using namespace std;

class Timer {
    public:
    Timer(const std::string &label)
        :label_(label)
    {
        begin_clock_ = clock();
        cout <<label<<"- Timer starts!"<<endl;
    }
    ~Timer() {
        clock_t clock_used = clock() - begin_clock_;
        cout<<label_<<"- Clock used:"<<clock_used
        <<" Time:"<<clock_used/CLOCKS_PER_SEC<<endl;
    }
    private:
    clock_t begin_clock_;
    string label_;
};

int str(int loop)
{
    Timer t("str");
    string s;
    for(int i=0;i<loop;++i)
        s+=(i%2);
    return s.length();
}
int vec(int loop)
{
    Timer t("vec");
    vector<bool> v;
    for(int i=0;i<loop;++i)
    v.push_back(i%2);
    return v.size();
}

int main()
{
    int loop = 1000000000;
    int s1=str(loop);
    int s2=vec(loop);
    cout <<"s1="<<s1<<endl;
    cout <<"s2="<<s2<<endl;
}