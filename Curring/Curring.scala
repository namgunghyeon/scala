import scala.io.Source

object curriedSumMain{

    def curriedSum(x: Int)(y: Int) = x + y

    def main(args: Array[String]) {
        println("curriedSum(1)(2):")
        println(curriedSum(1)(2))

        val onePlus = curriedSum(1)_
        println("onePlus(2):")
        println(onePlus(2))

    }
}
