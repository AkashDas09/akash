class airway
{
    bookticket(name,phone,desc)
    {
        this.name=name
        this.phone=phone
        this.desc=desc
    }
    display()
    {
        console.log("your name is :"+this.name);
        console.log("your phone number is :"+this.phone);
        console.log("your description is :"+this.desc);
        alert("ypur name is :"+this.name+"your number is:"+this.phone+"your descriptiion is :"+this.desc)
       
    }
    cancel()
    {
        console.log("your ticket is cancel :"+this.name)
    }
}
let b=new airway()
var n=prompt("Enter your name :")
var p=Number(prompt("Enter your phone :"))
var de=prompt("enter your description")
b.bookticket(n,p,de)
b.display()
b.cancel()