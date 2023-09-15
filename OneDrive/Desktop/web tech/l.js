// function show(name1="xyz")
// {
//     alert("welcome"+name1+"to my web page")
//     console.log("welcome"+name1+"to my web page")
// }
// function xyz(a,b){
//     return a*b
// }
function prime(n){
    var num=0
    for(var p=1;p<=n;p++)
    {
        if(n%p==0)
        {
            num++
        }
    }
    if(num==2)
    {
        return true
    }
    else
    {
        return false
    }
}
x=Number(prompt("Enter your  number :"))
// y=Number(prompt("Enter your second  number"))
// c=xyz(x,y)
// alert(c)
// for(var x=1;x<=5;x++)
// {
//     p=prompt("Enter your name :")
//     show(p)
// }
if(prime(x))
{
    alert("prime number")
}
else
{
    alert("not prime number")
}