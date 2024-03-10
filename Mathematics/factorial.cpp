#include <iostream>
using namespace std;

int fact(int n){// recursive solution   time complexity: theta(n)   auxillary space: theta(n)
    if(n==0){
        return 1;
    }
    return n*fact(n-1);
}

int iterfact(int n){//iterative solution    time complexity: theta(n)   auxillary space: theta(1)

    int fact = n;
    if(n==0){
        return 1;
    }
while(n>1){
    fact =  fact* (n-1);
    n--;
}
return fact;
}

int main(){
    int n;
    cin>>n;
    cout<<fact(n)<<endl;
    cout<<iterfact(n)<<endl;
}