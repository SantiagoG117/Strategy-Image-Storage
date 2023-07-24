/**
 * @author Santiago Garcia
 * @Version 1.0
 * @since Java 17
 * @see Strategy.ImageStorage.Compressor
 * @see Strategy.ImageStorage.Filter
 * @see Strategy.ImageStorage.ImageStorage
 * @see Strategy.ImageStorage.PNGCompressor
 * @see Strategy.ImageStorage.BlackAndWhiteFilter
 * @see Strategy.ImageStorage.JPEGCompressor
 * ConcreteStrategy class
 */

package Strategy.ImageStorage;

public class HighContrastFilter implements Filter{
    @Override
    public void applyFilter(String image) {
        System.out.println("Applying high contrast filter to " + image);
    }
}
