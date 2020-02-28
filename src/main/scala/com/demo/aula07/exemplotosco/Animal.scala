package com.demo.aula07.exemplotosco

// (1) primary constructor
class Animal(var name: String, var age: Int) {

  // (2) auxiliary constructor
  def this (name: String) {
    this(name, 0)
  }

  override def toString = s"$name is $age years old"
}


