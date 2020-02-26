package com.demo.aula03

/**
  * We define methods using the def keyword. Following the keyword,
  * we specify the method name, parameter declarations, a separator (colon) and
  * return type. After this, we specify a separator (=) followed by the method body.
  *
  * In contrast to Java, we do not use the return keyword to return the result.
  * A method returns the value of the last expression evaluated.
  */
object CriandoMetodosECondicoes extends App {

  // def [nome do metodo][parenteses com os parametros (opcional)] : [tipo de dado a ser retornado] = [linha(s) de codigo]

  /**
    * GCD (greatest common divisor)
    *
    * @param x
    * @param y
    * @return
    */
  def gcdRecursivo(x : Int, y : Int) : Int = {
    if (y == 0) x else gcdRecursivo(y, x % y)
  }

  /**
    * GCD (greatest common divisor)
    *
    * @param x
    * @param y
    * @return
    */
  def gcdIterativo(x : Int, y : Int) : Int = {
    var a = x
    var b = y
    while (b > 0) {
      a = a % b
      val t = a
      a = b
      b = t
    }
    a
  }

  /**
    * Soma de todos os numeros entre 'a' e 'b'
    *
    * @param a
    * @param b
    * @return
    */
  def rangeSum(a : Int, b : Int) = {
    var sum = 0;
    for (i <- a to b) {
      sum += i
    }
    sum
  }

  /**
    * Fatorial - Produto de todos os inteiros positivos menores ou iguais a n.
    * Exemplo: Fatorial de 5 -> 5! = 5 * 4 * 3 * 2 * 1 = 120
    *
    * @param a
    * @return
    */
  def factorialIterativo(a : Int) : Int = {
    var result = 1
    var i = 1

    do {
      result *= i
      i = i + 1
    } while (i <= a)

    result
  }

  /**
    * Fatorial - Produto de todos os inteiros positivos menores ou iguais a n.
    * Exemplo: Fatorial de 5 -> 5! = 5 * 4 * 3 * 2 * 1 = 120
    *
    * @param a
    * @return
    */
  def factorialRecursivo(a : Int) : Int = {
    if (a > 0) a * factorialRecursivo(a-1) else 1
  }

  /**
    * Media de 2 numeros
    *
    * @param x
    * @param y
    * @return
    */
  def avg(x: Double, y: Double): Double = {
    (x + y) / 2
  }

  // definindo metodo em uma linha
  def coinToss: String = if (Math.random > 0.5) "Head" else "Tail"

  // NAO HA NECESSIDADE DE CRIAR O METODO MAIN NESTE CASO.
  //def main(args: Array[String]): Unit = {
    val media = avg(1,3)
    println("media = " + media)

    println("fatorial iterativo = " + factorialIterativo(5))

    println("fatorial recursivo = " + factorialRecursivo(5))

    println("rangeSum = " + rangeSum(2,4)) // rangeSum(2,4) = 2 + 3 + 4 = 9

    println("gcd Iterativo = " + gcdIterativo(8,4)) // maior divisor comum entre 2 numeros

    println("gcd Recursivo = " + gcdRecursivo(8,4)) // maior divisor comum entre 2 numeros
  //}
}
