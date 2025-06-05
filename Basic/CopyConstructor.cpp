#include<iostream>
using namespace std;

class Demo
{
    public:
         int No1, No2;

      Demo()
      {
         cout<<"Inside default constructor\n";
         this->No1 = 0;
         this->No2 = 0;
      } 
      Demo(int A,int B)
      {
        cout<<"Inside parametrised constructor\n";
        this->No1 = A;
        this->No2 = B;
      } 
      Demo(Demo &ref)
      {
        cout<<"Inside Copy constructor\n";
        this->No1 = ref.No1;
        this->No2 = ref.No2;
      } 
      ~Demo()
      {
        cout<<"Inside Destructor\n";
      }


};
int main()
{
    Demo obj1;
    Demo obj2(11,21);
    Demo obj3(obj2);

    cout<<obj1.No1<<"\t"<<obj1.No2<<"\n";
    cout<<obj2.No1<<"\t"<<obj2.No2<<"\n";
    cout<<obj3.No1<<"\t"<<obj3.No2<<"\n";



    return 0;
}