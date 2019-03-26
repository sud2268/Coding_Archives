package GameDevlopment;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame implements ActionListener {

	public static int BOARD_SIZE=3;
	
	public static enum GameStatus{
		Incomplete ,Xwins,Zwins,Tie
	}
	
	private JButton[][] buttons=new JButton[BOARD_SIZE][BOARD_SIZE];
	boolean crossturn =true;
	
	
	public TicTacToe() {
		super.setTitle("TicTacToe");
		super.setSize(800, 800);
		GridLayout grid=new GridLayout(BOARD_SIZE, BOARD_SIZE);
		super.setLayout(grid);
		Font font=new Font("Comic sans ", 1, 150);
		for (int row = 0; row < buttons.length; row++) {
			for (int col = 0; col < buttons.length; col++) {
				JButton button=new JButton("");
				buttons	[row][col]=button;
				button.setFont(font);
				button.addActionListener(this);
				super.add(button);
			}
			
		}
		super.setResizable(false);
		super.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JButton clickedButton = (JButton)e.getSource();
		 makeMove(clickedButton);
		 
	}
	
	private void makeMove(JButton clickedButton) {
		String btntxt=clickedButton.getText();
		if(btntxt.length()>0) {
			JOptionPane.showMessageDialog(this,"INVALID MOVE");
			return;
		}else {
			if(crossturn) {
				clickedButton.setText("X");
			}else {
				clickedButton.setText("0");
			}
			crossturn=!crossturn;
		}
	}
	
}
