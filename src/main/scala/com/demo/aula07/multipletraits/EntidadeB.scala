package com.demo.aula07.multipletraits

trait EntidadeB {
  def facaAlgo() : Unit = {
    println("Entidade B fazendo algo...")
  }

  def repita(texto: String, n: Int): String
}
