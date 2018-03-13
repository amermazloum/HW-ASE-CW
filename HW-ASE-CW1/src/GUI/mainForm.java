package GUI;





import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class mainForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTable table_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm frame = new mainForm();
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
	public mainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		prepareHeader();
		prepareQueues();
		
		
		
		
	}

	
	private void prepareHeader() {
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel Header = new JPanel();
		
		Header.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnNewButton = new JButton("Start");
		Header.add(btnNewButton, "2, 2, center, center");
		
		JLabel lblSetTime = new JLabel("Set Time:");
		Header.add(lblSetTime, "4, 2, right, default");
		
		textField = new JTextField();
		textField.setText("500");
		Header.add(textField, "6, 2, left, default");
		textField.setColumns(10);
		
		contentPane.add(Header);
	}
	
    private void prepareQueues() {
		JPanel Queues = new JPanel();
		Queues.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default"),
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("15dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("15dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:default"),
				ColumnSpec.decode("left:default:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("2dlu:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:default"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:default"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:default:grow(2)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:default"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(64dlu;default):grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("max(69dlu;default):grow"),
				RowSpec.decode("max(0dlu;default):grow"),
				RowSpec.decode("max(41dlu;default)"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Queues:");
		Queues.add(lblNewLabel, "2, 2");
		
		JLabel lblFlyDubai = new JLabel("Fly Dubai");
		Queues.add(lblFlyDubai, "2, 4, left, top");
		
		JLabel lblMax = new JLabel("Max:");
		Queues.add(lblMax, "4, 4, right, default");
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		Queues.add(textField_1, "6, 4, left, default");
		textField_1.setColumns(10);
		
		
		
		JLabel lblEthad = new JLabel("Ethad");
		Queues.add(lblEthad, "10, 4");
		
		JLabel lblNewLabel_1 = new JLabel("Max:");
		Queues.add(lblNewLabel_1, "12, 4, right, default");
		
		textField_2 = new JTextField();
		textField_2.setText("7");
		Queues.add(textField_2, "15, 4, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblDam = new JLabel("Dam");
		Queues.add(lblDam, "19, 4");
		
		JLabel lblNewLabel_2 = new JLabel("Max:");
		Queues.add(lblNewLabel_2, "21, 4, right, default");
		
		textField_3 = new JTextField();
		textField_3.setText("3");
		Queues.add(textField_3, "22, 4, fill, default");
		textField_3.setColumns(10);	
		
		table=QueuesData();
		Queues.add(table, "2, 6, 6, 1, fill, fill");
		
		table_1=QueuesData();
		Queues.add(table_1, "10, 6, 7, 1, fill, fill");
		
		table_2= QueuesData();
		Queues.add(table_2, "19, 6, 4, 1, fill, fill");
		
		prepareDisk(Queues);
		
		
		
		contentPane.add(Queues);
		
		JLabel lblFlyDubaiSummary = new JLabel("Fly Dubai Summary");
		Queues.add(lblFlyDubaiSummary, "2, 12, 5, 1");
		
		JLabel lblEthadSummary = new JLabel("Ethad Summary");
		Queues.add(lblEthadSummary, "10, 12, 6, 1");
		
		JLabel lblDamSummary = new JLabel("Dam Summary");
		Queues.add(lblDamSummary, "19, 12, 4, 1");
		
		JTextPane textPane = new JTextPane();
		Queues.add(textPane, "2, 14, 5, 3, fill, fill");
		
		JTextPane textPane_1 = new JTextPane();
		Queues.add(textPane_1, "10, 14, 6, 3, fill, fill");
		
		JTextPane textPane_2 = new JTextPane();
		Queues.add(textPane_2, "19, 14, 4, 3, fill, fill");
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {},
			new RowSpec[] {}));
		
		JButton btnNewButton_1 = new JButton("GEN");
		contentPane.add(btnNewButton_1);
	}

	private void prepareDisk(JPanel Queues) {
		JLabel lblDisk = new JLabel("Disk 1");
		Queues.add(lblDisk, "2, 8, 3, 1");
		
		JLabel lblDisk_1 = new JLabel("Disk 2");
		Queues.add(lblDisk_1, "6, 8");
		
		JLabel lblDisk_2 = new JLabel("Disk 1");
		Queues.add(lblDisk_2, "10, 8, 3, 1, left, top");
		
		JLabel lblDisk_3 = new JLabel("Disk 2");
		Queues.add(lblDisk_3, "15, 8, left, top");
		
		JLabel lblDisk_4 = new JLabel("Disk 1");
		Queues.add(lblDisk_4, "19, 8");
		
		JLabel lblDisk_5 = new JLabel("Disk 2");
		Queues.add(lblDisk_5, "22, 8");
		
		JTextPane txtpnWerwerwerwerwerwre = new JTextPane();
		txtpnWerwerwerwerwerwre.setEditable(false);
		txtpnWerwerwerwerwerwre.setText("Amer Al Mazloum is dropping off\n1 bag of 35Kg. A baggage fee of \n$250 is due.");
		Queues.add(txtpnWerwerwerwerwerwre, "2, 10, 3, 1, fill, fill");
		
		JTextPane txtpnFizanRahmanIs = new JTextPane();
		txtpnFizanRahmanIs.setEnabled(false);
		txtpnFizanRahmanIs.setText("Fizan Rahman is dropping off\n1 bag of 12Kg. No baggage \nfee is due");
		txtpnFizanRahmanIs.setEditable(false);
		Queues.add(txtpnFizanRahmanIs, "6, 10, fill, fill");
		
		JTextPane textPane = new JTextPane();
		Queues.add(textPane, "10, 10, 4, 1, fill, fill");
		
		JTextPane textPane_1 = new JTextPane();
		Queues.add(textPane_1, "15, 10, fill, fill");
		
		JTextPane textPane_2 = new JTextPane();
		Queues.add(textPane_2, "19, 10, fill, fill");
		
		JTextPane textPane_3 = new JTextPane();
		Queues.add(textPane_3, "22, 10, fill, fill");
	}
	  
	private JTable QueuesData() {
	   String[] allPassangercolumnNames=new String[] {"First Name","Last Name","Sport","# of Years","Vegetarian"};
	   Object[][] allPassangerData=new Object[][] {{"Kathy", "Smith",
		     "Snowboarding", new Integer(5), new Boolean(false)}} ;
		    
		     allPassangerData = new Object[][] {
				    {"Kathy", "Smith",
				     "Snowboarding", new Integer(5), new Boolean(false)},
				    {"John", "Doe",
				     "Rowing", new Integer(3), new Boolean(true)},
				    {"Sue", "Black",
				     "Knitting", new Integer(2), new Boolean(false)},
				    {"Jane", "White",
				     "Speed reading", new Integer(20), new Boolean(true)},
				    {"Joe", "Brown",
				     "Pool", new Integer(10), new Boolean(false)}
				}; 
		     
		     JTable d= new JTable(allPassangerData,allPassangercolumnNames);
		     return  d;    
		     
		     
	}
	

}
