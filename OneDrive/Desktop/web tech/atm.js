class Bank
{
    constructor(name,phone,adhar,bal,pin,acno,branch)
    {
        this.name=name
        this.phone=phone
        this.adhar=adhar
        this.bal=bal
        this.pin=pin
        this.acno=acno
        this.branch=branch
    }
    display()
    {
        var p=Number(prompt("Enter your pin :"))
        if(this.pin==p)
        {
            alert("your name is :"+this.name+"your bal is :"+this.bal)
        }
        else{
            alert("incorect pin")
        }
    }
    deposite()
    {
        var p=Number(prompt("Enter your pin :"))
        if(this.pin==p)
        {
            var a=Number(prompt("Enter your amount :"))
            alert("your previous amount is :"+this.bal)
            this.bal=this.bal+a
            alert("your current bal is :"+this.bal)

        }
        else{
            alert("incorect pin")
        }
    }
    withdraw()
    {
        var p=Number(prompt("Enter your pin :"))
        if(this.pin==p)
        {
            var a=Number(prompt("Enter your amount :"))
            if(a<=this.bal)
            {
                alert("your previous bal is :"+this.bal)
                this.bal=this.bal-a
                alert("your current balance is :"+this.bal)
            }
            else{
                alert("insufficient balance")
            }
        }
            else{
                alert("incorrect pin")
            }
        }
        details()
        {
            var p=Number(prompt("Enter your pin :"))
            if(this.pin==p)
            {
               alert("your name is"+this.name+"your phone number is :"+this.phone+"your addhar is :"+this.adhar+"your bal is :"+this.bal+"your pin is :"+this.pin+"your account number is :"+this.acno+"your branch is :"+this.branch) 
            }
        }
    }


alert("welcome to bank")
var na=prompt("Enter your name :")
var ph=Number(prompt("Enter your number"))
var a=Number(prompt("Enter your adhar :"))
var b=Number(prompt("Enter your balance :"))
var p=Number(prompt("Enter your pin :"))
var ac=Number(prompt("Enter your account number:"))
var br=prompt("enter your branch :")
let obj=new Bank(na,ph,a,b,p,ac,br)
var k=Number(prompt("Enter your choose 1 for display 2 for deposite 3 for withdraw 4 for account details"))
if(k==1)
{
    obj.display()
}
else if(k==2){
     obj.deposite()
}
else if(k==3)
{
          obj.withdraw()
}
else if(k==4){
    obj.details()
}
else{
    alert("invalid input")
}


