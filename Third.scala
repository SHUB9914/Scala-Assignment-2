class Higher
{
def area(shap:String , a:Int,b:Int,f:(Int,Int)=>Int):Int=f(a,b)
}
object Third
{
def main(args:Array[String])
{
val obj=new Higher
println("enter your choice Parallelogram , Rectangle,Rhombus")

var str =readLine() //user input

var q=0
str match // Pattern Matching Concept
{
case "Parallelogram"=>(q=obj.area("Parallelogram",5,4,(x,y)=>(x*y)/2)) //Calling area

case "Rectangle"=>(q=obj.area("Rectangle",5,4,(x,y)=>x*y)) //Calling area

case "Rhombus"=>(q=obj.area("Rhombus",5,4,(x,y)=>x*y))  //Calling area

}
println(s"$str = $q") // Here final Result of area will print
}
}
