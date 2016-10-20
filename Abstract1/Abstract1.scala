import java.io._

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(x123: Array[String]) extends Element {
  val contents: Array[String] = x123
}

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
}

class UniformElement(
  ch: Char,
  override val width: Int,
  override val height: Int
) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}

object abstractMain{
    def main(args: Array[String]) {
        val e1: Element = new ArrayElement(Array("hello", "world"))
        println("e1", e1)
        val ae: ArrayElement = new LineElement("hello")
        println("ae", ae)
        val e2: Element = ae
        println("e2", e2)
        val e3: Element = new UniformElement('x', 2, 3)
        println("e3", e3)
    }
}
