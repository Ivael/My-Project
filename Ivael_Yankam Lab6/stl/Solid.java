package stl;
import java.io.PrintWriter;
import java.util.*;
/**
 * The purpose of this class is
 * @author Ivael Yankam Wambo
 * @version 1.0
 **/
public class Solid {
	private String name;
	private List<Facet> facets= new ArrayList<>();
	/**
	 * 
	 */
	public Solid() {
		name = "";
	}
	/**
	 * 
	 * @param name
	 */
	public Solid(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @param facet
	 * @return
	 */
	public boolean addFacet(Facet facet) {
		return facets.add(facet);
	}
	/**
	 * 
	 * @param vertices
	 * @return
	 */
	public boolean addFacet(Vertex... vertices) {
        if (vertices.length < 3) {
            return false;
        }
        else {
            int i = 0;
            for(i = 0; i <(vertices.length-2); i++) {
                facets.add(new Facet(vertices[0], vertices[i+1], vertices[i+2]));
            }
            return true;
		}
	}
	/**
	 * 
	 * @param printWriter
	 */
	public void print(PrintWriter printWriter) {
		printWriter.print("solid " + name + "\n");
		for(Facet facet : facets) printWriter.print(facet.toString());
		printWriter.print("endsolid " + name);
	}
	
	public String toString() {
		String holder = "solid " + name + "\n";
		for(Facet facet : facets) holder = holder + facet.toString();
		holder = holder + "endsolid " + name;
		return holder;
	}
}
