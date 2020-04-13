import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Gomb jb[];
	private ArrayList<Integer> kat;

	public MyPanel() {
		kat = new ArrayList<Integer>();
		jb = new Gomb[16];
		setLayout(new GridLayout(4, 4));
		int i;

		for (i = 0; i < 16; i++) {
			String S = Integer.toString(i);
			jb[i] = new Gomb(i, S);
			add(jb[i]);
			jb[i].setBackground(Color.gray);

			jb[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
			         int n=((Gomb) arg0.getSource()).getN();
                     if (((Gomb) arg0.getSource()).isLenyomott()==false)
                     {
			         kat.add(n);
                     }
                     ((Gomb) arg0.getSource()).setLenyomott(true);
				}
			});
		}

	}

	public Gomb[] getJb() {
		return jb;
	}

	public ArrayList<Integer> getKat() {
		return kat;
	}

	public void setKat(ArrayList<Integer> kat) {
		this.kat = kat;
	}

	public void setJb(Gomb[] jb) {
		this.jb = jb;
	}

}
