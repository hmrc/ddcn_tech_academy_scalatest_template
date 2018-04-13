import org.scalatest.{MustMatchers, WordSpec}

class ChromosomeCrossoverSpec extends WordSpec with MustMatchers{

  "cromosomeCrossover" when {
    "will switch two inputs around" in {
    ChromosomeCrossover.crossover() mustBe ()
    }

  }

}
