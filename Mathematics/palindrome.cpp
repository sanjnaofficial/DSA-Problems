#include <iostream>

using namespace std;

bool palindrome(int n){// time complexity theta(d); where d is no. of digits in a no.
    int x =n;
    int rev=0, rem;
    while(x!=0){
        rem= x%10;
        rev = rem +rev*10;
        x = x/10;

    }
    if(rev==n){
        return true;
    }
    return false;
}

int main(){
    int n;
    cin>>n;
    cout<<palindrome(n)<<endl;
}