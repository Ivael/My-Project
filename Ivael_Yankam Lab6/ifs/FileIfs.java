package ifs;

/**
 * The purpose of this class is
 * @author Ivael Yankam 
 * @version 1.0
 * @since 1.8
 **/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIfs implements AffineTransform {
	
	private String name;
	private double[][] affine;
	private double scale;
	private int height, width, xOffset, yOffset;
	
	/**
	 * Creates a FileIfs object
	 * @param fileName Path to file
	 * 
	*/
	public FileIfs(String fileName){
		File file=new File(fileName);
		try (Scanner scan = new Scanner(file)){
			String store = scan.nextLine();
			int x = Integer.parseInt(store.substring((store).indexOf("	")+1));
			affine = new double[x][7];
			for(int i = 0; i < x; i++) {
				store = scan.nextLine();
				store = store.replaceAll("   ", " ") + " ";
				store = store.replaceAll("  ", " ");
				if(store.charAt(0) == ' ') {
					store = store.substring(1, store.length());
				}
				
				for(int j = 0; j < 7; j++) {
					affine[i][j] = Double.parseDouble(store.substring(0, store.indexOf(" ")));
					store = store.substring(store.indexOf(" ")+1, store.length());
					
				}
			}
			store = scan.nextLine();
			scale = Integer.parseInt(store.substring((store).indexOf(" ")+1));
			store = scan.nextLine();
			height = Integer.parseInt(store.substring((store).indexOf(" ")+1));
			store = scan.nextLine();
			width = Integer.parseInt(store.substring((store).indexOf(" ")+1));
			store = scan.nextLine();
			xOffset = Integer.parseInt(store.substring((store).indexOf(" ")+1));
			store = scan.nextLine();
			yOffset = Integer.parseInt(store.substring((store).indexOf(" ")+1));
			store = scan.nextLine();
			name = store.substring((store).indexOf(" ")+1);
			
			System.out.println(store);
			System.out.println(+2);

			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
