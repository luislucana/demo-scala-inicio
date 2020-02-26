package com.demo

import com.demo.aula03.CriandoMetodosECondicoes._
import org.junit.Assert.assertEquals
import org.junit.Test

class ControlStructuresDemoUnitTest {
  @Test
  def givenTwoIntegers_whenGcdCalled_thenCorrectValueReturned() = {
    assertEquals(3, gcdRecursivo(15, 27))
  }

  @Test
  def givenTwoIntegers_whenGcdIterCalled_thenCorrectValueReturned() = {
    assertEquals(3, gcdIterativo(15, 27))
  }

  @Test
  def givenTwoIntegers_whenRangeSumcalled_thenCorrectValueReturned() = {
    assertEquals(55, rangeSum(1, 10))
  }

  @Test
  def givenPositiveInteger_whenFactorialInvoked_thenCorrectValueReturned() = {
    assertEquals(720, factorialIterativo(6))
  }

  @Test
  def whenFactorialOf0Invoked_then1Returned() = {
    assertEquals(1, factorialIterativo(0))
  }

}