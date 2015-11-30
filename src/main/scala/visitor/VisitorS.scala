package visitor

object VisitorS {

  // sealed = may not be directly inherited, except in the same source file
  sealed abstract class Expr
  case class Num(n: Int) extends Expr
  case class Sum(l: Expr, r: Expr) extends Expr

  def prettyPrint(e: Expr): Unit = e match {
    case Num(n) => print(n)
    case Sum(l, r) => prettyPrint(l); print(" + "); prettyPrint(r)
  }

  def eval(e: Expr): Int = e match {
    case Num(n) => n
    case Sum(l, r) => eval(l) + eval(r)
  }

}