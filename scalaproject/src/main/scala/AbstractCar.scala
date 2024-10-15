abstract class AbstractCar(name: String) {
  def engineStart(): Unit = println(s"Engine Start in $name")
  def engineStop(): Unit = println(s"Engine Stop in $name")
  def accelerate(): Unit
  def break(): Unit = println(s"$name breaking")
}
