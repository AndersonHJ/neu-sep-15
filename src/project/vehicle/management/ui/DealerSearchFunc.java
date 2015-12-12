package project.vehicle.management.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class DealerSearchFunc {

	private JFrame frame;
	private JTextField make;
	private JTextField model;
	private JTextField trim;
	private JTextField year;
	private JTextField limitSuperior;
	private JTextField limitinferior;
//	private int topDistance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DealerSearchFunc window = new DealerSearchFunc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DealerSearchFunc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(DealerSearchFunc.class.getResource("/sun/print/resources/oneside.png")));
		frame.setTitle("Search");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel Category = new JLabel("Category");
		GridBagConstraints gbc_Category = new GridBagConstraints();
		gbc_Category.anchor = GridBagConstraints.WEST;
		gbc_Category.insets = new Insets(50, 50, 5, 5);
		gbc_Category.gridx = 0;
		gbc_Category.gridy = 0;
		frame.getContentPane().add(Category, gbc_Category);
		
		JCheckBox New = new JCheckBox("New");
		GridBagConstraints gbc_New = new GridBagConstraints();
		gbc_New.anchor = GridBagConstraints.WEST;
		gbc_New.insets = new Insets(50, 0, 5, 5);
		gbc_New.gridx = 1;
		gbc_New.gridy = 0;
		frame.getContentPane().add(New, gbc_New);
		
		JCheckBox chckbxUsed = new JCheckBox("Used");
		GridBagConstraints gbc_chckbxUsed = new GridBagConstraints();
		gbc_chckbxUsed.anchor = GridBagConstraints.WEST;
		gbc_chckbxUsed.insets = new Insets(50, 0, 5, 5);
		gbc_chckbxUsed.gridx = 3;
		gbc_chckbxUsed.gridy = 0;
		frame.getContentPane().add(chckbxUsed, gbc_chckbxUsed);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Certified");
		GridBagConstraints gbc_Certified = new GridBagConstraints();
		gbc_Certified.anchor = GridBagConstraints.EAST;
		gbc_Certified.insets = new Insets(50, 0, 5, 50);
		gbc_Certified.gridx = 4;
		gbc_Certified.gridy = 0;
		frame.getContentPane().add(chckbxNewCheckBox,gbc_Certified);
		
		JLabel lblMake = new JLabel("Make");
		GridBagConstraints gbc_lblMake = new GridBagConstraints();
		gbc_lblMake.anchor = GridBagConstraints.WEST;
		gbc_lblMake.insets = new Insets(0, 50, 5, 5);
		gbc_lblMake.gridx = 0;
		gbc_lblMake.gridy = 1;
		frame.getContentPane().add(lblMake, gbc_lblMake);
		
		make = new JTextField();
		GridBagConstraints gbc_make = new GridBagConstraints();
		gbc_make.fill = GridBagConstraints.HORIZONTAL;
		gbc_make.insets = new Insets(0, 0, 5, 5);
		gbc_make.gridx = 1;
		gbc_make.gridy = 1;
		frame.getContentPane().add(make, gbc_make);
		make.setColumns(10);
		
		JLabel lblModel = new JLabel("Model");
		GridBagConstraints gbc_lblModel = new GridBagConstraints();
		gbc_lblModel.anchor = GridBagConstraints.WEST;
		gbc_lblModel.insets = new Insets(0, 50, 5, 5);
		gbc_lblModel.gridx = 0;
		gbc_lblModel.gridy = 2;
		frame.getContentPane().add(lblModel, gbc_lblModel);
		
		model = new JTextField();
		GridBagConstraints gbc_model = new GridBagConstraints();
		gbc_model.insets = new Insets(0, 0, 5, 5);
		gbc_model.fill = GridBagConstraints.HORIZONTAL;
		gbc_model.gridx = 1;
		gbc_model.gridy = 2;
		frame.getContentPane().add(model, gbc_model);
		model.setColumns(10);
		
		JLabel lblTrim = new JLabel("Trim");
		GridBagConstraints gbc_lblTrim = new GridBagConstraints();
		gbc_lblTrim.anchor = GridBagConstraints.WEST;
		gbc_lblTrim.insets = new Insets(0, 50, 5, 5);
		gbc_lblTrim.gridx = 0;
		gbc_lblTrim.gridy = 3;
		frame.getContentPane().add(lblTrim, gbc_lblTrim);
		
		trim = new JTextField();
		GridBagConstraints gbc_trim = new GridBagConstraints();
		gbc_trim.insets = new Insets(0, 0, 5, 5);
		gbc_trim.fill = GridBagConstraints.HORIZONTAL;
		gbc_trim.gridx = 1;
		gbc_trim.gridy = 3;
		frame.getContentPane().add(trim, gbc_trim);
		trim.setColumns(10);
		
		JLabel lblYear = new JLabel("Year");
		GridBagConstraints gbc_lblYear = new GridBagConstraints();
		gbc_lblYear.anchor = GridBagConstraints.WEST;
		gbc_lblYear.insets = new Insets(0, 50, 5, 5);
		gbc_lblYear.gridx = 0;
		gbc_lblYear.gridy = 4;
		frame.getContentPane().add(lblYear, gbc_lblYear);
		
		year = new JTextField();
		GridBagConstraints gbc_year = new GridBagConstraints();
		gbc_year.insets = new Insets(0, 0, 5, 5);
		gbc_year.fill = GridBagConstraints.HORIZONTAL;
		gbc_year.gridx = 1;
		gbc_year.gridy = 4;
		frame.getContentPane().add(year, gbc_year);
		year.setColumns(10);
		
		JLabel lblPricerange = new JLabel("PriceRange");
		GridBagConstraints gbc_lblPricerange = new GridBagConstraints();
		gbc_lblPricerange.anchor = GridBagConstraints.EAST;
		gbc_lblPricerange.insets = new Insets(0, 50, 0, 20);
		gbc_lblPricerange.gridx = 0;
		gbc_lblPricerange.gridy = 5;
		frame.getContentPane().add(lblPricerange, gbc_lblPricerange);
		
		limitSuperior = new JTextField();
		GridBagConstraints gbc_limitSuperior = new GridBagConstraints();
		gbc_limitSuperior.insets = new Insets(0, 0, 0, 5);
		gbc_limitSuperior.fill = GridBagConstraints.HORIZONTAL;
		gbc_limitSuperior.gridx = 1;
		gbc_limitSuperior.gridy = 5;
		frame.getContentPane().add(limitSuperior, gbc_limitSuperior);
		limitSuperior.setColumns(10);
		
		JLabel to = new JLabel("~");
		GridBagConstraints gbc_to = new GridBagConstraints();
		gbc_to.insets = new Insets(0, 0, 0, 5);
		gbc_to.gridx = 2;
		gbc_to.gridy = 5;
		frame.getContentPane().add(to, gbc_to);
		
		limitinferior = new JTextField();
		GridBagConstraints gbc_limitinferior = new GridBagConstraints();
		gbc_limitinferior.fill = GridBagConstraints.HORIZONTAL;
		gbc_limitinferior.gridx = 3;
		gbc_limitinferior.gridy = 5;
		frame.getContentPane().add(limitinferior, gbc_limitinferior);
		limitinferior.setColumns(10);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Category, New, chckbxUsed, chckbxNewCheckBox, lblMake, lblModel, lblTrim, lblYear, lblPricerange}));
	}

}
