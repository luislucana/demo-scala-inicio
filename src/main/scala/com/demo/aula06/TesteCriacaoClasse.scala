package com.demo.aula06

object TesteCriacaoClasse extends App {
  val funcionario = new Funcionario("Fulano de tal", 1000)
  funcionario.reajustarSalario()

  println("Salario do Fulano de Tal após reajuste: " + funcionario.salario)
}
