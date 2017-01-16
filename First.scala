object First
{
def main(args:Array[String])
{
val x=List(1,2,3)
val y=List(2,3,4)
var z=for{i<-0 to x.length-1
	t=x(i)+y(i)
} yield t // storing value of t in z which behave like list
println(z)
}
}
