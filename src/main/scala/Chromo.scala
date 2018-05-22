object Chromo extends App {

  def crossover(chromo1: String, chromo2: String, index: Int) = {

    val split1 = chromo1.splitAt(index)
    val split2 = chromo2.splitAt(index)

    (split1._1 + split2._2, split2._1 + split1._2)
  }
}
