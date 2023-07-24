/**
 * @author Santiago Garcia
 * @Version 1.0
 * @since Java 17
 * @see Strategy.ImageStorage.Compressor
 * @see Strategy.ImageStorage.ImageStorage
 * @see Strategy.ImageStorage.JPEGCompressor
 * @see Strategy.ImageStorage.PNGCompressor
 * @see Strategy.ImageStorage.BlackAndWhiteFilter
 * @see Strategy.ImageStorage.HighContrastFilter
 * Strategy class: Represents an algorithm to apply filters to images
 */

package Strategy.ImageStorage;

public interface Filter {
    void applyFilter(String image);
}
