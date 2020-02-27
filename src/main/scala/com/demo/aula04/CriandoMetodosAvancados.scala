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

  println("power = " + power(2, 3))

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
  def mapReduce(r: (Int, Int) => Int, // recebe sum(x,y)
                i: Int, // recebe 0
                m: Int => Int, // recebe square(x)
                a: Int, // recebe 1
                b: Int): Int = { // recebe 10

    // metodo local
    def iter(a: Int, result: Int): Int = {
      if (a > b)
        result
      else
        iter(a + 1, r(m(a), result)) // recursao
    }

    // a = 1, i = 0
    iter(a, i)
  }

  def square(x: Int): Int = x * x
  def sum(x: Int, y: Int): Int = x + y

  def sumSquares(a: Int, b: Int): Int = mapReduce(sum, 0, square, a, b)

  println("sumSquares(mapReduce) = " + sumSquares(1,10))

  /**
    * (2b) Outro exemplo de 'Higher-Order Function' (funcao de ordem superior)
    * https://docs.scala-lang.org/tour/higher-order-functions.html
    */
  val salaries = Seq(20000, 70000, 40000)
  val doubleSalary = (x: Int) => x * 2 // funcao anonima
  val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)
  // outras formas de fazer a mesma coisa:
  // val newSalaries = salaries.map(x => x * 2) // List(40000, 140000, 80000)
  // val newSalaries = salaries.map(_ * 2)

  println("newSalaries = " + newSalaries)

  /**
    * (3) Currying Functions
    * https://www.geeksforgeeks.org/currying-functions-in-scala-with-examples/
    */
  def add(a: Int)(b: Int) = a + b
  // Partially Applied function.
  val sum = add(29)_
  //val sum = add(29)(_)

  println("sum = " + sum(7))
}
