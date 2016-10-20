abstract class Element {
  def demo() {
    println("Element's implementation invoked")
  }
}

class ArrayElement extends Element {
  override def demo() {
    println("ArrayElement's implementation invoked")
  }
}

class LineElement extends ArrayElement {
  override def demo() {
    println("LineElement's implementation invoked")
  }
}

class UniformElement extends Element


object abstract2Main{
    def invokeDemo(e: Element) {
      e.demo()
    }
    def main(args: Array[String]) {
        invokeDemo(new ArrayElement)
        invokeDemo(new LineElement)
        invokeDemo(new UniformElement)
    }
}
