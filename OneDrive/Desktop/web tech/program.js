var books=[]
var x=prompt("Enter your library by open and exit it by exit")
while(x!="exit")
{
    var p=prompt("Enter your choice 1.add 2.del 3.show")
    if(p=="add")
    {
        var a=prompt("Enetr book name")
        books.push(a)
    }
    else if(p=="del")
    {
        books.pop()
    }
    else if(p=="show")
    {
        console.log(books)
    }
    else{
        console.log("invalid input")
    }
}