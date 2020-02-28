package com.demo.aula05

object TesteParametersByName extends App {

  def time(): Long = {
    println("Entered time() ...")
    System.nanoTime
  }

  // 't' is now defined as a by-name parameter
  def exec(t: => Long): Long = {
    println("Entered exec, calling t ...")
    println("t = " + t)
    println("Calling t again ...")
    t
  }

  println(exec(time()))
}