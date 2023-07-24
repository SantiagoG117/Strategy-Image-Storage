/**
 * @author Santiago Garcia
 * @Version 1.0
 * @since Java 17
 * @see Strategy.ImageStorage.Compressor
 * @see Strategy.ImageStorage.Filter
 * @see Strategy.ImageStorage.ImageStorage
 * @see Strategy.ImageStorage.PNGCompressor
 * @see Strategy.ImageStorage.BlackAndWhiteFilter
 * @see Strategy.ImageStorage.HighContrastFilter
 * ConcreteStrategy class
 */
package Strategy.ImageStorage;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String image) {
        System.out.println("Compressing " + image +" using JPEG");
    }
}
