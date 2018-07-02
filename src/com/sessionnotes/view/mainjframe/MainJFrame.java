package com.sessionnotes.view.mainjframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;

/**
 * 
 * <h1>MainJFrame.java</h1>
 * 
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-24-2018
 *
 */
public class MainJFrame extends JFrame {

	JMenuItem jMenuItmCreateClient;
	JMenuItem jMenuItmCreateSession;
	JMenuItem jMenuItmExit;
	JDesktopPane jDesktopPane;
	MainJFrameController mainJFrameController;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					MainJFrame frame = new MainJFrame();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setTitle("Session Notes Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 986, 21);
		desktopPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewSession = new JMenuItem("Create New Session");
		mntmNewSession.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewSession);
		
		JMenuItem mntmCreateNewClient = new JMenuItem("Create New Client");
		mntmCreateNewClient.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmCreateNewClient);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmExit);
		
		
		jMenuItmCreateClient = mntmCreateNewClient;
		jMenuItmCreateSession = mntmNewSession;
		jMenuItmExit = mntmExit;
		jDesktopPane = desktopPane;
		mainJFrameController = new MainJFrameController(this);
//		this.pack();
		this.setSize(1000, 700);
		this.setVisible(true);
		
	}

	/**
	 * @return the jMenuItmCreateClient
	 */
	public JMenuItem getjMenuItmCreateClient() {
		return jMenuItmCreateClient;
	}

	/**
	 * @return the jMenuItmCreateSession
	 */
	public JMenuItem getjMenuItmCreateSession() {
		return jMenuItmCreateSession;
	}

	/**
	 * @return the jMenuItmExit
	 */
	public JMenuItem getjMenuItmExit() {
		return jMenuItmExit;
	}

	/**
	 * @return the jDesktopPane
	 */
	public JDesktopPane getjDesktopPane() {
		return jDesktopPane;
	}
	
	
}
