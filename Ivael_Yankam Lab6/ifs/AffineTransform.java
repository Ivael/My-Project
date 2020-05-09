package ifs;
/**
 * The purpose of this class is
 * @author Ivael Yankam Wambo
 * @version 1.0
 * @since 1.8
 **/
public interface AffineTransform {
	
	public  String getName();
		
	
	public double[][] getAffine();
	
	
	public double getScale();
	
	
	public int getHeight(); 
		
	
	public int getWidth(); 
		
	
	public int getXoffset(); 
		
	
	public int getYoffset(); 
	
	
}
