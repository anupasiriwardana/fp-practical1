object wholeSaleCost{
    def totalPrice(x:Int):Double = 24.95*x
    def discount(y:Double):Double = y*0.4
    
    def shippingCost(z:Int):Double = {
        if(z <= 50) 3.0*z else 50*3.0+(z-50)
    }

    def finalPrice(NoOfCopies:Int):Double = {
        return totalPrice(NoOfCopies)-discount(totalPrice(NoOfCopies))+shippingCost(NoOfCopies)
    }

    def main(args:Array[String]):Unit = {
        printf("Whole sale cost for 60 copies = %.2f",finalPrice(60))
    }
}