package com.demo.aula04

object IterandoComFor extends App {
  // In Java terms, Scala's Seq would be Java's List, and Scala's List would be Java's LinkedList.
  val nums = Seq(1,2,3)

  for (n <- nums) println(n)
}
