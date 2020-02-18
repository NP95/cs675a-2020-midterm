package midterm

import com.microsoft.z3

object CryptArithmetic {
  case class Puzzle(wordA : String, wordB : String, mapping : Map[Char, Int])
  val ctx = new z3.Context()

  def findLongestPuzzle() : Puzzle = {
    throw new NotImplementedError("Implement findLongestPuzzle.")
  }
}