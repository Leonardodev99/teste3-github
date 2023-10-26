package application;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter with path file input: ");
		String path = sc.nextLine();
		
		File sourceFile = new File(path);
		
		String sourceFolder = sourceFile.getParent();
		
		boolean subFolder = new File(sourceFolder+"\\out").mkdir();
		
		
		
		
		sc.close();

	}

}
