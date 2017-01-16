class Fab{
var a=0
var b=1
def cal(x:Int):Unit=  
{
var z=x
	if(z!=0)
	{	
		var c=a+b
		println(c)
		a=b
		b=c
		cal(z-1)  //Tail Recursion		
	}	
}
}
object Second{
def main(args:Array[String])
{
val n=5  //Input

if(n==1)
println(0)

else if(n==2)
{
println(0)
println(1)
}
else
{
println(0)
println(1)
val obj=new Fab
obj.cal(n-2) //Function call
}
}
}

