import abstractFactory.{ConcreteFactory2S, ConcreteFactory1S, AbstractFactoryS}
import org.scalatest.{Matchers, FlatSpec}
import singleton.SingletonJ
import singleton.SingletonS

class DesignPatternsSpec extends FlatSpec with Matchers {

  "SingletonJ" should "run" in {
    val x = SingletonJ.getInstance()
    val y = SingletonJ.getInstance()
    assert(x.equals(y))
  }

  "SingletonS" should "run" in {
    val x = SingletonS
    val y = SingletonS
    assert(x.equals(y))
  }

  "AbstractFactoryS" should "run" in {
    var x: AbstractFactoryS = null
    x = ConcreteFactory1S
    assert(x.createClazz.action == "Concrete Class 1")
    x = ConcreteFactory2S
    assert(x.createClazz.action == "Concrete Class 2")
  }

}