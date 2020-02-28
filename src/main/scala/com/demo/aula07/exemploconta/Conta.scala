package com.demo.aula07.exemploconta

abstract class Conta(var numeroConta: Int, var titular: String) {

  // representa o saldo atual dessa conta
  protected var saldo = .0

  // saca o valor da conta e retorna true se operação bem sucedido
  def sacar(valor: Double): Boolean = {
    if (valor < saldo) {
      this.saldo -= valor
      true
    }
    else
      false
  }

  // deposita o valor na conta e retorna true se operação bem sucedido
  def depositar(valor: Double): Boolean = {
    this.saldo += valor
    true
  }

  //recebe como parâmetro a contaDestino, a qual sofrerá um  crédito do valor.
  //ao mesmo tempo, esse mesmo valor deverá ser debitado da conta origem
  def transferir(contaDestino: Conta, valor: Double): Boolean = {
    val retirou = sacar(valor)
    if (retirou) {
      contaDestino.depositar(valor)
      true
    }
    else false
  }

  //retorna o saldo da conta
  def getSaldo: Double = this.saldo

  def gerarTaxa(): Unit = {
  }

  override def toString: String = "Conta{" + "numeroConta=" + numeroConta + ", titular='" + titular + '\'' + ", saldo=" + saldo + '}'
}