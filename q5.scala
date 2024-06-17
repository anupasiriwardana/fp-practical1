object runningTime{
    def easy(x:Int):Int = x*8
    def tempo(y:Int):Int = y*7
    
    def main(args:Array[String]):Unit = {
        printf("Total running time is %d mins",easy(2)+tempo(3)+easy(2))
    }
}