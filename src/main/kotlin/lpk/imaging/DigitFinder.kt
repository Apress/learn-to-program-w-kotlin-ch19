package lpk.imaging

import java.awt.Color

class DigitFinder(val input : Picture) {

    fun digits() : List<Picture> {
        val result = mutableListOf<Picture>()
        result.add(input)
        return result
    }
}