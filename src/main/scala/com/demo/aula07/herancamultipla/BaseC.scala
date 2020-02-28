package com.demo.aula07.herancamultipla

// Esta classe (BaseC) herda o metodo digaOla() da classe BaseA e
// o metodo digaOla() da classe BaseB
// Os metodos tem a mesma assinatura, entao nao podem coexistir.
// Neste caso, qual dos 2 metodos prevalecerá?
class BaseC extends BaseA with BaseB {

  // descomentar o metodo abaixo
  override def digaOla() : Unit = {
    println("(BaseC) Olá!")
  }
}
