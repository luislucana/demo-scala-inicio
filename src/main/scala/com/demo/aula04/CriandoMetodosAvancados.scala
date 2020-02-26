package com.demo.aula04

/**
  * Scala is a functional language. Functions are first-class values here – we can
  * use them like any other value type.
  *
  * In this section, we'll look into some advanced concepts related to functions – local
  * functions, higher-order functions, anonymous functions, and currying.
  */
object CriandoMetodosAvancados extends App {

  /**
    * (1) EXEMPLO DE METODO/FUNCAO LOCAL
    * Metodo que calcula a potencia de 'x' elevado a 'y'.
    *
    * @param x
    * @param y
    * @return
    */
  def power(x: Int, y: Int): Int = {

    // metodo local/interno - conhecido/acessivel somente dentro deste metodo (power)
    def powNested(i: Int, accumulator: Int): Int = {
      if (i <= 0) accumulator
      else powNested(i - 1, x * accumulator)
    }

    powNested(y, 1)
  }

  /**
    * (2) Exemplo de 'Higher-Order Function' (funcao de ordem superior)
    *
    * @param r
    * @param i
    * @param m
    * @param a
    * @param b
    * @return
    */
  def mapReduce(r: (Int, Int) => Int,
                i: Int,
                m: Int => Int,
                a: Int, b: Int): Int = {

    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else iter(a + 1, r(m(a), result))
    }

    iter(a, i)
  }

  println("power = " + power(2, 3))
  //println("mapReduce = " + mapReduce(2, 3))

  def square(x: Int) = x * x
  def sum(x: Int, y: Int) = x + y

  def sumSquares(a: Int, b: Int): Int = mapReduce(sum, 0, square, a, b)
  println(sumSquares(1,10))
}
