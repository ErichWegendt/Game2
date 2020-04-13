import javax.swing.JButton;

public class Gomb extends JButton {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int n;
	private boolean lenyomott;
	
public Gomb(int n,String S) {
	super();
	this.n = n;
	lenyomott=false;
	this.setText(S);
}
public boolean isLenyomott() {
	return lenyomott;
}
public void setLenyomott(boolean lenyomott) {
	this.lenyomott = lenyomott;
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}

   
}
