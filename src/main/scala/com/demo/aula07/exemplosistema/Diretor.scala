package com.demo.aula07.exemplosistema

class Diretor extends Funcionario with Autenticavel {

  override def autenticar(senha: String): Boolean = {
    // TODO fazer
    false
  }

  override def getBonificacao: Double = this.salario * 2 + 1000
}
