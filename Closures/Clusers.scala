object Demo {
   def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(2) )
   }
   var factor = 3
   val multiplier = (i: Int) => i * factor

   //multiplier(1) value = 3
   //multiplier(2) value = 6
}

object Demo2 {
   def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1) )
      factor = 4
      println( "multiplier(2) value = " +  multiplier(2) )
   }
   var factor = 3
   val multiplier = (i: Int) => i * factor

   //multiplier(1) value = 3
   //multiplier(2) value = 8
}
