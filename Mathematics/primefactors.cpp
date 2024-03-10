#include<iostream>
using namespace std;

bool isprime(int n){
if(n==1) return false;
if(n==2 || n==3) return true;
if(n%2==0 || n%3==0) return false;
for(int i=5;i*i<=n; i=i+6){
if(n%i==0 || n%(i+2)==0)
return false;
}
return true;
}
// naive solution
void pf(int n){// TC: O(n^2*log(n))
for(int i=2;i<=n;i++){// Theta(n)
    if(isprime(i)){// the function will take O(n)
        int x=i;
        while(n%x==0){// O(log(n))
            cout<<i<<endl;
            x=x*i;
        }
    }
}
}

//efficient solution
void pf2(int n){
    if(n<=1) return;
    for(int i=2;i*i<=n;i++){
        while (n%i==0)
        {
            cout<<i<<endl;
            n=n/i;
        }
        
    }
    if(n>1){
        cout<< n<<endl;
    }
}

// further optimization of efficient solution
void pf3(int n){
    if(n<=1) return;
    while(n%2==0){
        cout<<2<<endl;
        n=n/2;
    }
    while(n%3==0){
        cout<<3<<endl;
        n=n/3;
    }
    for(int i=5;i*i<=n;i=i+6){// theta(sqrt(n))
        while(n%i==0){
            cout<<i<<endl;
            n=n/i;
        }
        while(n%(i+2)==0){
            cout<<(i+2)<<endl;
            n=n/(i+2);
        }
    }
    if(n>3) cout<<n;
}

int main(){
    int n;
    cin>>n;
    pf(n);
    pf2(n);
    pf3(n);
}