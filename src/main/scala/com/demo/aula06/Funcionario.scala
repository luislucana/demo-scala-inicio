package com.demo.aula06

/**
  * AULA 05 - Criando uma classe
  */
class Funcionario(val nome: String,
                  var salario: Int,
                  reajusteAnual: Int = 20) {

  def reajustarSalario(): Unit = {
    salario += reajusteAnual
  }

  override def toString =
    s"Funcionario(nome=$nome, salario=$salario)"
}

/**
  * A Trait which will make the toString return upper case value.
  */
trait UpperCasePrinter {
  override def toString: String = super.toString toUpperCase
}