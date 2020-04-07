import java.util.Scanner;

public class LannoccaFigura {
	
	/**
	 * classe main
	 * @param args
	 * @author Matthias Lannocca
	 */
 
	public static void main(String[]args) {
		double r, b, B, l , a, lo;
		Scanner t= new Scanner (System.in);
		System.out.println("inserisci raggio base: ");
		r=t.nextInt();
		
		LannoccaCerchio c= new LannoccaCerchio(r);
		System.out.println(c.area());
		System.out.println(c.perimetro());
		
		System.out.println("inserisci l'altezza: ");
		a=t.nextInt();
		System.out.println("inserisci il lato obliquo: ");
		lo=t.nextInt();
		System.out.println("inserisci la base maggiore: ");
		B=t.nextInt();
		System.out.println("inserisci la base minore: ");
		b=t.nextInt();
		
		LannoccaTrapezio tr = new LannoccaTrapezio(B, b, a, lo);
		System.out.println("Area trapezio" + tr.area());
		System.out.println("Perimetro trapezio" + tr.perimetro());
		
		System.out.println("inserisci il lato: ");
		l=t.nextInt();
		LannoccaQuadrato q= new LannoccaQuadrato(l);
		System.out.println("Area del Quadrato: " + q.area());
		System.out.println("Permitro del quadrato: " + q.perimetro());
	}

	
}