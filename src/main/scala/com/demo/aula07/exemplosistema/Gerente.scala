package com.demo.aula07.exemplosistema

class Gerente(var senha: String = "123456") extends Funcionario with Autenticavel {

  def getSenha: String = senha

  def setSenha(senha: String): Unit = {
    this.senha = senha
  }

  override def getBonificacao: Double = this.salario * 1.4 + 1000

  override def autenticar(senha: String): Boolean = {
    if (this.senha ne senha) return false
    // pode fazer outras possíveis verificações, como saber se esse
    // departamento do gerente tem acesso ao Sistema
    true
  }
}
