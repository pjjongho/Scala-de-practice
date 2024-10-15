class Suv extends Car{
  override def engineStart(): Unit = println("Engine Start in Suv")
  override def engineStop(): Unit = println("Engine Stop in Suv")

}
