package com.demo.aula06

class CalculadoraCientifica(marca: String) extends Calculadora(marca) {

  def potencia(x: Int, y: Int): Int = {

    var result = x

    var i = 1
    while (i < y) {
      result = result * x
      i += 1
      i - 1
    }

    result
  }

  def logaritmo(m: Double, base: Double) = math.log(m) / math.log(base)

  def fatorial(a : Int) : Int = {
    var result = 1
    var i = 1

    do {
      result *= i
      i = i + 1
    } while (i <= a)

    result
  }
}
