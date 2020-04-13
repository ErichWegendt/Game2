import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyPanel p;
	private JLabel jl;
    private Szal sz;
   
    
    public MyFrame(int n)
	{
    	
		p=new MyPanel();
		add(p,BorderLayout.CENTER);
		jl=new JLabel("Points 0");
		add(jl,BorderLayout.SOUTH);
		setSize(1000,1000);
	    setVisible(true);
	    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    
	    sz=new Szal(n,p,this);
	    sz.start();
	}


	public JLabel getJl() {
		return jl;
	}


	public void setJl(JLabel jl) {
		this.jl = jl;
	}
}
