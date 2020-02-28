package com.demo.aula07.multipletraits

// Esta classe (EntidadeC) herda o metodo facaAlgo() da classe EntidadeA e
// o metodo facaAlgo() da classe EntidadeB
// Os metodos tem a mesma assinatura, entao nao podem coexistir.
// Neste caso, qual dos 2 metodos prevalecerá?
class EntidadeC extends EntidadeA with EntidadeB {

  def soma(a: Int, b: Int): Int = {
    a + b
  }

  def repita(texto: String, n: Int): String = {
    texto * n
  }

  override def facaAlgo() : Unit = {
    println("Entidade C fazendo algo...")
  }
}
