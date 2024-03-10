#include<iostream>
#include <algorithm>

using namespace std;
//naive solution
int gcd(int a,int b){// time complexity: bigO(min(a,b))
    int res= min(a,b);
    while(res>0){
        if(a%res==0 && b%res==0){
            break;
        }
        res--;
    }
    return res;
}

/*efficient solution using
Euclidean algorithm*/
int eud(int a, int b){
    while(a!=b){
        if(a>b){
            a= a-b;
        }
        else{
            b=b-a;
        }
    }
    return a;
}
//optimized version of eucledian algo
int opteud(int a,int b){
    if(b==0)
    return a;
    else
    return opteud(b,a%b);
}


int main(){
    int a,b;
    cin>>a>>b;
    cout<<gcd(a,b)<<endl;
    cout<< eud(a,b)<<endl;
    cout<< opteud(a,b)<<endl;

}