package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import advance.dev.dao.IShape;
import advance.dev.dao.ShapManager;
import advance.dev.models.Rectrangle;
import advance.dev.models.TRiangle;
import advance.dev.models.circle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
	    IShape ShapeManager = new ShapManager();
//		System.out.println("nhap vao 5 hinh");
//		System.out.println("nhap vao 2 hinh tron");
//		for (int i = 0; i < 2; i++) {
//			System.out.println("nhap ban kinh");
//			double bk = sc.nextDouble();
//			sc.nextLine();
//			
//		ShapeManager.add(new circle(bk));	
//		}
//		System.out.println("nhap vao 2 hinh chu nhat");
//		for (int i = 0; i < 2; i++) {
//			System.out.println("nhap a");
//			double a= sc.nextDouble();
//			sc.nextLine();
//			
//			System.out.println("nhap b");
//			double b = sc.nextDouble();
//			sc.nextLine();
//		IShape shapManager = new ShapManager();
//		shapManager.add(new Rectrangle(a, b));	
//		
//			
//		}
//		System.out.println("nhap vao 1 tam giac");
//		System.out.println("nhap a");
//		double a= sc.nextDouble();
//		sc.nextLine();
//		
//		System.out.println("nhap b");
//		double b = sc.nextDouble();
//		sc.nextLine();
//		
//		System.out.println("nhap c");
//		double c = sc.nextDouble();
//		sc.nextLine();
//		
//		ShapeManager.add(new TRiangle(a, b, c));
//		ShapeManager.print();
		//doc tin txt
		try {
			FileInputStream fis = new FileInputStream("in.txt");
			BufferedReader br = new BufferedReader( new InputStreamReader(fis));
			String line;
			while ((line = br.readLine()) != null) {
				if(line.indexOf("#circle") >= 0) {
					double bk = Double.parseDouble(br.readLine());
					ShapeManager.add(new circle(line ,bk));
					
				}
				if(line.indexOf("#rectangle") >= 0) {
					double a = Double.parseDouble(br.readLine());
					double b = Double.parseDouble(br.readLine());
					ShapeManager.add(new Rectrangle(a, b, line));
				}
				if (line.indexOf("triangle") >= 0) {
					double a = Double.parseDouble(br.readLine());
					double b = Double.parseDouble(br.readLine());
					double c = Double.parseDouble(br.readLine());
					ShapeManager.add(new TRiangle(a, b, c,line));
					
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		ShapeManager.print();
		ShapeManager.print();
		ShapeManager.print();
		
	}

	
	}


