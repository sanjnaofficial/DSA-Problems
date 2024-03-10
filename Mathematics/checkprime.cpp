#include<iostream>
#include<math.h>
using namespace std;

//naive method
bool checkprime(int n){// TC: O(n)
    if(n==1) return false;

    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

//efficient soltution
bool checkprime1(int n){// TC: O(sqrt(n))
    if(n==1) return false;

    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
//optimized efficient solution
bool checkprime2(int n){// this solution is three times faster than efficient solution
    if(n==1) return false;
    if(n==2 || n==3) return true;
    if(n%2==0 || n%3==0) return false;
    for(int i=5; i*i<=n; i=i+6){
        if(n%i==0 || n%(i+2)==0){
            return false;
        }
    }
    return true;
}

int main(){
    int n;
    cin>>n;
    cout<<checkprime(n)<<endl;
    cout<<checkprime1(n)<<endl;
    cout<<checkprime2(n)<<endl;
}