function prime(n)
{
    var num=0;
  for(var x=1;x<=n;x++)
  {
    if(n%x==0)
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
x=Number (prompt("Enter your number :"))
if(prime(x))
{
    alert("prime number")
}
else
{
    alert("not prime number")
}