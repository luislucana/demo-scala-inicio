package com.demo.aula07.exemploconta

class ContaPoupanca(override val numeroConta: Int, override val titular: String)
      extends Conta(numeroConta, titular) {

  override def gerarTaxa(): Unit = {
    saldo += saldo * .006
  }

  override def toString: String = "ContaPoupanca{" + "numeroConta=" + numeroConta + ", titular='" + titular + '\'' + ", saldo=" + saldo + '}'
}
