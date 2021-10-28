package edu.knoldus.com
import scala.sys.error

 class StackOperations extends Stack[Int] {
  override var list: List[Int] = List[Int]()
  override var topElement: Int = -1

  def push(element:Int)= {
    topElement=topElement+1
    list=element::list
    list
  }

  def pop(): Int={
    if(topElement<0) error("Stack Underflow")
    else{
      topElement=topElement-1
      val firstElement=list.head
      list=list.tail
      firstElement
    }
  }
  def top(): Int ={
    if (topElement<0) error("Stack is Empty")
    else{
      val frontElement=list.head
      frontElement
    }
  }

  def isEmpty(): Boolean ={
      if(topElement<0)  true
      else false
  }

   def size():Int={
     if(topElement<0) error("Stack is Underflow")
     else topElement+1
   }
}
