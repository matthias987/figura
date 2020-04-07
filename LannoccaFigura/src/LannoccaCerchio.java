public class LannoccaCerchio extends LannoccaFigura {
	//attributo
 private double raggio;
 
 /**
  * costruttori
  * @param raggio
  */
 public LannoccaCerchio(double raggio) {
	 this.raggio=raggio;
 }
 /**
  * 
  * @return
  */
 public double area() {
	 return(raggio*raggio*Math.PI);
 }
 
 public double perimetro() {
	 return (2*raggio*Math.PI);
 }
}