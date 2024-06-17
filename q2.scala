object tempInFah{
    def fahr(c:Double):Double = c*1.8+32

    def main(args:Array[String]):Unit = {
        print("35C in Fahrenheit is "+fahr(35))
    }
}