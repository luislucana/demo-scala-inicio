package com.demo.aula07

class Calculadora(marca: String) {

  /**
    * A constructor.
    */
  val cor: String = {
    if (marca == "Casio") {
      "azul"
    } else if (marca == "HP") {
      "preta"
    } else {
      "branca"
    }
  }

  def soma(a: Int, b: Int): Int = a + b

  def subtracao(a: Int, b: Int): Int = a - b

  def multiplicacao(a: Int, b: Int): Int = a * b

  def divisao(a: Int, b: Int): Int = a / b
}