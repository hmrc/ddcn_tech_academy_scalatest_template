import org.scalatest._

class ChromosomeSpec extends WordSpec with MustMatchers {

  "Chromosome" must {

    "when given two string of '0' and '1' with an index of '0' return the swapped values" in {
      Chromosome.swapper("0", "1", 0) mustEqual List("1" , "0")
    }
  }
}
