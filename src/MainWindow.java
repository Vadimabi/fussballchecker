package Klassen;

import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * View-Klasse (MainWindow)
 */
public class MainWindow extends JFrame
{
    private JPanel contentPane;
    private JTextField textField;
    private JButton btnErmitteln;

    private AppManager manager;

    /**
     * H A U P T M E T H O D E
     * (damit deine IDE MainWindow starten kann)
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            new AppManager();
        });
    }

    /**
     * Konstruktor der View
     */
    public MainWindow(AppManager manager)
    {
        this.manager = manager;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 512, 575);

        contentPane = new JPanel();
        contentPane.setForeground(Color.RED);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(18, 10, 240, 240);
        lblNewLabel.setIcon(new ImageIcon(
                MainWindow.class.getResource(
                        "/Klassen/Gemini_Generated_Image_b4w9d0b4w9d0b4w9.png")));
        contentPane.add(lblNewLabel);

        JLabel lblTitel = new JLabel("Ermittle den Fussballspieler");
        lblTitel.setForeground(Color.RED);
        lblTitel.setBounds(268, 119, 218, 32);
        lblTitel.setFont(new Font("72 Black", Font.PLAIN, 14));
        lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitel);

        JLabel lblNachname = new JLabel("Nachname des Fussballspielers:");
        lblNachname.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNachname.setBounds(18, 358, 194, 49);
        contentPane.add(lblNachname);

        textField = new JTextField();
        textField.setBounds(232, 373, 241, 21);
        contentPane.add(textField);

        btnErmitteln = new JButton("Ermitteln");
        btnErmitteln.setBounds(200, 477, 90, 23);
        btnErmitteln.setForeground(Color.RED);
        btnErmitteln.addActionListener(e -> manager.ermittleSpieler());
        contentPane.add(btnErmitteln);
    }

    /* ===== Methoden für den Controller ===== */

    public String getNachname()
    {
        return textField.getText();
    }

    public void zeigeSpieler(Topspieler spieler)
    {
        JOptionPane.showMessageDialog(this,
                "Spieler gefunden:\n" +
                spieler.getTopspielerVorname() + " " +
                spieler.getTopspielerNachname() + "\n" +
                "Alter: " + spieler.getTopspielerAlter() + "\n" +
                "Position: " + spieler.getTopspielerPosition());
    }

    public void zeigeFehlermeldung(String text)
    {
        JOptionPane.showMessageDialog(this, text,
                "Fehler", JOptionPane.ERROR_MESSAGE);
    }
}


