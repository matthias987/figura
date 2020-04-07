public class LannoccaQuadrato extends LannoccaFigura {
	//attributo
 private double lato;
 
 /**
  * costruttori
  * @param lato
  */
 public LannoccaQuadrato(double lato) {
	 this.lato=lato;
 }
 /**
  * 
  * @return
  */
 public double area() {
	 return(lato*lato);
 }
 
 public double perimetro() {
	 return (4*lato);
 }
}