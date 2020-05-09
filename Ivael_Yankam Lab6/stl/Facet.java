package stl;
/**
 * The purpose of this class is
 * @author Ivael Yankam Wambo
 * @version 1.0
 **/
public class Facet {
	private Vertex normal, v1, v2, v3;
	/**
	 * 
	 * @param v1
	 * @param v2
	 * @param v3
	 */
	public Facet(Vertex v1, Vertex v2, Vertex v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.normal = Vertex.calcNormal(v1, v2, v3);
	}
	
	public String toString() {
		return ("facet normal" + normal.toString()
				+ " outer loop\n"
				+ "  vertex" + v1.toString()
				+ "  vertex" + v2.toString()
				+ "  vertex" + v3.toString()
				+ " endloop\n"
				+ "endfacet\n");
	}
}
