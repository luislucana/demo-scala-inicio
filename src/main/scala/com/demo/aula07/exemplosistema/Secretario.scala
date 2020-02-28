package com.demo.aula07.exemplosistema

class Secretario extends Funcionario {
  override def getBonificacao: Double = this.salario + 200
}
