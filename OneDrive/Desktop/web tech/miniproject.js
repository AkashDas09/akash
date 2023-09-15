class Bank
{
       xyz()
       {
        console.log("parent class properties")
       }
}
class Bank1 extends Bank
{
    abc()
    {
        console.log("chilld class properties")
    }
}
let b=new Bank1()
b.xyz()
b.abc()