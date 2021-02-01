package lpk.imaging.test

import org.junit.Test
import lpk.imaging.DigitFinder
import lpk.imaging.Picture
import lpk.imaging.loadPictureFromFile
import java.io.File
import java.nio.file.Paths

val SIGNS = "src/test/resources/images/signs/"

fun loadSign(name: String): DigitFinder {
    val file = Paths.get(SIGNS + name).toFile()
    return DigitFinder(loadPictureFromFile(file))
}
fun saveInTempDir(picture: Picture, name: String) {
    val tempDir = File("temp")
    tempDir.mkdirs()
    val file = File(tempDir, name)
    picture.saveTo(file)
}
class DigitFinderTest {
    @Test
    fun analyse() {
        val s80 = loadSign("80.png")
        val digitPictures = s80.digits()
        saveInTempDir(digitPictures[0], "p0.png")
    }
}