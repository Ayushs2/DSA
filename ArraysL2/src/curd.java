import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
public class curd {
    private JFrame frame;
    private JTextField txtbname;
    private JTextField txted;
    private JTextField txtprice;
    private JTable table;
    private JTextField txtbid;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    curd window = new curd();
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
    public curd() {
        initialize();
        connect();
        table_load();


    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");
        }
        catch(ClassNotFoundException e) {

        }
        catch(SQLException e){

        }
    }
    public void table_load()
    {
        try
        {
            pst = con.prepareStatement("select * from book");
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 892, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("BOOK SHOP");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel.setBounds(204, 11, 496, 108);
        frame.getContentPane().add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(30, 130, 420, 307);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Book Name");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setBounds(40, 31, 120, 30);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Edition");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1_1.setBounds(40, 83, 74, 30);
        panel.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Price");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1_2.setBounds(40, 138, 74, 30);
        panel.add(lblNewLabel_1_2);

        txtbname = new JTextField();
        txtbname.setBounds(208, 33, 206, 30);
        panel.add(txtbname);
        txtbname.setColumns(10);

        txted = new JTextField();
        txted.setColumns(10);
        txted.setBounds(208, 85, 206, 30);
        panel.add(txted);

        txtprice = new JTextField();
        txtprice.setColumns(10);
        txtprice.setBounds(208, 140, 206, 30);
        panel.add(txtprice);

        JButton savebtn = new JButton("Save");
        savebtn.setBounds(139, 259, 89, 41);
        panel.add(savebtn);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setBounds(238, 259, 89, 41);
        panel.add(btnExit);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(337, 259, 89, 41);
        panel.add(btnClear);
        btnClear.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           txtbname.setText("");
                                           txted.setText("");
                                           txtprice.setText("");
                                           txtbname.requestFocus();
                                       }
        });

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(486, 132, 359, 287);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBounds(30, 448, 420, 84);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("book Id");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2.setBounds(43, 30, 112, 38);
        panel_1.add(lblNewLabel_2);

        txtbid = new JTextField();
        txtbid.setBounds(138, 33, 216, 27);
        panel_1.add(txtbid);
        txtbid.setColumns(10);
        txtbid.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {


                try {

                    String id = txtbid.getText();

                    pst = con.prepareStatement("select name,edition,price from book where id = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if(rs.next()==true)
                    {

                        String name = rs.getString(1);
                        String edition = rs.getString(2);
                        String price = rs.getString(3);

                        txtbname.setText(name);
                        txted.setText(edition);
                        txtprice.setText(price);


                    }
                    else
                    {
                        txtbname.setText("");
                        txted.setText("");
                        txtprice.setText("");

                    }



                }
                catch (SQLException ex) {

                }



            }
        });

        JButton updatebtn = new JButton("Update");
        updatebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bname,edition,price, bid;
                bname = txtbname.getText();
                edition = txted.getText();
                price = txtprice.getText();
                bid = txtbid.getText();

                try {
                    pst = con.prepareStatement("update book set name=?,edition=?,price=? where id =?");
                    pst.setString(1,bname);
                    pst.setString(2, edition);
                    pst.setString(3,price);
                    pst.setString(4,bid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record updated!!");
                    table_load();
                    txtbname.setText("");
                    txted.setText("");
                    txtprice.setText("");
                    txtbname.requestFocus();
                }
                catch(SQLException el) {
                    el.printStackTrace();
                }

            }

        });
        updatebtn.setBounds(542, 470, 89, 44);
        frame.getContentPane().add(updatebtn);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(654, 472, 89, 41);
        frame.getContentPane().add(btnDelete);
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String  bid;

                bid = txtbid.getText();

                try {
                    pst = con.prepareStatement("delete from book where id =?");
                    pst.setString(1,bid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Deleted!!");
                    table_load();
                    txtbname.setText("");
                    txted.setText("");
                    txtprice.setText("");
                    txtbname.requestFocus();
                }
                catch(SQLException el) {
                    el.printStackTrace();
                }

            }
        });
        savebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bname,edition,price;
                bname = txtbname.getText();
                edition = txted.getText();
                price = txtprice.getText();

                try {
                    pst = con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
                    pst.setString(1,bname);
                    pst.setString(2, edition);
                    pst.setString(3,price);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Added!!");
                    table_load();
                    txtbname.setText("");
                    txted.setText("");
                    txtprice.setText("");
                    txtbname.requestFocus();
                }
                catch(SQLException el) {
                    el.printStackTrace();
                }

            }


//            private JTextField setText(String s) {
//                s="";
//                return null;
//            }
        });
    }
}
