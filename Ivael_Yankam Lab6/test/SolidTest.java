package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stl.*;

class SolidTest {
	Vertex V1 = new Vertex(0, 0, 0), V2 = new Vertex(0, 1, 0), V3 = new Vertex(0, 0, 1), V4 = new Vertex(0, 0, 0), V5 = new Vertex(0, 0, 0), V6 = new Vertex(0, 0, 0), V7 = new Vertex(0, 0, 0), V8  = new Vertex(0, 0, 0), V9 = new Vertex(0, 0, 0);
	Solid S1 = new Solid(), S2 = new Solid(), S3 = new Solid();
	@Test
	void testInvalid() {
		System.out.print(S2.addFacet(V1));
		String holder = S1.toString();
		assertTrue(holder.contentEquals(S2.toString()));
	}
	@Test
	void test3() {
		Facet facet = new Facet(V1, V2, V3);
		S2.addFacet(facet);
		S1.addFacet(V1, V2, V3);
		String holder = S1.toString();
		assertTrue(holder.contentEquals(S2.toString()));
	}
	
	@Test
	void test4() {
		Facet facet = new Facet(V1, V2, V3);
		Facet facet2 = new Facet(V1, V3, V4);
		S2.addFacet(facet);
		S2.addFacet(facet2);
		S1.addFacet(V1, V2, V3, V4);
		String holder = S1.toString();
		assertTrue(holder.contentEquals(S2.toString()));
	}
	
	@Test
	void test9() {
		Facet facet = new Facet(V1, V2, V3);
		Facet facet2 = new Facet(V1, V3, V4);
		Facet facet3 = new Facet(V1, V4, V5);
		Facet facet4 = new Facet(V1, V5, V6);
		Facet facet5 = new Facet(V1, V6, V7);
		Facet facet6 = new Facet(V1, V7, V8);
		Facet facet7 = new Facet(V1, V8, V9);
		S2.addFacet(facet);
		S2.addFacet(facet2);
		S2.addFacet(facet3);
		S2.addFacet(facet4);
		S2.addFacet(facet5);
		S2.addFacet(facet6);
		S2.addFacet(facet7);
		S1.addFacet(V1, V2, V3, V4, V5, V6, V7, V8, V9);
		String holder = S1.toString();
		assertTrue(holder.contentEquals(S2.toString()));
	}
}