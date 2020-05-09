package stl;
/**
 * The purpose of this class is
 * @author Ivael Yankam Wambo
 * @version 1.0
 **/
public class StlImage {
	private double minThick, thickScale, scale = 0.1, maxValue;
	public StlImage(double min, double max){
		minThick = min;
		thickScale = max - min;
	}
	/**
	 * 
	 * @param min
	 * @param max
	 */
	public Solid createSolid(int[][] matrix){
		Solid solid = new Solid();
		int x = 0, y = 0, length = 0, width = 0;
		
		for(x = 0, length = matrix.length; x < length; x++) {
			for(y = 0, width = matrix[x].length; y < width; y++) {
				if(matrix[x][y] > maxValue) {
					maxValue = matrix[x][y];
				}
			}
		}
		
		for(x = 0, width = matrix.length; x < width - 1; x++) {
			for(y = 0, length = matrix[x].length; y < length - 1; y++) {
				Vertex v1 = createIfsVertex(x, y, matrix[x][y]);
				Vertex v2 = createIfsVertex(x+1, y, matrix[x+1][y]);
				Vertex v3 = createIfsVertex(x+1, y+1, matrix[x+1][y+1]);
				Vertex v4 = createIfsVertex(x, y+1, matrix[x][y+1]);
				solid.addFacet(v1, v2, v3, v4);
			}
		}//*/

		Vertex v1, v2, v3, v4;
		
		v1 = new Vertex(0, 0, 0);
		v2 = new Vertex(width * scale, 0, 0);
		v3 = new Vertex(width * scale, 0, minThick);
		v4 = new Vertex(0, 0, minThick);
		solid.addFacet(v1, v2, v3, v4);

		v1 = new Vertex(0, length * scale, 0);
		v2 = new Vertex(0, 0, 0);
		v3 = new Vertex(0, 0, minThick);
		v4 = new Vertex(0, length * scale, minThick);
		solid.addFacet(v1, v2, v3, v4);
		
		v1 = new Vertex(width * scale, 0, 0);
		v2 = new Vertex(width * scale, length * scale, 0);
		v3 = new Vertex(width * scale, length * scale, minThick);
		v4 = new Vertex(width * scale, 0, minThick);
		solid.addFacet(v1, v2, v3, v4);
		
		v1 = new Vertex(width * scale, length * scale, 0);
		v2 = new Vertex(0, length * scale, 0);
		v3 = new Vertex(0, length * scale, minThick);
		v4 = new Vertex(width * scale, length * scale, minThick);
		solid.addFacet(v1, v2, v3, v4);
		
		v1 = new Vertex(0, 0, 0);
		v2 = new Vertex(0, length * scale, 0);
		v3 = new Vertex(width * scale, length * scale, 0);
		v4 = new Vertex(width * scale, 0, 0);
		solid.addFacet(v1, v2, v3, v4);
		
		return solid;
	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	private Vertex createIfsVertex(double x, double y, double z) {
		return new Vertex(x * scale, y * scale, minThick + thickScale * Math.sqrt(z/maxValue));
	}
}
