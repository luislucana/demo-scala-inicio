package com.demo.aula07.exemploconta

class ContaCorrente(override var numeroConta: Int, override var titular: String)
  extends Conta(numeroConta, titular) {

  override def gerarTaxa(): Unit = {
    saldo -= 15.90
  }

  def sacar(valor: Double, cobraCPMF: Boolean): Boolean = {
    if (cobraCPMF)
      sacar(valor + valor * .0038)
    else
      sacar(valor)
  }

  override def toString: String = {
    "ContaCorrente{" + "numeroConta=" + numeroConta +
      ", titular='" + titular + '\'' + ", saldo=" + saldo + '}'
  }
}
