

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import ifs.*;
import stl.*;

/**
 * The purpose of this class is
 * @author Ivael Yankam Wambo
 * @version 1.0
 * @since 1.8
 **/
public class IfsStlFile {
	public static void main(String[] args) {
		
		IfsCreator creat = new IfsCreator();
		AffineTransform[] array = creat.getTransforms();
		
		Scanner input = new Scanner(System.in);
		int choice = -1; 
		
		System.out.println("Available fractal images are: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("\t" + (i+1) + " " +array[i].getName());
		}
		
		
			while(0 >= choice || choice > (array.length)) {
				System.out.print("What image number do you want? ");
				choice = input.nextInt();
			}
			
		
		
		StlImage image = new StlImage(0.8, 4.0);
		
		Solid solid = image.createSolid(creat.generateIfs(array[choice-1]));
		
		
			PrintWriter printer;
			try {
				printer = new PrintWriter("C:\\FileIO" + '\\' + array[choice-1].getName() +".stl");
				solid.print(printer);
				printer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		
		input.close();
		System.out.print("Done");
	}
}

