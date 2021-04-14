package com.test

import org.scalactic.Every
import org.scalatest._
import Matchers._

class Apple

class Orange

class ExampleSpec extends FunSpec {

  val apples: Array[Apple] = Array.empty[Apple]
  def f(apple: Apple): Long = 1L

  describe("test scope") {
    it ("should test") {
      apples.map(f).toList should === (apples.toList.map(f))
      Every(1) should === (Every(1))
    }
    /*it ("should test 2") {
      val a = new Apple
      val b = new Orange
      a should equal (b)
    }*/
  }

}
