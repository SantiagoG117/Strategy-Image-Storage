/**
 * @author Santiago Garcia
 * @Version 1.0
 * @since Java 17
 * @see Strategy.ImageStorage.Compressor
 * @see Strategy.ImageStorage.Filter
 * @see Strategy.ImageStorage.ImageStorage
 * @see Strategy.ImageStorage.JPEGCompressor
 * @see Strategy.ImageStorage.PNGCompressor
 * @see Strategy.ImageStorage.HighContrastFilter
 * ConcreteStrategyB
 */

package Strategy.ImageStorage;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void applyFilter(String image) {
        System.out.println("Applying Black and white filter to " + image);
    }
}
