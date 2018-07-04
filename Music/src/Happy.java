import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.audio.*;

import javax.swing.JButton;

import javazoom.jl.player.Player;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
public class Happy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Happy frame = new Happy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Happy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNnn = new JButton("nnn");
		btnNnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//music();
				try
				{
					FileInputStream obj=new FileInputStream("song.mp3");
					Player play=new Player(obj);
					play.play();
					
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
				
			}
		});
		btnNnn.setBounds(159, 106, 89, 23);
		contentPane.add(btnNnn);
	}
	public  void music()
	{
		AudioPlayer MGP= AudioPlayer.player;
		AudioStream BGM;
		AudioData md;
		ContinuousAudioDataStream loop=null;
		try{
		BGM =new AudioStream(new FileInputStream("bird.wav"));
		md=BGM.getData();
		loop=new ContinuousAudioDataStream(md);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex);
		}
		MGP.start(loop);
		
	}
}
