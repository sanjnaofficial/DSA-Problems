#include<iostream>
#include<algorithm>
using namespace std;
//naive solution
int lcm(int a, int b){// time complexity: O(a*b - max(a,b))
int res= max(a,b);
while(res%a!=0 || res%b!=0){
    res++;
}
return res;
}

int gcd(int a, int b){
    if(b==0)
    return a;
    return gcd(b,a%b);
}
//efficient solution
int eff_lcm(int a, int b){// TC: log(min(a,b))
    return (a*b)/gcd(a,b);
}
int main(){
    int a,b;
    cin>>a>>b;
    cout<<lcm(a,b)<<endl;
    cout<<eff_lcm(a,b)<<endl;
}