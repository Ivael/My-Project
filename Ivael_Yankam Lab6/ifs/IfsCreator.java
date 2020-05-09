package ifs;
import java.util.Random;

public class IfsCreator {
	private static int A = 0, 
					   B = 1, 
					   C = 2, 
					   D = 3, 
					   E = 4, 
					   F = 5, 
					   PROB = 6;
	/**
	 * 
	 * @param ifs
	 * @return
	 */
	public int[][] generateIfs(AffineTransform ifs){
		
		Random rand = new Random();
		
		int scale = (int) ifs.getScale(); 
		int height = ifs.getHeight();
		int width=ifs.getWidth(); 
		int xOffset=ifs.getXoffset();
		int yOffset=ifs.getYoffset();
		int[][] image = new int[ifs.getWidth()][ifs.getHeight()];
		double[][] config = ifs.getAffine();
		
		/**
		 * The following code includes an algorithm I developed
		 * Each time the row's probability is below the random number, it adds up the probabilities
		 * once the row's probability is greater than the random number, a row is selected
		 */
		double x, y, probability;
		int i, row;
		for (i = 0, x = 0, y = 0, probability = 0; i < width * height; i++) {
			double n = rand.nextFloat();
			int rowCheck = 0;
			row = -1;
			for (rowCheck = 0, probability = 0; row < 0; rowCheck++) {
				probability += config[rowCheck][PROB];
				if (n < (double) probability) {
					row = rowCheck;
				}
			}
			double u = config[row][A]*x + config[row][B]*y + config[row][E], 
					v = config[row][C]*x + config[row][D]*y + config[row][F]; 
			x=u; 
			y=v; 
			int displacementX=(int)(x*scale+xOffset); 
			int displacementY=(int)(y*scale+yOffset); // 
			image[(int) displacementY][(int) displacementX]++;
		}
		
		return image;
	}
	/**
	 * 
	 * @return new AffineTransform[]
	 */
	public AffineTransform[] getTransforms() {
		return new AffineTransform[]{new BarnsleyFernIfs(), new SierpinskiIfs(), new MapleIfs(), new FileIfs("c:\\FileIO\\GoldenDragon (1).ifs")};
	}
}