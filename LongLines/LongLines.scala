import scala.io.Source
object LongLines1 {
    def processFile(filename: String, width: Int) {
      val source = Source.fromFile(filename)
      for (line <- source.getLines())
        processLine(filename, width, line)
    }
    private def processLine(filename: String, width: Int, line: String) {
      if (line.length > width)
        println(filename +": "+ line.trim)
    }
}

object LongLines2 {
    def processFile(filename: String, width: Int) {
        def processLine(filename: String, width: Int, line: String) {
          if (line.length > width)
            println(filename +": "+ line)
        }
        val source = Source.fromFile(filename)
        for (line <- source.getLines()) {
          processLine(filename, width, line)
        }
    }
}

object LongLinesMain {
    def main(args: Array[String]) {
      val width = args(0).toInt
      for (arg <- args.drop(1)) {
          println("LongLines1")
          LongLines1.processFile(arg, width)
          println("LongLines2")
          LongLines2.processFile(arg, width)
      }
    }
}
