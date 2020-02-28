package com.demo.aula07.exemplosistema

class Engenheiro extends Funcionario {
  override def getBonificacao: Double = this.salario + 800
}
