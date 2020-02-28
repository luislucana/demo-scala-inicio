package com.demo.aula07.multipletraits

object TesteMultiplosTraits extends App {

  var objeto = new EntidadeC

  objeto.facaAlgo()

  val resultadoSoma = objeto.soma(2,3)
  println("resultado (soma) = " + resultadoSoma)

  val resultadoRepita = objeto.repita("bla", 3)
  println(resultadoRepita)
}
