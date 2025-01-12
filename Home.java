package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener { 
    
    public Home() { 
        setLayout(null);
        
        JPanel topBar = new JPanel();
        topBar.setLayout(null);
        topBar.setBackground(new Color(198, 12, 48)); 
        topBar.setBounds(0, 0, 1600, 40); 
        
        JLabel siteName = new JLabel("https://www.singhairlines.com");
        siteName.setBounds(20, 5, 600, 30); 
        siteName.setForeground(Color.WHITE);
        siteName.setFont(new Font("Tahoma", Font.BOLD, 26));
        topBar.add(siteName);
        
        add(topBar);
        
        // Add background image
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/ICONS/air1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/ICONS/wing.png"));
        JLabel imag = new JLabel(i2);
        imag.setBounds(0, 0, 350, 250);
        image.add(imag);
        
        
        // Add heading
        JLabel heading = new JLabel("️ SINGH  AIRLINES ️");
        heading.setBounds(460, 80, 1000, 50);
        heading.setForeground(new Color(198, 12, 48));
        heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC | Font.ROMAN_BASELINE | Font.TRUETYPE_FONT, 56));
        image.add(heading);
        
        JLabel subheading = new JLabel("WELCOMES YOU");
        subheading.setBounds(580, 150, 1000, 40);
        subheading.setForeground(new Color(198, 12, 48));
        subheading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
        image.add(subheading);
        
        // Create buttons for each option
        JButton flightDetails = new JButton("Flight Details");
        flightDetails.setBounds(300, 240, 200, 50);
        flightDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
        flightDetails.setForeground(new Color(198, 12, 48));   
        flightDetails.addActionListener(this);
        image.add(flightDetails);
        
        JButton customerDetails = new JButton("Add Customer");
        customerDetails.setBounds(600, 240, 200, 50);
        customerDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
        customerDetails.setForeground(new Color(198, 12, 48));
        customerDetails.addActionListener(this);
        image.add(customerDetails);
        
        JButton bookFlight = new JButton("Book Flight");
        bookFlight.setBounds(900, 240, 200, 50);
        bookFlight.setFont(new Font("Tahoma", Font.BOLD, 16));
        bookFlight.setForeground(new Color(198, 12, 48));   
        bookFlight.addActionListener(this);
        image.add(bookFlight);
        
        JButton journeyDetails = new JButton("Journey Details");
        journeyDetails.setBounds(300, 350, 200, 50);
        journeyDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
        journeyDetails.setForeground(new Color(198, 12, 48));   
        journeyDetails.addActionListener(this);
        image.add(journeyDetails);
        
        JButton ticketCancellation = new JButton("Cancel Ticket");
        ticketCancellation.setBounds(600, 350, 200, 50);
        ticketCancellation.setFont(new Font("Tahoma", Font.BOLD, 16));
        ticketCancellation.setForeground(new Color(198, 12, 48));   
        ticketCancellation.addActionListener(this);
        image.add(ticketCancellation);
        
        JButton boardingPass = new JButton("Boarding Pass");
        boardingPass.setBounds(900, 350, 200, 50);
        boardingPass.setFont(new Font("Tahoma", Font.BOLD, 16));
        boardingPass.setForeground(new Color(198, 12, 48));   
        boardingPass.addActionListener(this);
        image.add(boardingPass);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Open in Full Screen
        setVisible(true); // Show Frame
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        // Check which button was clicked and open the respective window
        if(text.equals("Add Customer")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        }
    }
    
    public static void main(String[] args) {
        new Home(); 
    }
}
