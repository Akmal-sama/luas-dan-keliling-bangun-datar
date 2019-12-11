//Source code by Akmal-sama
//Happy coding

import java.util.Scanner;
import java.io.IOException;

public class luasbangundatar{
	static void luas_persegi(){
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan jumlah sisi : ");
		double s;
		s = key.nextDouble();
		luas luass = new luas();
		luass.l_persegi(s);
		ulang("luas_persegi");
	}

	static void luas_persegi_panjang(){
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan jumlah panjang : ");
		double p;
		double l;
		p = key.nextDouble();
		System.out.print("Masukkan jumlah lebar   : ");
		l = key.nextDouble();
		luas luass = new luas();
		luass.l_persegi_panjang(p , l);
		ulang("luas_persegi_panjang");
	}

	static void luas_segitiga(){
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan jumlah alas : ");
		double a;
		double t;
		a = key.nextDouble();
		System.out.print("Masukkan jumlah tinggi : ");
		t = key.nextDouble();
		luas luass = new luas();
		luas.l_segitiga(a , t);
		ulang("luas_segitiga");
	}

	static void keliling_persegi(){
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan jumlah sisi : ");
		double s;
		s = key.nextDouble();
		keliling fkeliling = new keliling();
		fkeliling.k_persegi(s);
		ulang("keliling_persegi");
	}

	static void keliling_persegi_panjang(){
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan jumlah panjang : ");
		double p;
		p = key.nextDouble();
		System.out.print("Masukkan jumlah lebar   : ");
		double l;
		l = key.nextDouble();
		keliling fkeliling = new keliling();
		fkeliling.k_persegi_panjang(p , l);
		ulang("keliling_persegi_panjang");
	}

	static void keliling_segitiga(){
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan jumlah sisi a : ");
		double a;
		double b;
		double c;
		a = key.nextDouble();
		System.out.print("Masukkan jumlah sisi b : ");
		b = key.nextDouble();
		System.out.print("Masukkan jumlah sisi c : ");
		c = key.nextDouble();
		keliling fkeliling = new keliling();
		fkeliling.k_segitiga(a , b , c);
		ulang("keliling_segitiga");
	}

	static void ulang(String type){
		String choice;
		Scanner key = new Scanner(System.in);
		if (type.equals("luas_persegi")){
			System.out.print("Ulangi? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": luas_persegi();break;
				default:
					main_menu();
			}
		}

		else if (type.equals("luas_persegi_panjang")){
			System.out.print("Ulangi? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": luas_persegi_panjang(); break;
				default:
					main_menu();
			}
		}

		else if (type.equals("luas_segitiga")){
			System.out.print("Ulangi? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": luas_segitiga(); break;
				default:
					main_menu();
			}
		}

		else if (type.equals("keliling_persegi")){
			System.out.print("Ulangi? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": keliling_persegi(); break;
				default:
					main_menu();
			}
		}

		else if (type.equals("keliling_persegi_panjang")){
			System.out.print("Ulangi? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y" : keliling_persegi_panjang(); break;
				default:
					main_menu();
			}
		}

		else if (type.equals("keliling_segitiga")){
			System.out.print("Ulangi? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": keliling_segitiga(); break;
				default:
					main_menu();
			}
		}
	}

	static void keluar(String type){
		String choice;
		Scanner key = new Scanner(System.in);
		if (type.equals("keliling_menu")){
			System.out.print("keluar? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": main_menu(); break;
				default:
					keliling_menu();
			}
		}

		else if (type.equals("luas_menu")){
			System.out.print("Keluar? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": main_menu(); break;
				default:
					luas_menu();
			}
		}

		else if (type.equals("main_menu")){
			System.out.print("Keluar? [y/n] ");
			choice = key.nextLine();
			switch(choice){
				case "y": System.out.print("");break;
				default:
					main_menu();
			}
		}
	}

	static void keliling_menu(){
		main_menu menu = new main_menu();
		menu.show_menu();
		System.out.print("Masukkan pilihan anda : ");
		int choice;
		Scanner key = new Scanner(System.in);
		choice = key.nextInt();
		switch(choice){
			case 1: keliling_persegi(); break;
			case 2: keliling_persegi_panjang(); break;
			case 3: keliling_segitiga(); break;
			case 4: keluar("keliling_menu"); break;
			default:
				System.out.println("pilihan tidak ada!");
				keliling_menu();
		}
	}

	static void luas_menu(){
		main_menu menu = new main_menu();
		menu.show_menu();
		System.out.print("Masukkan pilihan anda : ");
		int choice;
		Scanner key = new Scanner(System.in);
		choice = key.nextInt();
		switch(choice){
			case 1: luas_persegi(); break;
			case 2: luas_persegi_panjang(); break;
			case 3: luas_segitiga(); break;
			default:
				System.out.println("pilihan tidak ada!");
				luas_menu();
		}
	}

	static void main_menu(){
		main_menu menu = new main_menu();
		menu.show();
		Scanner key = new Scanner(System.in);
		System.out.print("Masukkan pilihan anda : ");
		int choice;
		choice = key.nextInt();
		switch(choice){
			case 1 : luas_menu(); break;
			case 2 : keliling_menu(); break;
			case 3 : keluar("main_menu"); break;
			default:
				System.out.println("pilihan tidak ada!");
				main_menu();
		}
	}
	public static void main(String [] args){
		System.out.println("Selamat datang diprogram ini!!");
		System.out.println("Author : Akmal019");
		System.out.println("Luas dan keliling bangundatar 1.0");
		main_menu();
	}
}
