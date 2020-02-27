package com.demo.aula04

object TesteParametersByValue extends App {

  def time(): Long = {
    println("In time()")
    System.nanoTime
  }

  def exec(t: Long): Long = {
    println("Entered exec, calling t ...")
    println("t = " + t)
    println("Calling t again ...")
    t
  }

  println(exec(time()))
}