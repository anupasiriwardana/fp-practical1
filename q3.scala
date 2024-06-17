object volume{
    def volOfSphere(r:Double):Double = {
        (4/3)*math.Pi*r*r*r
    }

    def main(args:Array[String]):Unit = {
        print("Volume of the sphere with radius 5 is "+volOfSphere(5))
    }
}