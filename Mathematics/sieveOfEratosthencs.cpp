// Sieve Of Eratosthencs: all the prime no.s less or equal to n
#include<iostream>
#include<vector>
#include <limits.h>
using namespace std;

bool isprime(int n){// theta(sqrt(n))
    if(n==2) return true;
    if(n==3) return true;
    if(n%2==0 || n%3==0) return false;

    for (int i = 5; i*i <= n; i= i+6)
    {
        if(n%i==0 || n%(i+2)==0){
            return false;
        }
    }
    return true;
    
}

//naive solution
void soe(int n){// TC: theta(n*sqrt(n))
for(int i=2;i<=n;i++){
    if(isprime(i)){
        cout<<i<<endl;
    }
}
}

//efficient solution
void soe1(int n){
if(n<=1){
    return;
}

bool prime[n+1];
/*The ‘fill’ function assigns the value ‘val’ to all the elements in the range [begin, end)
where ‘begin’ is the initial position and ‘end’ is the last position.
NOTE : Notice carefully that ‘begin’ is included in the range but ‘end’ is NOT included.*/

fill(prime, prime + n+1, true);// making all the elements of boolean array true

for(int i=2;i*i<=n;i++){
    if(prime[i]){
        for(int j=2*i;j<=n;j=j+i){
            prime[j]= false;
        }
    }
}

for(int i=2;i<=n;i++){
    if(prime[i])
    cout<<i<<" ";
}

}

int main(){
    int n;
    cin>>n;
    soe(n);
    soe1(n);
}