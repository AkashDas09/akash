function palindrom(n)
{
   
    var rem=0
    var re=0 
    for(var x=1;x<=n;x++)
    {
        rem=n%10
        re=rem*10+re
        n=n/10
    }
    if(n==re)
    {
         return true
    }
    else{
        return false
    }
}
x=Number (prompt("Enter your number :"))
if(palindrom(x))
{
    alert("palindrom")
}
else{
    alert("not palindrom number")
}