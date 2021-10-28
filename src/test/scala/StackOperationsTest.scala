import edu.knoldus.com.StackOperations
import org.scalatest.funsuite.AnyFunSuite

class StackOperationsTest extends AnyFunSuite{
  val value1:StackOperations = new StackOperations()

  test("Testing push operations"){
    value1.push(1)
    value1.push(2)
    value1.push(3)
    assert(value1.isEmpty()==false)
  }
  test("Testing pop operations"){
    value1.push(1)
    value1.push(2)
    value1.pop()
    assert(value1.isEmpty()==false)
    assert(value1.size()==1)
  }
  test("Testing top operations"){
    value1.push(1)
    assert(value1.top==1)
    value1.push(2)
    assert(value1.top==2)
    value1.push(3)
    assert(value1.top==3)
  }
  test("Testing isEmpty operations"){
    value1.push(1)
    assert(value1.isEmpty()==false)
    value1.push(2)
    assert(value1.isEmpty()==false)
    value1.push(3)
    assert(value1.size()==3)
  }
}
