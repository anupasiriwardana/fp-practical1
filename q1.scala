object diskArea{
    def area(r:Double):Double = math.Pi*r*r

    def main(args:Array[String]):Unit = {
        print("The area of the disk with radius 5 is "+ area(5))
    }
}