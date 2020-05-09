package ifs;

/**
 * The purpose of this class is
 * @author Ivael Yankam Wambo
 * @version 1.0
 * @since 1.8
 **/
public class BarnsleyFernIfs implements AffineTransform {
	private double[][] affine = new double[][]{
		{ 0.00, 0.00, 0.00, 0.16, 0.00, 0.00, 0.01},
		{ 0.85, 0.04, -0.04, 0.85, 0.00, 1.60, 0.85},
		{ 0.20, -0.26, 0.23, 0.22, 0.00, 1.60, 0.07},
		{ -0.15, 0.28, 0.26, 0.24, 0.00, 0.44, 0.07}
		};
	private String name = "Barnsley Fern";
	private double scale = 100;
	private int height = 503, 
				width = 1019, 
				xOffset = 228, 
				yOffset = 10;
		
	/**
	 * 
	 * @return Returns Name 
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return Returns the Matrix 
	 */
	public double[][] getAffine() {
		return affine;
	}
	/**
	 * 
	 * @return Returns the scale 
	 */
	public double getScale() {
		return scale;
	}
	/**
	 * 
	 * @return Returns the height 
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * 
	 * @return Returns the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * 
	 * @return Returns the xOffset 
	 */
	public int getXoffset() {
		return xOffset;
	}
	/**
	 * 
	 * @return Returns the yOffset 
	 */
	public int getYoffset() {
		return yOffset;
	}
}
