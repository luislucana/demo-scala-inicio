package com.demo.aula07.exemplosistema

object TesteSistema extends App {

  var gerenteQualquer = new Gerente

  var autenticado = gerenteQualquer.autenticar("123456")

  if (autenticado) {
    println("autenticado com sucesso!")
  } else {
    println("acesso negado - voce errou sua senha")
  }
}
