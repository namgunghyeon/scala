import scala.io.Source



object containsOddMain{

    def containsOdd1(nums: List[Int]): Boolean = {
        var exists = false
        for (num <- nums)
            if (num % 2 == 1)
                exists = true
        exists
    }

    def containsOdd2(nums: List[Int]) = nums.exists(_ % 2 == 1)

    def main(args: Array[String]) {
        var nums = List(1,2)
        println("containsOdd1 List(1,2): ")
        println(containsOdd1(nums))

        nums = List(2)
        println("containsOdd1 List(2): ")
        println(containsOdd1(nums))

        nums = List(1,2)
        println("containsOdd2 List(1,2): ")
        println(containsOdd1(nums))

        nums = List(2)
        println("containsOdd2 List(2): ")
        println(containsOdd1(nums))
    }
}
