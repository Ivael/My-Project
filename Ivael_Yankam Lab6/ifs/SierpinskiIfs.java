package ifs;

public class SierpinskiIfs implements AffineTransform {
	private double[][] affine = new double[][]{
		{ 0.50, 0.00, 0.00, 0.50, 0.00, 0.00, 0.33}, 
		{ 0.50, 0.00, 0.00, 0.50, 0.00, 0.50, 0.33}, 
		{ 0.50, 0.00, 0.00, 0.50, 0.43, 0.25, 0.34}
		};
	private String name = "Sierpinski";
	private double scale = -500;
	private int height = 449, 
				width = 519, 
				xOffset = 439, 
				yOffset = 509;
	
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
