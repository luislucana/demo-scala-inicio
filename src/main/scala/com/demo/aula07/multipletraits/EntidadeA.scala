package com.demo.aula07.multipletraits

trait EntidadeA {
  def facaAlgo() : Unit = {
    println("Entidade A fazendo algo...")
  }

  def soma(a: Int, b: Int) : Int
}
