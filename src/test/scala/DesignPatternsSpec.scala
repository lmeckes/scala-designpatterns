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

}