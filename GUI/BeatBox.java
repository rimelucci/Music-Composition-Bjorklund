//Import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Main class
public class BeatBox implements ActionListener{
    //Declare variables
    JFrame frame1;
    Container pane;
    JButton Submit;
    JLabel aKey, aScale, aTempo;
    JTextField txtTempo;
    JComboBox cKey, cScale;
    //Insets insets;
    
  
    public BeatBox(){
	JFrame frame1 = new JFrame ("BeatBox");
	frame1.setSize(400,300);
	JPanel pane = new JPanel();
	//	pane = frame1.getContentPane();
	//insets = pane.getInsets();
	//	pane.setLayout (null);
	
	//Create controls
	Submit = new JButton ("Submit");
	aKey = new JLabel ("Key:");
	aScale = new JLabel ("Scale:");
	aTempo = new JLabel ("Tempo:");
	txtTempo = new JTextField (10);
	
	String[]bKey = {"A","A#" ,"B","C","D","D#","E","F","F#","G","G#"};
        cKey = new JComboBox<String> (bKey);
	pane.add(cKey);
	
	String[]bScale = {"Major","Minor"};
        cScale = new JComboBox<String>(bScale);
	pane.add(cScale);

	JLabel saveAs = new JLabel("To save as MP3");

	JButton save = new JButton("Save");
	
	//Add all components to panel
	pane.add (aKey);// A = LABEL , C = COMBOBOX 
	pane.add(cKey);
	pane.add (aScale);
	pane.add(cScale);
	pane.add (aTempo);
	pane.add (txtTempo);
	pane.add (Submit);
	pane.add(saveAs);
	pane.add(save);
	
	//	pane.add(new JButton("W"),BorderLayout.NORTH);	
	//Set frame visible
	frame1.add(pane);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setVisible (true);
	
	//Button's action

	//cKey.addActionListener(this);
	//cScale.addActionListener(this);
	//save.addActionListener(this);
    	Submit.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
	if(e.getSource() == Submit){
	    System.out.print("Song in Key:");
	    System.out.println(cKey.getSelectedItem() + " " + cScale.getSelectedItem());
	    System.out.print("Song tempo:");
	    System.out.println(txtTempo.getText());
	}




	//if(e.getSource() == cScale){
	//   System.out.println(cScale.getSelectedItem());
	//}
	//else{
	    
	//    System.out.println("pie");
	//}



	
	//	if (e.getSource() == save){
	//    FileOutputStream song = new FileOutputStream("Song.mp3");
	//    ObjectOutputStream os = new ObjectOutputStream(song);
	//    os.writeObject( SONG OBJECT WE WILL MAKE);
	//    os.close();
	//}
	


    }

    
    

    //IF I HAD DIFFERENT TYPES THEN MAYBE
    //    public void actionPerformed(ActionEvent e){
    //	Object source = e.getSource();
    //	if (source instanceof JComboBox){
    //	    System.out.println("pizza");
    //	}
    //	else{
    //	    System.out.println("Pie");
    //	}
    //}
	
    public static void main (String args[]){
	//Set Look and Feel

	
	BeatBox gui = new BeatBox();
        
	}
    }
