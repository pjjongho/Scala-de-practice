object Oop {
  def main(args: Array[String]): Unit = {
    val sedan: Car = new Sedan()
    val suv : Car = new Suv()
    val bus : AbstractCar = new Bus()

    val cars = List(sedan, suv)
    cars.foreach(it => {
      it.engineStart()
      it.engineStop()
    })

    bus.engineStop()
    bus.accelerate()
    bus.asInstanceOf[PaymentModule].collectPayment(amount = 1600)
    bus.engineStop()
  }
}
