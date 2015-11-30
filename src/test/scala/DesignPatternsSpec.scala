

import org.scalatest.{Matchers, FlatSpec}
import singleton._
import abstractFactory._
import visitor.VisitorS._

class DesignPatternsSpec extends FlatSpec with Matchers {

  "SingletonJava" should "run" in {
    val x = SingletonJ.getInstance()
    val y = SingletonJ.getInstance()
    assert(x.equals(y))
  }

  "SingletonScala" should "run" in {
    val x = SingletonS
    val y = SingletonS
    assert(x.equals(y))
  }

  "AbstractFactoryScala" should "run" in {
    var x: AbstractFactoryS = null
    x = ConcreteFactory1S
    assert(x.createClazz.action == "Concrete Class 1")
    x = ConcreteFactory2S
    assert(x.createClazz.action == "Concrete Class 2")
  }

  "VisitorScala" should "run" in {
    val e1 = Sum(Sum(Num(1), Num(2)), Num(3))
    prettyPrint(e1)
    print("\n" + eval(e1))
  }

}