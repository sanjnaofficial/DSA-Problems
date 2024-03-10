//#include <bits/stdc++.h>
#include <iostream>
#include <cmath>
using namespace std;
// time
int digits(int n){ //complexity theta(d); where d is no. of digits in a no.
    int count=0;
    while(n!=0){
        n=n/10;
        count++;
    }
    return count;
}

int recdigits(int n){
 if(n==0){
    return 0;
 }
 return recdigits(n/10)+1;
}

int logdigits(int n){
 return log10(n)+1;
}

int main(){
    int n;
    cin>>n;
    cout<<digits(n)<<endl;
    cout<<recdigits(n)<<endl;
    cout<<logdigits(n)<<endl;
}
