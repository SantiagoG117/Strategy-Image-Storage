/**
 * @author Santiago Garcia
 * @Version 1.0
 * @since Java 17
 * @see Strategy.ImageStorage.Filter
 * @see Strategy.ImageStorage.ImageStorage
 * @see Strategy.ImageStorage.JPEGCompressor
 * @see Strategy.ImageStorage.PNGCompressor
 * @see Strategy.ImageStorage.BlackAndWhiteFilter
 * @see Strategy.ImageStorage.HighContrastFilter
 * Strategy class: Represents an algorithm to compress images
 */

/**
 * Strategy class: Represents an algorithm
 */
package Strategy.ImageStorage;

public interface Compressor {
    void compress(String fileName);
}
