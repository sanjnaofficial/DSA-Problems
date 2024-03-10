#include<iostream>
using namespace std;
// naive solution
void div(int n){
    for(int i=1;i<=n;i++){// TC: theta(n)   Auxillary space: theta(n)
        if(n%i==0){
            cout<<i<<endl;
        }
    }

}

//efficient solution
// but not in sorted order
void div1(int n){
for(int i=1;i*i<=n;i++){// theta(sqrt(n))
    if(n%i==0){
        cout<<i<<endl;
        if(i!=(n/i))
        cout<<n/i<<endl;
    }
}
}

//efficient solution
// in sorted order
void div2(int n){// TC: theta(sqrt(n))
    int i;
    for(i=1;i*i<=n;i++){//theta(sqrt(n))
        if(n%i==0){
            cout<<i<<endl;
        }
    }
    for(;i>=1;i--){//theta(sqrt(n))
        if(n%i==0 && i!=(n/i)){
            cout<<(n/i)<<endl;
        }
    }
}

int main(){
    int n;
    cin>>n;
    div(n);
    div1(n);
    div2(n);
}