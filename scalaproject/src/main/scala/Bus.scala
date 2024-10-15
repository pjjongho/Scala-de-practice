class Bus extends AbstractCar(name = "Bus") with PaymentModule {

  override def engineStart(): Unit = println("Engine Start Bus")
  override def engineStop(): Unit = println("Engine Stop Bus")

  override def collectPayment(amount: Int): Boolean = {
    println(s"paid $amount won")
    true
  }

  override def accelerate(): Unit = println("Bus in accelerating")
}
