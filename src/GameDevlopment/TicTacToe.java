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

	//enum to store the status of the game 
	public static enum GameStatus{
		Incomplete ,Xwins,Zwins,Tie
	}

	private JButton[][] buttons=new JButton[BOARD_SIZE][BOARD_SIZE];
	boolean crossturn =true;// to store whose turn it is


	public TicTacToe() {
		super.setTitle("TicTacToe");// title of Application
		super.setSize(800, 800);
		GridLayout grid=new GridLayout(BOARD_SIZE, BOARD_SIZE);
		super.setLayout(grid);
		Font font=new Font("Comic sans ", 1, 150);//Font of the components
		for (int row = 0; row < buttons.length; row++) {
			for (int col = 0; col < buttons.length; col++) {
				JButton button=new JButton("");//object of button class
				buttons	[row][col]=button;
				button.setFont(font);
				button.addActionListener(this);//
				super.add(button);
			}

		}
		super.setResizable(false);//to stop window from resizing
		super.setVisible(true); 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton = (JButton)e.getSource();//to get the source of button
		makeMove(clickedButton);//Function to make a move
		GameStatus gs=this.getGameStatus();//Get Game status of current object
		if(gs==GameStatus.Incomplete) {
			return;
		}
		
		declareWinner(gs);
		int choice=JOptionPane.showConfirmDialog(this, "Do you want to play again");
		if(choice==JOptionPane.YES_OPTION) {
			for (int row = 0; row < buttons.length; row++) {
				for (int col = 0; col < buttons.length; col++) {
					buttons[row][col].setText("");
				}

			}
		}
		

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
	
	
	private GameStatus getGameStatus() {
		String text1="",text2="";
		int row=0,col=0;

		row=0;
		while(row<BOARD_SIZE) {
			col=0;
			while(col<BOARD_SIZE-1) {
				text1=buttons[row][col].getText();
				text2=buttons[row][col+1].getText();

				if(!text1.equals(text2)||text1.length()==0) {
					break;
				}
				col++;
			}
			if(col==BOARD_SIZE-1) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Zwins;
				}

			}
			row++;
		}

		//For columns checking

		col=0;
		while(col<BOARD_SIZE) {
			row=0;
			while(row<BOARD_SIZE-1) {
				text1=buttons[row][col].getText();
				text2=buttons[row+1][col].getText();

				if(!text1.equals(text2)||text1.length()==0) {
					break;
				}
				row++;
			}
			if(row==BOARD_SIZE-1) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Zwins;
				}
			}
			col++;
		}

		//For diagonl1
		row=0;
		col=0;
		while(row<BOARD_SIZE-1) {
			text1=buttons[row][col].getText();
			text2=buttons[row+1][col+1].getText();
			if(!text1.equals(text2)||text1.length()==0) {
				break;
			}
			row++;
			col++;		

			if(row==BOARD_SIZE-1 && col==BOARD_SIZE-1) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Zwins;
				}
			}
		}
		
		//for diagonal2
		row=BOARD_SIZE-1;
		col=0;
		while(row>0) {
			text1=buttons[row][col].getText();
			text2=buttons[row-1][col+1].getText();
			if(!text1.equals(text2)||text1.length()==0) {
				break;
			}
			row--;
			col++;		

			if(row==0) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Zwins;
				}
			}	
		}
		String txt="";
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				txt=buttons[row][col].getText();
				if(txt.length()==0) {
					return GameStatus.Incomplete;
				}
			}
		}
		return GameStatus.Tie;
	}
	
	private void declareWinner(GameStatus gs) {
		if(gs==GameStatus.Xwins) {
			JOptionPane.showMessageDialog(this,"X WINS");
		}else if(gs==GameStatus.Zwins) {
			JOptionPane.showMessageDialog(this,"Z WINS");
		}else {
			JOptionPane.showMessageDialog(this,"IT IS A TIE");
		}
	}
}
