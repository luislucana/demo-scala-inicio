package com.demo.aula07.exemploconta

object TesteSistemaContas extends App {
  val contaCorrente = new ContaCorrente(123450, "Fulano de tal")

  val contaPoupanca = new ContaPoupanca(543210, "José da Silva")

  System.out.println(contaCorrente)
  System.out.println(contaPoupanca)

  contaCorrente.depositar(350.00)

  System.out.println(contaCorrente)

  contaCorrente.sacar(100.00)

  System.out.println(contaCorrente)
}
