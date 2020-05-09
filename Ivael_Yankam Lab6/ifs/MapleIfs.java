package ifs;

/**
 * The purpose of this class is
 * @author Ivael Yankam
 * @version 1.0
 * @since 1.8
 **/
public class MapleIfs implements AffineTransform {
	private double[][] affine = new double[][]{
		{ 0.51, 0.00, 0.01, 0.14, 1.31, 0.08, 0.10},
		{ 0.50, -0.45, 0.52, 0.43, 0.75, -1.49, 0.35},
		{ 0.47, 0.47, -0.49, 0.45, 0.74, 1.62, 0.35},
		{ 0.51, 0.00, 0.00, 0.49, -1.62, -0.02, 0.20}
		};
	
	private String name = "Maple Leaf";
	private double scale = 100;
	private int height = 702,
				width = 885, 
				xOffset = 340,
				yOffset = 445;

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
