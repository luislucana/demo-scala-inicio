package com.demo.aula02

/**
  * Use val para constantes. Nao eh possivel alterar seu valor.
  *
  * Use var para valores que podem mudar (se precisar alterar o seu valor)
  *
  */
object DeclarandoVariaveis extends App {

  var x = 1 // posso mudar valor de x

  val y = 2 // nao posso mudar valor de y

  x = x + y

  println(x)
}
