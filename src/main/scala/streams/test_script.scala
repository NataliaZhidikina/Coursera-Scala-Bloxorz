package streams

import common._

object test extends StringParserTerrain {
  val level =
      """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin
  
  val p: List[Pos] = List(new Pos(0, 0), new Pos(1, 2), 
  	                      new Pos(2, 3), new Pos(4, 2), new Pos(4, 2))
}

object testb extends StringParserTerrain {
	  val level =
      """ooo-------
        |oSoooo----
        |ooooooooo-
        |-ooooooooo
        |-----ooToo
        |------ooo-""".stripMargin


     val bb:  List[Block] = List(new Block(new Pos (0, 0), new Pos(0, 1)), 
     							 new Block(new Pos(0, 0), new Pos(0, 0)))
  }