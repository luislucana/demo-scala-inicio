package com.demo.aula07

object TesteHeranca extends App {

  val minhaCalculadora = new CalculadoraCientifica("HP")

  println("soma = " + minhaCalculadora.soma(1, 2))
  println("subtracao = " + minhaCalculadora.subtracao(9, 4))
  println("multiplicacao = " + minhaCalculadora.multiplicacao(3, 5))
  println("divisao = " + minhaCalculadora.divisao(8, 4))
  println("potencia = " + minhaCalculadora.potencia(2, 3))
  println("fatorial = " + minhaCalculadora.fatorial(4))
}
