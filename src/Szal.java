
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Szal extends Thread {

	private Random rand;
	private ArrayList<Integer> li, kat;
	private Gomb jb[];
	private int n;
	private MyPanel p;
	private JLabel l;
	private MyFrame f;

	public Szal(int n, MyPanel p, MyFrame f) {
		this.n = n;
		this.p = p;
		this.f = f;
	}

	public void run() {
		rand = new Random();
		int r;
		int pozi;
		jb = p.getJb();
		l = new JLabel();
		li = new ArrayList<Integer>();
		int lenyomott = 0;
		for (int j = 0; j < n; j++) {
			r = rand.nextInt(4);
			r++;
			for (int i = 0; i < r; i++) {
				pozi = rand.nextInt(16);
				while (li.contains(pozi)) {
					pozi = rand.nextInt(16);
				}
				li.add(pozi);
				jb[pozi].setBackground(Color.red);
			}

			p.setJb(jb);
			p.repaint();

			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i < r; i++) {
				pozi = li.get(i);
				jb[pozi].setBackground(Color.gray);
			}

			p.setJb(jb);
			p.repaint();

			kat = p.getKat();
			while (kat.size() > 0) {
				kat.remove(0);
			}
			p.setKat(kat);

			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			kat = p.getKat();

			for (int i = 0; i < kat.size() && i < r; i++) {

				if (li.contains(kat.get(i))) {
					lenyomott++;
				}

			}

			String S = "Points: ";
			S = S + Integer.toString(lenyomott);
			l = f.getJl();
			l.setText(S);
			f.setJl(l);
			f.repaint();

			while (kat.size() > 0) {
				kat.remove(0);
			}
			p.setKat(kat);
            
			for (int i = 0; i < r; i++) {
				jb[li.get(0)].setLenyomott(false);
				li.remove(0);
			}
			p.setJb(jb);

		}
		JOptionPane.showMessageDialog(new JFrame(),"Game over");

	}
}
