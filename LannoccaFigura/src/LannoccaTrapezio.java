public class LannoccaTrapezio extends LannoccaFigura {
	//attributo
 private double baseMa, baseMi, altezza, latoObl;
 
 /**
  * costruttori
  * @param baseMA
  * @param baseMi
  * @param altezza
  */
 public LannoccaTrapezio(double baseMa, double baseMi, double altezza, double latoObl) {
	 this.baseMa= baseMa;
	 this.baseMi= baseMi;
	 this.altezza= altezza;
	 this.latoObl= latoObl;
 }
 /**
  * 
  * @return
  */
 public double area() {
	 return(baseMa*baseMi*altezza/2);
 }
 
 public double perimetro() {
	 return (baseMa+baseMi+2*latoObl);
 }
}