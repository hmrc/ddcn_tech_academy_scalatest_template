import org.scalatest._

class ChromoSpec extends WordSpec with MustMatchers {

  "Chromo" must {

    "when given a chromo 1 of '11' and a chromo 2 of '00' and an index of 0 return '00' and '11' " in {

      Chromo.crossover("11", "00", 0) mustEqual ("00", "11")
    }

    "when given a chromo 1 of '11' and a chromo 2 of '00' and an index of 1 return '10' and '01' " in {

      Chromo.crossover("11", "00", 1) mustEqual ("10", "01")
    }
    "when given a chromo 1 of '1111111' and a chromo 2 of '0000000' and an index of 3 return '1110000' and '0001111' " in {

      Chromo.crossover("1111111", "0000000", 3) mustEqual ("1110000", "0001111")
    }
  }
}