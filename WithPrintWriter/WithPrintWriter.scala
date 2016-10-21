import java.io._

object withPrintWriterMain{

    def withPrintWriter(file: File, op: PrintWriter => Unit) {
        val writer = new PrintWriter(file)
        try {
            op(writer)
        } finally {
            writer.close()
        }

    }

    def main(args: Array[String]) {

        withPrintWriter(
            new File("date.txt"),
            test => println(new java.util.Date)
        )

    }
}
