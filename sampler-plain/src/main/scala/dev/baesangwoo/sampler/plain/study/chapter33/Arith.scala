package dev.baesangwoo.sampler.plain.study.chapter33

import scala.util.parsing.combinator.JavaTokenParsers

class Arith extends JavaTokenParsers {

  def expr: Parser[Any] = term ~ rep("+" ~ term | "-" ~ term)

  def term: Parser[Any] = factor ~ rep("*" ~ factor | "/" ~ factor)

  def factor: Parser[Serializable] = floatingPointNumber | "(" ~ expr ~ ")"
}
