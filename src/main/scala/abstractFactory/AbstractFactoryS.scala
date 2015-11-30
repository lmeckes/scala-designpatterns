package abstractFactory


trait AbstractFactoryS {
  type AClazz <: Clazz // Constrained Type (ACalzz must be instanceof Clazz)

  def createClazz : Clazz

  abstract class Clazz {
    def action: String
  }

}

object ConcreteFactory1S extends AbstractFactoryS {
  override type AClazz = aConcreteClazz1

  override def createClazz() = new aConcreteClazz1

  protected class aConcreteClazz1 extends Clazz {
    override def action = "Concrete Class 1"
  }

}

object ConcreteFactory2S extends AbstractFactoryS {
  override type AClazz = aConcreteClazz2

  override def createClazz() = new aConcreteClazz2

  protected class aConcreteClazz2 extends Clazz {
    override def action = "Concrete Class 2"
  }

}