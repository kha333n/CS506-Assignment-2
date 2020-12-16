/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebDesignAssignment;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kha33
 */
public class GUI extends javax.swing.JFrame {
    
    private ArrayList<Product> products = new ArrayList<>();
    DBHelper dbHelper = new DBHelper();
    int totalItemsCounter = 0;
    float subTotal = 0, shipping = 0, grandTotal = 0;

    //static numbers for calculateTotal() action determining..
    private static final int ADD_ITEM = 1;
    private static final int SUBTRACT_ITEM = 2;

    //calculate subtotal, shipping, and grandTotal when an item is added or removed from cart...
    private void calculateTotal(float itemPrice, int actionPerformed){
        switch (actionPerformed){
            case 1:
                totalItemsCounter++;
                subTotal = subTotal + itemPrice;
                if (totalItemsCounter == 0){
                    shipping = 0;
                }else if (totalItemsCounter < 6){
                    shipping = 50;
                }else if (totalItemsCounter < 11){
                    shipping = 100;
                }else if (totalItemsCounter < 16){
                    shipping = 150;
                }else if (totalItemsCounter < 21){
                    shipping = 200;
                }else if (totalItemsCounter < 26){
                    shipping = 250;
                }else if (totalItemsCounter < 31){
                    shipping = 300;
                }else if (totalItemsCounter < 36){
                    shipping = 350;
                }else {
                    shipping = 400;
                }
                grandTotal = subTotal + shipping;
                totalItemsLable.setText(""+totalItemsCounter);
                subTotalLable.setText(""+subTotal);
                shippingLable.setText(""+shipping);
                grandTotalLable.setText(""+grandTotal);
                break;
            case 2:
                totalItemsCounter--;
                subTotal = subTotal - itemPrice;
                if(totalItemsCounter == 0){shipping = 0;}else if (totalItemsCounter < 6){
                    shipping = 50;
                }else if (totalItemsCounter < 11){
                    shipping = 100;
                }else if (totalItemsCounter < 16){
                    shipping = 150;
                }else if (totalItemsCounter < 21){
                    shipping = 200;
                }else if (totalItemsCounter < 26){
                    shipping = 250;
                }else if (totalItemsCounter < 31){
                    shipping = 300;
                }else if (totalItemsCounter < 36){
                    shipping = 350;
                }else {
                    shipping = 400;
                }
                grandTotal = subTotal + shipping;
                totalItemsLable.setText(""+totalItemsCounter);
                subTotalLable.setText(""+subTotal);
                shippingLable.setText(""+shipping);
                grandTotalLable.setText(""+grandTotal);
                break;
        }
    }

    //Used to restore state of the program from where user lefts last time...
    private void restoreState(){
        Product p = products.get(0);
        if(p.getInCart() > 0) {

            handoutsInCartLable.setText("" + p.getInCart());
            handoutsTotalPrice.setText("" + p.getInCart() * p.getPrice());
            for (int i = 1; i <= p.getInCart(); i++) {
                calculateTotal(p.getPrice(), ADD_ITEM);
            }
        }
        p = products.get(1);
        if(p.getInCart() > 0) {

            refBookInCartLable.setText("" + p.getInCart());
            refBookTotalPrice.setText("" + p.getInCart() * p.getPrice());
            for (int i = 1; i <= p.getInCart(); i++) {
                calculateTotal(p.getPrice(), ADD_ITEM);
            }
        }
        p = products.get(2);
        if(p.getInCart() > 0) {

            DVDInCartLable.setText("" + p.getInCart());
            DVDTotalPrice.setText("" + p.getInCart() * p.getPrice());
            for (int i = 1; i <= p.getInCart(); i++) {
                calculateTotal(p.getPrice(), ADD_ITEM);
            }
        }
        p = products.get(3);
        if(p.getInCart() > 0) {

            USBInCartLable.setText("" + p.getInCart());
            USBTotalPrice.setText("" + p.getInCart() * p.getPrice());
            for (int i = 1; i <= p.getInCart(); i++) {
                calculateTotal(p.getPrice(), ADD_ITEM);
            }
        }
    }

	private void developerInfo(){
		dbHelper.saveProducts(products);
		JOptionPane.showMessageDialog(jPanel1,
				"Usman Khan (BC190201004)",
				"Developed By",
				JOptionPane.INFORMATION_MESSAGE);

	}


    /**
     * Creates new form GUI
     */
    public GUI() {

        //If database connectivity successful then open program else close with message...
        if(dbHelper.loadProducts(products))
        {
            initComponents();
        }else
        {
            JOptionPane.showMessageDialog(null,"Database Connectivity Failed\nExiting from application)",
                    "Database Issue",JOptionPane.WARNING_MESSAGE);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Headding = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        placeOrderButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        totalItemsLable = new javax.swing.JLabel();
        subTotalLable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        shippingLable = new javax.swing.JLabel();
        grandTotalLable = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        handoutsMinusButton = new javax.swing.JButton();
        USBMinusButton = new javax.swing.JButton();
        DVDMinusButton = new javax.swing.JButton();
        refBookMinusButton = new javax.swing.JButton();
        handoutsPlusButton = new javax.swing.JButton();
        refBookPlusButton = new javax.swing.JButton();
        DVDPlusButton = new javax.swing.JButton();
        USBPlusButton = new javax.swing.JButton();
        handoutsInCartLable = new javax.swing.JLabel();
        refBookInCartLable = new javax.swing.JLabel();
        DVDInCartLable = new javax.swing.JLabel();
        USBInCartLable = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        handoutsTotalPrice = new javax.swing.JLabel();
        refBookTotalPrice = new javax.swing.JLabel();
        DVDTotalPrice = new javax.swing.JLabel();
        USBTotalPrice = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        jButton6.setText("jButton1");

        jButton2.setText("jButton1");

        jButton7.setText("jButton1");

        jButton11.setText("jButton1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Headding.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Headding.setText("BookShop Cart");
        Headding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeaddingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeaddingMouseExited(evt);
            }
        });

        placeOrderButton.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Items:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Sub Total:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Shipping:");

        totalItemsLable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        totalItemsLable.setText("0");

        subTotalLable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        subTotalLable.setText("0");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Grand Total:");

        shippingLable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        shippingLable.setText("0");

        grandTotalLable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        grandTotalLable.setText("0");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Rs.");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Rs.");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Rs.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalItemsLable)
                    .addComponent(subTotalLable)
                    .addComponent(shippingLable)
                    .addComponent(grandTotalLable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(totalItemsLable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subTotalLable)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(shippingLable)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(grandTotalLable)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("01. Handouts               Rs. 500");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("02. Reference Book    Rs. 500");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("04. USB                      Rs. 2500");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("03. DVD                      Rs. 500");

        handoutsMinusButton.setText("-");
        handoutsMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handoutsMinusButtonActionPerformed(evt);
            }
        });

        USBMinusButton.setText("-");
        USBMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USBMinusButtonActionPerformed(evt);
            }
        });

        DVDMinusButton.setText("-");
        DVDMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DVDMinusButtonActionPerformed(evt);
            }
        });

        refBookMinusButton.setText("-");
        refBookMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refBookMinusButtonActionPerformed(evt);
            }
        });

        handoutsPlusButton.setText("+");
        handoutsPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handoutsPlusButtonActionPerformed(evt);
            }
        });

        refBookPlusButton.setText("+");
        refBookPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refBookPlusButtonActionPerformed(evt);
            }
        });

        DVDPlusButton.setText("+");
        DVDPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DVDPlusButtonActionPerformed(evt);
            }
        });

        USBPlusButton.setText("+");
        USBPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USBPlusButtonActionPerformed(evt);
            }
        });

        handoutsInCartLable.setText("0");

        refBookInCartLable.setText("0");

        DVDInCartLable.setText("0");

        USBInCartLable.setText("0");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("RS. ");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("RS. ");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("RS. ");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("RS. ");

        handoutsTotalPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        handoutsTotalPrice.setText("0.0");

        refBookTotalPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        refBookTotalPrice.setText("0.0");

        DVDTotalPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DVDTotalPrice.setText("0.0");

        USBTotalPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        USBTotalPrice.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(handoutsMinusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(handoutsInCartLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DVDMinusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DVDInCartLable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(USBMinusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(USBInCartLable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(refBookMinusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refBookInCartLable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(USBPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DVDPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(handoutsPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refBookPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(handoutsTotalPrice))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(refBookTotalPrice))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(DVDTotalPrice))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(USBTotalPrice)))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(handoutsMinusButton)
                    .addComponent(handoutsPlusButton)
                    .addComponent(handoutsInCartLable)
                    .addComponent(jLabel16)
                    .addComponent(handoutsTotalPrice))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refBookMinusButton)
                    .addComponent(refBookPlusButton)
                    .addComponent(refBookInCartLable)
                    .addComponent(jLabel17)
                    .addComponent(refBookTotalPrice))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(USBMinusButton)
                                .addComponent(USBPlusButton)
                                .addComponent(USBInCartLable)
                                .addComponent(jLabel19)
                                .addComponent(USBTotalPrice))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DVDMinusButton)
                        .addComponent(DVDPlusButton)
                        .addComponent(DVDInCartLable)
                        .addComponent(jLabel18)
                        .addComponent(DVDTotalPrice)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 78, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(Headding)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Headding)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(placeOrderButton)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        int ci1, ci2, ci3, ci4;
        ci1 = products.get(0).getInCart();
        ci2 = products.get(1).getInCart();
        ci3 = products.get(2).getInCart();
        ci4 = products.get(3).getInCart();
        if(ci1 > 0 || ci2 > 0 || ci3 > 0 || ci4 > 0){
            if (
                    dbHelper.addOrder(products.get(0).getInCart(),products.get(1).getInCart(),products.get(2).getInCart(),
                            products.get(3).getInCart(),totalItemsCounter,subTotal,shipping,grandTotal)
            )
            {
                for (Product p:products
                ) {
                    p.setQuantity(p.getQuantity() - p.getInCart());
                    p.setInCart(0);
                }
                handoutsTotalPrice.setText("0.0");
                refBookTotalPrice.setText("0.0");
                DVDTotalPrice.setText("0.0");
                USBTotalPrice.setText("0.0");
                handoutsInCartLable.setText("0");
                refBookInCartLable.setText("0");
                DVDInCartLable.setText("0");
                USBInCartLable.setText("0");
                totalItemsCounter = 0;
                subTotal = 0;
                shipping = 0;
                grandTotal = 0;
                totalItemsLable.setText("0");
                subTotalLable.setText("0.0");
                shippingLable.setText("0.0");
                grandTotalLable.setText("0.0");

                JOptionPane.showMessageDialog(jPanel1,"Order Placed Successful",
                        "Order Placed",JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(jPanel1,
                        "Placing order failed",
                        "Database Connectivity Issue",JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(jPanel1,"Add some items in cart first.",
                    "Cart is empty",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        developerInfo();
    }//GEN-LAST:event_formWindowClosing

    private void refBookMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refBookMinusButtonActionPerformed
        Product p = products.get(1);
        if (p.getInCart() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"Noting in Cart",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() - 1);
            p.setQuantity(p.getQuantity() + 1);
            refBookInCartLable.setText(""+p.getInCart());
            refBookTotalPrice.setText(""+ p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(),GUI.SUBTRACT_ITEM);
        }
    }//GEN-LAST:event_refBookMinusButtonActionPerformed

    private void handoutsMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handoutsMinusButtonActionPerformed
        Product p = products.get(0);
        if (p.getInCart() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"Noting in Cart",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() - 1);
            p.setQuantity(p.getQuantity() + 1);
            handoutsInCartLable.setText("" + p.getInCart());
            handoutsTotalPrice.setText("" + p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(), GUI.SUBTRACT_ITEM);
        }
    }//GEN-LAST:event_handoutsMinusButtonActionPerformed

    private void handoutsPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handoutsPlusButtonActionPerformed
        Product p = products.get(0);
        if (p.getQuantity() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"No more items in inventory",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() + 1);
            p.setQuantity(p.getQuantity() - 1);
            handoutsInCartLable.setText(""+p.getInCart());
            handoutsTotalPrice.setText(""+p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(),GUI.ADD_ITEM);
        }
    }//GEN-LAST:event_handoutsPlusButtonActionPerformed

    private void refBookPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refBookPlusButtonActionPerformed
        Product p = products.get(1);
        if (p.getQuantity() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"No more items in inventory",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() + 1);
            p.setQuantity(p.getQuantity() - 1);
            refBookInCartLable.setText(""+p.getInCart());
            refBookTotalPrice.setText(""+p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(),GUI.ADD_ITEM);
        }
    }//GEN-LAST:event_refBookPlusButtonActionPerformed

    private void DVDMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DVDMinusButtonActionPerformed
        Product p = products.get(2);
        if (p.getInCart() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"Noting in Cart",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() - 1);
            p.setQuantity(p.getQuantity() + 1);
            DVDInCartLable.setText("" + p.getInCart());
            DVDTotalPrice.setText("" + p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(), GUI.SUBTRACT_ITEM);
        }
    }//GEN-LAST:event_DVDMinusButtonActionPerformed

    private void DVDPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DVDPlusButtonActionPerformed
        Product p = products.get(2);
        if (p.getQuantity() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"No more items in inventory",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() + 1);
            p.setQuantity(p.getQuantity() - 1);
            DVDInCartLable.setText(""+p.getInCart());
            DVDTotalPrice.setText(""+p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(),GUI.ADD_ITEM);
        }
    }//GEN-LAST:event_DVDPlusButtonActionPerformed

    private void USBMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USBMinusButtonActionPerformed
        Product p = products.get(3);
        if (p.getInCart() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"Noting in Cart",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() - 1);
            p.setQuantity(p.getQuantity() + 1);
            USBInCartLable.setText("" + p.getInCart());
            USBTotalPrice.setText("" + p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(), GUI.SUBTRACT_ITEM);
        }
    }//GEN-LAST:event_USBMinusButtonActionPerformed

    private void USBPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USBPlusButtonActionPerformed
        Product p = products.get(3);
        if (p.getQuantity() < 1) {
            JOptionPane.showMessageDialog(jPanel1,"No more items in inventory",
                    "Nothing found",JOptionPane.WARNING_MESSAGE);
        }else {
            p.setInCart(p.getInCart() + 1);
            p.setQuantity(p.getQuantity() - 1);
            USBInCartLable.setText(""+p.getInCart());
            USBTotalPrice.setText(""+p.getInCart() * p.getPrice());
            calculateTotal(p.getPrice(),GUI.ADD_ITEM);
        }
    }//GEN-LAST:event_USBPlusButtonActionPerformed

    private void HeaddingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaddingMouseEntered
            Headding.setText("Usman Khan (BC190201004)");
    }//GEN-LAST:event_HeaddingMouseEntered

    private void HeaddingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaddingMouseExited
        Headding.setText("BookShop Cart");
    }//GEN-LAST:event_HeaddingMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        restoreState();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DVDInCartLable;
    private javax.swing.JButton DVDMinusButton;
    private javax.swing.JButton DVDPlusButton;
    private javax.swing.JLabel DVDTotalPrice;
    private javax.swing.JLabel Headding;
    private javax.swing.JLabel USBInCartLable;
    private javax.swing.JButton USBMinusButton;
    private javax.swing.JButton USBPlusButton;
    private javax.swing.JLabel USBTotalPrice;
    private javax.swing.JLabel grandTotalLable;
    private javax.swing.JLabel handoutsInCartLable;
    private javax.swing.JButton handoutsMinusButton;
    private javax.swing.JButton handoutsPlusButton;
    private javax.swing.JLabel handoutsTotalPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel refBookInCartLable;
    private javax.swing.JButton refBookMinusButton;
    private javax.swing.JButton refBookPlusButton;
    private javax.swing.JLabel refBookTotalPrice;
    private javax.swing.JLabel shippingLable;
    private javax.swing.JLabel subTotalLable;
    private javax.swing.JLabel totalItemsLable;
    // End of variables declaration//GEN-END:variables
}
