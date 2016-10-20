import java.io._

object assertionsEnabledMain{

    var assertionsEnabled = true

    def myAssert1(predicate: () => Boolean) =
        if (assertionsEnabled && !predicate())
            throw new AssertionError


    def myAssert2(predicate: => Boolean) =
        if (assertionsEnabled && !predicate)
            throw new AssertionError

    def main(args: Array[String]) {
        try {
            println("myAssert1 () => 5 > 3")
            println(myAssert1(() => 5 > 3))

            println("myAssert1 () => 5 < 3")
            println(myAssert1(() => 5 < 3))
        } catch {
            case e: AssertionError => e.printStackTrace

        }

        try {
            println("myAssert2 5 > 3")
            println(myAssert2(5 > 3))

            println("myAssert2 5 < 3")
            println(myAssert2(5 < 3))
        } catch {
            case e: AssertionError => e.printStackTrace

        }
    }
}
