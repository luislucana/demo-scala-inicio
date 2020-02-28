package com.demo.aula07.exemplosistema

abstract class Funcionario {
  protected var nome: String = null
  protected var cpf: String = null
  protected var salario = .0

  def getNome: String = nome

  def setNome(nome: String): Unit = {
    this.nome = nome
  }

  def getCpf: String = cpf

  def setCpf(cpf: String): Unit = {
    this.cpf = cpf
  }

  def getSalario: Double = salario

  def setSalario(salario: Double): Unit = {
    this.salario = salario
  }

  def getBonificacao: Double
}
