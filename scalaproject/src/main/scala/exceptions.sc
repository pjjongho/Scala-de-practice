try{
  1/1
} catch {
  case e: ArithmeticException => "Are you idiot?"
  case _: Throwable => println("Unknown Exception")
} finally {
  println("print anyway")
}

def upperString(value: String): Option[String] = {
  if (value.isEmpty) None
  else Some(value.toUpperCase)
}

val result1 = upperString(value = "lowercase")
val result2 = upperString(value = "")

if (result1.isDefined){
  println(result1.get)
}

if (result2.isEmpty){
  println("Empty")
}
)