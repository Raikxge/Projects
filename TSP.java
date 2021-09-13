import java.io.FileInputStream;
import java.util.Scanner;
import java.util.*;

public class TSP extends javax.swing.JFrame {

        /**
         * Creates new form GUI
         */
        public TSP() {
                initComponents();
        }

        private void initComponents() {

                BackgroundCanvasA1 = new javax.swing.JPanel();
                StudentNoA1 = new javax.swing.JPanel();
                TopPanelA1 = new javax.swing.JPanel();
                RedA1 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                OrangeA1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                ENTER = new javax.swing.JButton();
                PurpleA1 = new javax.swing.JPanel();
                DeliveryA1 = new javax.swing.JLabel();
                CyanA1 = new javax.swing.JPanel();
                GreenA1 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("CS211 project");
                setAutoRequestFocus(false);
                setBackground(java.awt.Color.white);
                setFont(new java.awt.Font("Calibri", 0, 10));
                setLocationByPlatform(true);
                setResizable(false);
                setSize(new java.awt.Dimension(1500, 1000));
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowActivated(java.awt.event.WindowEvent evt) {
                                formWindowActivated(evt);
                        }

                        public void windowClosed(java.awt.event.WindowEvent evt) {
                                formWindowClosed(evt);
                        }
                });

                BackgroundCanvasA1.setBackground(new java.awt.Color(88, 86, 214));
                BackgroundCanvasA1.setAlignmentX(0.0F);
                BackgroundCanvasA1.setAlignmentY(0.0F);

                StudentNoA1.setBackground(new java.awt.Color(255, 69, 58));
                StudentNoA1.setAlignmentX(0.0F);
                StudentNoA1.setAlignmentY(0.0F);

                javax.swing.GroupLayout StudentNoA1Layout = new javax.swing.GroupLayout(StudentNoA1);
                StudentNoA1.setLayout(StudentNoA1Layout);
                StudentNoA1Layout.setHorizontalGroup(
                                StudentNoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 350, Short.MAX_VALUE));
                StudentNoA1Layout.setVerticalGroup(
                                StudentNoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                RedA1.setBackground(new java.awt.Color(255, 55, 95));
                RedA1.setAlignmentX(0.0F);
                RedA1.setAlignmentY(0.0F);

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel2.setForeground(java.awt.Color.white);
                jLabel2.setText("Enter your delivery details and we'll figure out the best route to take so you're not late.");

                javax.swing.GroupLayout RedA1Layout = new javax.swing.GroupLayout(RedA1);
                RedA1.setLayout(RedA1Layout);
                RedA1Layout.setHorizontalGroup(
                                RedA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RedA1Layout.createSequentialGroup().addGap(368, 368, 368)
                                                                .addComponent(jLabel2)
                                                                .addContainerGap(395, Short.MAX_VALUE)));
                RedA1Layout.setVerticalGroup(RedA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                RedA1Layout.createSequentialGroup().addContainerGap(39, Short.MAX_VALUE)
                                                                .addComponent(jLabel2).addGap(35, 35, 35)));

                OrangeA1.setBackground(new java.awt.Color(255, 149, 0));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel1.setForeground(java.awt.Color.white);
                jLabel1.setText("Welcome to MercuryTrails");

                javax.swing.GroupLayout OrangeA1Layout = new javax.swing.GroupLayout(OrangeA1);
                OrangeA1.setLayout(OrangeA1Layout);
                OrangeA1Layout.setHorizontalGroup(
                                OrangeA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(OrangeA1Layout.createSequentialGroup().addGap(641, 641, 641)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                OrangeA1Layout.setVerticalGroup(
                                OrangeA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(OrangeA1Layout.createSequentialGroup().addGap(37, 37, 37)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(38, Short.MAX_VALUE)));

                ENTER.setBackground(new java.awt.Color(255, 149, 0));
                ENTER.setFont(new java.awt.Font("Segoe UI", 1, 24));
                ENTER.setForeground(java.awt.Color.white);
                ENTER.setText("ENTER");
                ENTER.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ENTERActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout TopPanelA1Layout = new javax.swing.GroupLayout(TopPanelA1);
                TopPanelA1.setLayout(TopPanelA1Layout);
                TopPanelA1Layout.setHorizontalGroup(TopPanelA1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelA1Layout
                                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(TopPanelA1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(OrangeA1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(RedA1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)))
                                .addGroup(TopPanelA1Layout.createSequentialGroup().addGap(662, 662, 662)
                                                .addComponent(ENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 162,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                TopPanelA1Layout.setVerticalGroup(TopPanelA1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TopPanelA1Layout.createSequentialGroup().addGap(0, 0, 0)
                                                .addComponent(OrangeA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(RedA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(198, 198, 198)
                                                .addComponent(ENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(227, 227, 227)));

                PurpleA1.setBackground(new java.awt.Color(175, 82, 222));
                PurpleA1.setAlignmentX(0.0F);
                PurpleA1.setAlignmentY(0.0F);

                DeliveryA1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                DeliveryA1.setForeground(java.awt.Color.white);
                DeliveryA1.setText("17307413");
                DeliveryA1.setAlignmentY(0.0F);

                javax.swing.GroupLayout PurpleA1Layout = new javax.swing.GroupLayout(PurpleA1);
                PurpleA1.setLayout(PurpleA1Layout);
                PurpleA1Layout.setHorizontalGroup(
                                PurpleA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                PurpleA1Layout.createSequentialGroup()
                                                                .addContainerGap(142, Short.MAX_VALUE)
                                                                .addComponent(DeliveryA1).addGap(130, 130, 130)));
                PurpleA1Layout.setVerticalGroup(
                                PurpleA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                PurpleA1Layout.createSequentialGroup()
                                                                .addContainerGap(37, Short.MAX_VALUE)
                                                                .addComponent(DeliveryA1).addGap(37, 37, 37)));

                CyanA1.setBackground(new java.awt.Color(90, 200, 250));

                javax.swing.GroupLayout CyanA1Layout = new javax.swing.GroupLayout(CyanA1);
                CyanA1.setLayout(CyanA1Layout);
                CyanA1Layout.setHorizontalGroup(
                                CyanA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                100, Short.MAX_VALUE));
                CyanA1Layout.setVerticalGroup(
                                CyanA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0,
                                                Short.MAX_VALUE));

                GreenA1.setBackground(new java.awt.Color(52, 199, 89));

                javax.swing.GroupLayout GreenA1Layout = new javax.swing.GroupLayout(GreenA1);
                GreenA1.setLayout(GreenA1Layout);
                GreenA1Layout.setHorizontalGroup(
                                GreenA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                100, Short.MAX_VALUE));
                GreenA1Layout.setVerticalGroup(
                                GreenA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                584, Short.MAX_VALUE));

                javax.swing.GroupLayout BackgroundCanvasA1Layout = new javax.swing.GroupLayout(BackgroundCanvasA1);
                BackgroundCanvasA1.setLayout(BackgroundCanvasA1Layout);
                BackgroundCanvasA1Layout.setHorizontalGroup(BackgroundCanvasA1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BackgroundCanvasA1Layout.createSequentialGroup()
                                                .addGroup(BackgroundCanvasA1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(StudentNoA1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(PurpleA1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                BackgroundCanvasA1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                .addComponent(CyanA1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, 0)
                                                                                                .addComponent(GreenA1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addComponent(TopPanelA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                BackgroundCanvasA1Layout.setVerticalGroup(BackgroundCanvasA1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TopPanelA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BackgroundCanvasA1Layout.createSequentialGroup()
                                                .addComponent(PurpleA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(StudentNoA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(BackgroundCanvasA1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(CyanA1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(GreenA1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                                .addComponent(BackgroundCanvasA1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(0, 0, 0)
                                                .addComponent(BackgroundCanvasA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)));

                pack();
                setLocationRelativeTo(null);
        }

        private void formWindowActivated(java.awt.event.WindowEvent evt) {

        }

        private void formWindowClosed(java.awt.event.WindowEvent evt) {

        }

        private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {

                dispose();
                Input baklava = new Input();
                baklava.setVisible(true);

        }

        public static void main(String args[]) {

                String[][] CustOrder = new String[40][5];
                int slot = 0;
                Scanner scan = new Scanner(System.in);
                String slot2;
                String[] slotArray = new String[40];
                double XAxis = 53.38197;
                double YAxis = -6.59274;
                int[] NoOfOrders = new int[40];
                double perimeter = 0;
                int counter = 0;
                System.out.println("Please Enter Orders:");

                // Uses string split to break up input at every comma
                for (int k = 0; k < 40; k++) {
                        slot2 = scan.nextLine();
                        slotArray = slot2.split(",");
                        for (int u = 0; u < 5; u++) {
                                CustOrder[k][u] = slotArray[u];
                        }
                }
                scan.close();

                while (counter < 40) // code loops until all orderes are delivered
                {
                        for (int i = 0; i < 40; i++)// checks every order
                        {
                                // checks if order is inside the given radius
                                if (distanceFormula(XAxis, YAxis, Double.parseDouble(CustOrder[i][3]),
                                                Double.parseDouble(CustOrder[i][4])) < perimeter)

                                {
                                        NoOfOrders[counter] = i + 1;// adds order number to the delivery order array
                                        CustOrder[i][3] = "0";// wiping co-ordinates for this order as its already been
                                                              // delivered
                                        CustOrder[i][4] = "0";
                                        counter++;// increasing the amount of delivered CustOrder
                                        System.out.println("Radius: " + perimeter);// used to test
                                        System.out.println("Count: " + slot);// used to test
                                        System.out.println("Distance: " + distanceFormula(XAxis, YAxis,
                                                        Double.parseDouble(CustOrder[i][3]),
                                                        Double.parseDouble(CustOrder[i][4])));// used to test

                                }

                        }
                        perimeter += 0.01; // increases the radius in small increments until all CustOrder have been
                                           // delivered
                }

                // loop to print the order of delivery
                for (int y = 0; y < 40; y++) {
                        System.out.print(NoOfOrders[y]);
                        System.out.print(",");
                }

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(TSP.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TSP.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TSP.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TSP.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new TSP().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        public javax.swing.JPanel BackgroundCanvasA1;
        public javax.swing.JPanel CyanA1;
        public javax.swing.JLabel DeliveryA1;
        public javax.swing.JButton ENTER;
        public javax.swing.JPanel GreenA1;
        public javax.swing.JPanel OrangeA1;
        public javax.swing.JPanel PurpleA1;
        public javax.swing.JPanel RedA1;
        public javax.swing.JPanel StudentNoA1;
        public javax.swing.JPanel TopPanelA1;
        public javax.swing.JLabel jLabel1;
        public javax.swing.JLabel jLabel2;
        // End of variables declaration

        /**************************************************************************************************************************************/

        public class Input extends javax.swing.JFrame {

                /**
                 * Creates new form GUI
                 */
                public Input() {
                        initComponents();
                }

                /**
                 * This method is called from within the constructor to initialize the form.
                 */

                private void initComponents() {

                        textArea1 = new java.awt.TextArea();
                        BackgroundCanvasA1 = new javax.swing.JPanel();
                        StudentNoA1 = new javax.swing.JPanel();
                        TopPanelA1 = new javax.swing.JPanel();
                        RedA1 = new javax.swing.JPanel();
                        jLabel2 = new javax.swing.JLabel();
                        OrangeA1 = new javax.swing.JPanel();
                        jLabel1 = new javax.swing.JLabel();
                        jPanel1 = new javax.swing.JPanel();
                        button1 = new java.awt.Button();
                        textArea2 = new java.awt.TextArea();
                        PurpleA1 = new javax.swing.JPanel();
                        DeliveryA1 = new javax.swing.JLabel();
                        CyanA1 = new javax.swing.JPanel();
                        GreenA1 = new javax.swing.JPanel();

                        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                        setTitle("CS211 project");
                        setAutoRequestFocus(false);
                        setBackground(new java.awt.Color(229, 229, 234));
                        setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
                        setLocationByPlatform(true);
                        setResizable(false);
                        setSize(new java.awt.Dimension(1500, 1000));
                        addWindowListener(new java.awt.event.WindowAdapter() {
                                public void windowActivated(java.awt.event.WindowEvent evt) {
                                        formWindowActivated(evt);
                                }

                                public void windowClosed(java.awt.event.WindowEvent evt) {
                                        formWindowClosed(evt);
                                }
                        });

                        BackgroundCanvasA1.setBackground(new java.awt.Color(88, 86, 214));
                        BackgroundCanvasA1.setAlignmentX(0.0F);
                        BackgroundCanvasA1.setAlignmentY(0.0F);

                        StudentNoA1.setBackground(new java.awt.Color(255, 69, 58));
                        StudentNoA1.setAlignmentX(0.0F);
                        StudentNoA1.setAlignmentY(0.0F);

                        javax.swing.GroupLayout StudentNoA1Layout = new javax.swing.GroupLayout(StudentNoA1);
                        StudentNoA1.setLayout(StudentNoA1Layout);
                        StudentNoA1Layout.setHorizontalGroup(
                                        StudentNoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 350, Short.MAX_VALUE));
                        StudentNoA1Layout.setVerticalGroup(
                                        StudentNoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 0, Short.MAX_VALUE));

                        RedA1.setBackground(new java.awt.Color(255, 55, 95));
                        RedA1.setAlignmentX(0.0F);
                        RedA1.setAlignmentY(0.0F);

                        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                        jLabel2.setForeground(java.awt.Color.white);
                        jLabel2.setText("Please Enter your Data");

                        javax.swing.GroupLayout RedA1Layout = new javax.swing.GroupLayout(RedA1);
                        RedA1.setLayout(RedA1Layout);
                        RedA1Layout.setHorizontalGroup(RedA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        RedA1Layout.createSequentialGroup()
                                                                        .addContainerGap(571, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2).addGap(544, 544, 544)));
                        RedA1Layout.setVerticalGroup(RedA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        RedA1Layout.createSequentialGroup()
                                                                        .addContainerGap(38, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2).addGap(36, 36, 36)));

                        OrangeA1.setBackground(new java.awt.Color(255, 149, 0));

                        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                        jLabel1.setForeground(java.awt.Color.white);
                        jLabel1.setText("Input");

                        javax.swing.GroupLayout OrangeA1Layout = new javax.swing.GroupLayout(OrangeA1);
                        OrangeA1.setLayout(OrangeA1Layout);
                        OrangeA1Layout.setHorizontalGroup(OrangeA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrangeA1Layout
                                                        .createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addComponent(jLabel1).addGap(617, 617, 617)));
                        OrangeA1Layout.setVerticalGroup(
                                        OrangeA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(OrangeA1Layout.createSequentialGroup()
                                                                        .addGap(36, 36, 36).addComponent(jLabel1)
                                                                        .addContainerGap(39, Short.MAX_VALUE)));

                        button1.setBackground(new java.awt.Color(255, 149, 0));
                        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                        button1.setForeground(java.awt.Color.white);
                        button1.setLabel("FINISH");
                        button1.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        button1ActionPerformed(evt);
                                }
                        });

                        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(jPanel1Layout);
                        jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap(293, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(button1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        101,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(579, 579,
                                                                                                                        579))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(textArea2,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        742,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(273, 273,
                                                                                                                        273)))));
                        jPanel1Layout.setVerticalGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(70, 70, 70)
                                                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(68, 68, 68)
                                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)));

                        javax.swing.GroupLayout TopPanelA1Layout = new javax.swing.GroupLayout(TopPanelA1);
                        TopPanelA1.setLayout(TopPanelA1Layout);
                        TopPanelA1Layout.setHorizontalGroup(TopPanelA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelA1Layout
                                                        .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(TopPanelA1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel1,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addGroup(TopPanelA1Layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(OrangeA1,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        Short.MAX_VALUE)
                                                                                        .addComponent(RedA1,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        Short.MAX_VALUE)))));
                        TopPanelA1Layout.setVerticalGroup(TopPanelA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TopPanelA1Layout.createSequentialGroup().addGap(0, 0, 0)
                                                        .addComponent(OrangeA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(RedA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addGap(4, 4, 4)));

                        PurpleA1.setBackground(new java.awt.Color(175, 82, 222));
                        PurpleA1.setAlignmentX(0.0F);
                        PurpleA1.setAlignmentY(0.0F);

                        DeliveryA1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        DeliveryA1.setForeground(java.awt.Color.white);
                        DeliveryA1.setText("17307413");
                        DeliveryA1.setAlignmentY(0.0F);

                        javax.swing.GroupLayout PurpleA1Layout = new javax.swing.GroupLayout(PurpleA1);
                        PurpleA1.setLayout(PurpleA1Layout);
                        PurpleA1Layout.setHorizontalGroup(PurpleA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurpleA1Layout
                                                        .createSequentialGroup().addContainerGap(142, Short.MAX_VALUE)
                                                        .addComponent(DeliveryA1).addGap(130, 130, 130)));
                        PurpleA1Layout.setVerticalGroup(PurpleA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        PurpleA1Layout.createSequentialGroup()
                                                                        .addContainerGap(37, Short.MAX_VALUE)
                                                                        .addComponent(DeliveryA1).addGap(37, 37, 37)));

                        CyanA1.setBackground(new java.awt.Color(90, 200, 250));

                        javax.swing.GroupLayout CyanA1Layout = new javax.swing.GroupLayout(CyanA1);
                        CyanA1.setLayout(CyanA1Layout);
                        CyanA1Layout.setHorizontalGroup(
                                        CyanA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 100, Short.MAX_VALUE));
                        CyanA1Layout.setVerticalGroup(
                                        CyanA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 0, Short.MAX_VALUE));

                        GreenA1.setBackground(new java.awt.Color(52, 199, 89));

                        javax.swing.GroupLayout GreenA1Layout = new javax.swing.GroupLayout(GreenA1);
                        GreenA1.setLayout(GreenA1Layout);
                        GreenA1Layout.setHorizontalGroup(
                                        GreenA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 100, Short.MAX_VALUE));
                        GreenA1Layout.setVerticalGroup(
                                        GreenA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 584, Short.MAX_VALUE));

                        javax.swing.GroupLayout BackgroundCanvasA1Layout = new javax.swing.GroupLayout(
                                        BackgroundCanvasA1);
                        BackgroundCanvasA1.setLayout(BackgroundCanvasA1Layout);
                        BackgroundCanvasA1Layout.setHorizontalGroup(BackgroundCanvasA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundCanvasA1Layout.createSequentialGroup()
                                                        .addGroup(BackgroundCanvasA1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(StudentNoA1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(PurpleA1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        BackgroundCanvasA1Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                                                        .addComponent(CyanA1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, 0)
                                                                                                        .addComponent(GreenA1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addComponent(TopPanelA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)));
                        BackgroundCanvasA1Layout.setVerticalGroup(BackgroundCanvasA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TopPanelA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(BackgroundCanvasA1Layout.createSequentialGroup()
                                                        .addComponent(PurpleA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(StudentNoA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(BackgroundCanvasA1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(CyanA1,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addComponent(GreenA1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))));

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        layout.createSequentialGroup().addComponent(BackgroundCanvasA1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 0, 0)));
                        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(0, 0, 0)
                                                        .addComponent(BackgroundCanvasA1,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addGap(0, 0, 0)));

                        pack();
                        setLocationRelativeTo(null);
                }

                private void formWindowActivated(java.awt.event.WindowEvent evt) {

                }

                private void formWindowClosed(java.awt.event.WindowEvent evt) {

                }

                private void button1ActionPerformed(java.awt.event.ActionEvent evt) {

                        dispose();
                        GUI baklava3 = new GUI();
                        baklava3.setVisible(true);

                }

                public void Input2(String args[]) {

                        try {
                                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                                .getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                break;
                                        }
                                }
                        } catch (ClassNotFoundException ex) {
                                java.util.logging.Logger.getLogger(Input.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                                java.util.logging.Logger.getLogger(Input.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                                java.util.logging.Logger.getLogger(Input.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                java.util.logging.Logger.getLogger(Input.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        }

                        /* Create and display the form */
                        java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                        new Input().setVisible(true);
                                }
                        });
                }

                // Variables declaration - do not modify
                public javax.swing.JPanel BackgroundCanvasA1;
                public javax.swing.JPanel CyanA1;
                public javax.swing.JLabel DeliveryA1;
                public javax.swing.JPanel GreenA1;
                public javax.swing.JPanel OrangeA1;
                public javax.swing.JPanel PurpleA1;
                public javax.swing.JPanel RedA1;
                public javax.swing.JPanel StudentNoA1;
                public javax.swing.JPanel TopPanelA1;
                public java.awt.Button button1;
                public javax.swing.JLabel jLabel1;
                public javax.swing.JLabel jLabel2;
                public javax.swing.JPanel jPanel1;
                public java.awt.TextArea textArea1;
                public java.awt.TextArea textArea2;
                // End of variables declaration
        }

        /******************************************************************************************************************************* */

        public class GUI extends javax.swing.JFrame {

                /**
                 * Creates new form GUI
                 */
                public GUI() {
                        initComponents();
                }

                /**
                 * This method is called from within the constructor to initialize the form.
                 */

                private void initComponents() {

                        BackgroundCanvas = new javax.swing.JPanel();
                        LeftPanel = new javax.swing.JPanel();
                        TopPanel = new javax.swing.JPanel();
                        jPanel4 = new javax.swing.JPanel();
                        jLabel1 = new javax.swing.JLabel();
                        jScrollPane1 = new javax.swing.JScrollPane();
                        inputTable = new javax.swing.JTable();
                        jPanel1 = new javax.swing.JPanel();
                        label2 = new java.awt.Label();
                        jPanel2 = new javax.swing.JPanel();
                        label3 = new java.awt.Label();
                        label1 = new java.awt.Label();
                        Compute = new java.awt.Button();
                        LeftTitle = new javax.swing.JPanel();
                        Delivery = new javax.swing.JLabel();
                        jPanel3 = new javax.swing.JPanel();
                        jPanel5 = new javax.swing.JPanel();

                        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                        setBackground(java.awt.Color.white);
                        setFont(new java.awt.Font("Calibri", 0, 10));
                        setLocationByPlatform(true);
                        setResizable(false);
                        setSize(new java.awt.Dimension(1500, 1000));

                        BackgroundCanvas.setBackground(new java.awt.Color(88, 86, 214));
                        BackgroundCanvas.setAlignmentX(0.0F);
                        BackgroundCanvas.setAlignmentY(0.0F);

                        LeftPanel.setBackground(new java.awt.Color(255, 69, 58));
                        LeftPanel.setAlignmentX(0.0F);
                        LeftPanel.setAlignmentY(0.0F);

                        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
                        LeftPanel.setLayout(LeftPanelLayout);
                        LeftPanelLayout.setHorizontalGroup(
                                        LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 350, Short.MAX_VALUE));
                        LeftPanelLayout.setVerticalGroup(
                                        LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 0, Short.MAX_VALUE));

                        jPanel4.setBackground(new java.awt.Color(255, 55, 95));
                        jPanel4.setAlignmentX(0.0F);
                        jPanel4.setAlignmentY(0.0F);

                        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
                        jLabel1.setText("Confirm data entered below is correct and press \"Confirm\" to compute optimal route.");

                        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                        jPanel4.setLayout(jPanel4Layout);
                        jPanel4Layout.setHorizontalGroup(
                                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                        .addGap(388, 388, 388).addComponent(jLabel1)
                                                                        .addContainerGap(391, Short.MAX_VALUE)));
                        jPanel4Layout.setVerticalGroup(jPanel4Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        jPanel4Layout.createSequentialGroup()
                                                                        .addContainerGap(39, Short.MAX_VALUE)
                                                                        .addComponent(jLabel1).addGap(35, 35, 35)));

                        inputTable.setFont(new java.awt.Font("Segoe UI", 0, 12));
                        inputTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null },
                                        { null, null, null, null, null }, { null, null, null, null, null } },
                                        new String[] { "Order No.", "Address", "Wait Time", "Longitude", "Latitude" }) {
                                Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class,
                                                java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class };

                                public Class getColumnClass(int columnIndex) {
                                        return types[columnIndex];
                                }
                        });
                        inputTable.setAlignmentX(0.0F);
                        inputTable.setAlignmentY(0.0F);
                        inputTable.setColumnSelectionAllowed(true);
                        jScrollPane1.setViewportView(inputTable);
                        inputTable.getColumnModel().getSelectionModel()
                                        .setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

                        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(jPanel1Layout);
                        jPanel1Layout.setHorizontalGroup(
                                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 98, Short.MAX_VALUE));
                        jPanel1Layout.setVerticalGroup(
                                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 24, Short.MAX_VALUE));

                        label2.setText("This is the data you have entered");

                        jPanel2.setBackground(new java.awt.Color(255, 149, 0));

                        label3.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        label3.setForeground(new java.awt.Color(250, 250, 250));
                        label3.setText("Delivery Planner");

                        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                        jPanel2.setLayout(jPanel2Layout);
                        jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(658, 658, 658)
                                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap()));
                        jPanel2Layout.setVerticalGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                        .createSequentialGroup().addContainerGap(37, Short.MAX_VALUE)
                                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25)));

                        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                        label1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        label1.setText("Calculate Optimal Route");

                        Compute.setBackground(new java.awt.Color(255, 149, 0));
                        Compute.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        Compute.setForeground(java.awt.Color.white);
                        Compute.setLabel("CONFIRM");
                        Compute.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        ComputeActionPerformed(evt);
                                }
                        });

                        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
                        TopPanel.setLayout(TopPanelLayout);
                        TopPanelLayout.setHorizontalGroup(TopPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout
                                                        .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(TopPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jPanel2,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addComponent(jPanel4,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        TopPanelLayout.createSequentialGroup()
                                                                                                        .addComponent(jPanel1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(125, 125,
                                                                                                                        125)
                                                                                                        .addComponent(Compute,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        123,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(716, 716,
                                                                                                                        716))))
                                        .addGroup(TopPanelLayout.createSequentialGroup().addGroup(TopPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(TopPanelLayout.createSequentialGroup()
                                                                        .addGap(351, 351, 351)
                                                                        .addGroup(TopPanelLayout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(label2,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jScrollPane1,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        763,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(TopPanelLayout.createSequentialGroup()
                                                                        .addGap(623, 623, 623).addComponent(label1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 0, Short.MAX_VALUE)));
                        TopPanelLayout.setVerticalGroup(TopPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TopPanelLayout.createSequentialGroup().addGap(0, 0, 0)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 320,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(TopPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jPanel1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Compute,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        48,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, 0)));

                        LeftTitle.setBackground(new java.awt.Color(175, 82, 222));
                        LeftTitle.setAlignmentX(0.0F);
                        LeftTitle.setAlignmentY(0.0F);

                        Delivery.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        Delivery.setForeground(java.awt.Color.white);
                        Delivery.setText("17307413");
                        Delivery.setAlignmentY(0.0F);

                        javax.swing.GroupLayout LeftTitleLayout = new javax.swing.GroupLayout(LeftTitle);
                        LeftTitle.setLayout(LeftTitleLayout);
                        LeftTitleLayout.setHorizontalGroup(LeftTitleLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        LeftTitleLayout.createSequentialGroup()
                                                                        .addContainerGap(142, Short.MAX_VALUE)
                                                                        .addComponent(Delivery).addGap(130, 130, 130)));
                        LeftTitleLayout.setVerticalGroup(LeftTitleLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        LeftTitleLayout.createSequentialGroup()
                                                                        .addContainerGap(37, Short.MAX_VALUE)
                                                                        .addComponent(Delivery).addGap(37, 37, 37)));

                        jPanel3.setBackground(new java.awt.Color(90, 200, 250));

                        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                        jPanel3.setLayout(jPanel3Layout);
                        jPanel3Layout.setHorizontalGroup(
                                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 100, Short.MAX_VALUE));
                        jPanel3Layout.setVerticalGroup(
                                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 0, Short.MAX_VALUE));

                        jPanel5.setBackground(new java.awt.Color(52, 199, 89));

                        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                        jPanel5.setLayout(jPanel5Layout);
                        jPanel5Layout.setHorizontalGroup(
                                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 100, Short.MAX_VALUE));
                        jPanel5Layout.setVerticalGroup(
                                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 584, Short.MAX_VALUE));

                        javax.swing.GroupLayout BackgroundCanvasLayout = new javax.swing.GroupLayout(BackgroundCanvas);
                        BackgroundCanvas.setLayout(BackgroundCanvasLayout);
                        BackgroundCanvasLayout.setHorizontalGroup(BackgroundCanvasLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundCanvasLayout.createSequentialGroup()
                                                        .addGroup(BackgroundCanvasLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(LeftPanel,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(LeftTitle,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        BackgroundCanvasLayout
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                                                        .addComponent(jPanel3,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, 0)
                                                                                                        .addComponent(jPanel5,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)));
                        BackgroundCanvasLayout.setVerticalGroup(BackgroundCanvasLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(BackgroundCanvasLayout.createSequentialGroup()
                                                        .addComponent(LeftTitle, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(BackgroundCanvasLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel3,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addComponent(jPanel5,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))));

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        layout.createSequentialGroup().addComponent(BackgroundCanvas,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 0, Short.MAX_VALUE)));
                        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(0, 0, 0)
                                                        .addComponent(BackgroundCanvas,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addGap(0, 0, 0)));

                        pack();
                }

                private void ComputeActionPerformed(java.awt.event.ActionEvent evt) {

                        dispose();
                        Output baklava2 = new Output();
                        baklava2.setVisible(true);

                }

                public void GUI2(String args[]) {

                        try {
                                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                                .getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                break;
                                        }
                                }
                        } catch (ClassNotFoundException ex) {
                                java.util.logging.Logger.getLogger(GUI.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                                java.util.logging.Logger.getLogger(GUI.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                                java.util.logging.Logger.getLogger(GUI.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                java.util.logging.Logger.getLogger(GUI.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        }

                        /* Create and display the form */
                        java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                        new GUI().setVisible(true);
                                }
                        });
                }

                // Variables declaration - do not modify
                public javax.swing.JPanel BackgroundCanvas;
                public java.awt.Button Compute;
                public javax.swing.JLabel Delivery;
                public javax.swing.JPanel LeftPanel;
                public javax.swing.JPanel LeftTitle;
                public javax.swing.JPanel TopPanel;
                public javax.swing.JTable inputTable;
                public javax.swing.JLabel jLabel1;
                public javax.swing.JPanel jPanel1;
                public javax.swing.JPanel jPanel2;
                public javax.swing.JPanel jPanel3;
                public javax.swing.JPanel jPanel4;
                public javax.swing.JPanel jPanel5;
                public javax.swing.JScrollPane jScrollPane1;
                public java.awt.Label label1;
                public java.awt.Label label2;
                public java.awt.Label label3;
                // End of variables declaration
        }

        /*************************************************************************************************************************** */

        public class Output extends javax.swing.JFrame {

                /**
                 * Creates new form GUI
                 */
                public Output() {
                        initComponents();
                }

                /**
                 * This method is called from within the constructor to initialize the form.
                 */

                private void initComponents() {

                        BackgroundCanvasA1 = new javax.swing.JPanel();
                        StudentNoA1 = new javax.swing.JPanel();
                        TopPanelA1 = new javax.swing.JPanel();
                        RedA1 = new javax.swing.JPanel();
                        jLabel2 = new javax.swing.JLabel();
                        OrangeA1 = new javax.swing.JPanel();
                        jLabel1 = new javax.swing.JLabel();
                        jPanel1 = new javax.swing.JPanel();
                        textArea1 = new java.awt.TextArea();
                        PurpleA1 = new javax.swing.JPanel();
                        DeliveryA1 = new javax.swing.JLabel();
                        CyanA1 = new javax.swing.JPanel();
                        GreenA1 = new javax.swing.JPanel();

                        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                        setTitle("CS211 project");
                        setAutoRequestFocus(false);
                        setBackground(new java.awt.Color(229, 229, 234));
                        setFont(new java.awt.Font("Calibri", 0, 10));
                        setLocationByPlatform(true);
                        setResizable(false);
                        setSize(new java.awt.Dimension(1500, 1000));
                        addWindowListener(new java.awt.event.WindowAdapter() {
                                public void windowActivated(java.awt.event.WindowEvent evt) {
                                        formWindowActivated(evt);
                                }

                                public void windowClosed(java.awt.event.WindowEvent evt) {
                                        formWindowClosed(evt);
                                }
                        });

                        BackgroundCanvasA1.setBackground(new java.awt.Color(88, 86, 214));
                        BackgroundCanvasA1.setAlignmentX(0.0F);
                        BackgroundCanvasA1.setAlignmentY(0.0F);

                        StudentNoA1.setBackground(new java.awt.Color(255, 69, 58));
                        StudentNoA1.setAlignmentX(0.0F);
                        StudentNoA1.setAlignmentY(0.0F);

                        javax.swing.GroupLayout StudentNoA1Layout = new javax.swing.GroupLayout(StudentNoA1);
                        StudentNoA1.setLayout(StudentNoA1Layout);
                        StudentNoA1Layout.setHorizontalGroup(
                                        StudentNoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 350, Short.MAX_VALUE));
                        StudentNoA1Layout.setVerticalGroup(
                                        StudentNoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 0, Short.MAX_VALUE));

                        RedA1.setBackground(new java.awt.Color(255, 55, 95));
                        RedA1.setAlignmentX(0.0F);
                        RedA1.setAlignmentY(0.0F);

                        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        jLabel2.setForeground(java.awt.Color.white);
                        jLabel2.setText("This is the most optimal route for you to take.");

                        javax.swing.GroupLayout RedA1Layout = new javax.swing.GroupLayout(RedA1);
                        RedA1.setLayout(RedA1Layout);
                        RedA1Layout.setHorizontalGroup(
                                        RedA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(RedA1Layout.createSequentialGroup()
                                                                        .addGap(543, 543, 543).addComponent(jLabel2)
                                                                        .addContainerGap(572, Short.MAX_VALUE)));
                        RedA1Layout.setVerticalGroup(RedA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        RedA1Layout.createSequentialGroup()
                                                                        .addContainerGap(38, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2).addGap(36, 36, 36)));

                        OrangeA1.setBackground(new java.awt.Color(255, 149, 0));

                        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        jLabel1.setForeground(java.awt.Color.white);
                        jLabel1.setText("Output");

                        javax.swing.GroupLayout OrangeA1Layout = new javax.swing.GroupLayout(OrangeA1);
                        OrangeA1.setLayout(OrangeA1Layout);
                        OrangeA1Layout.setHorizontalGroup(OrangeA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(OrangeA1Layout.createSequentialGroup().addGap(721, 721, 721)
                                                        .addComponent(jLabel1)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)));
                        OrangeA1Layout.setVerticalGroup(OrangeA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        OrangeA1Layout.createSequentialGroup()
                                                                        .addContainerGap(39, Short.MAX_VALUE)
                                                                        .addComponent(jLabel1).addGap(36, 36, 36)));

                        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(jPanel1Layout);
                        jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(282, 282, 282)
                                                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        902, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)));
                        jPanel1Layout.setVerticalGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                        .createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(60, 60, 60)));

                        javax.swing.GroupLayout TopPanelA1Layout = new javax.swing.GroupLayout(TopPanelA1);
                        TopPanelA1.setLayout(TopPanelA1Layout);
                        TopPanelA1Layout.setHorizontalGroup(TopPanelA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelA1Layout
                                                        .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(TopPanelA1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(OrangeA1,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addComponent(RedA1,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)))
                                        .addGroup(TopPanelA1Layout.createSequentialGroup().addContainerGap()
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addContainerGap()));
                        TopPanelA1Layout.setVerticalGroup(TopPanelA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TopPanelA1Layout.createSequentialGroup().addGap(0, 0, 0)
                                                        .addComponent(OrangeA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(RedA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addContainerGap()));

                        PurpleA1.setBackground(new java.awt.Color(175, 82, 222));
                        PurpleA1.setAlignmentX(0.0F);
                        PurpleA1.setAlignmentY(0.0F);

                        DeliveryA1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                        DeliveryA1.setForeground(java.awt.Color.white);
                        DeliveryA1.setText("17307413");
                        DeliveryA1.setAlignmentY(0.0F);

                        javax.swing.GroupLayout PurpleA1Layout = new javax.swing.GroupLayout(PurpleA1);
                        PurpleA1.setLayout(PurpleA1Layout);
                        PurpleA1Layout.setHorizontalGroup(PurpleA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurpleA1Layout
                                                        .createSequentialGroup().addContainerGap(142, Short.MAX_VALUE)
                                                        .addComponent(DeliveryA1).addGap(130, 130, 130)));
                        PurpleA1Layout.setVerticalGroup(PurpleA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        PurpleA1Layout.createSequentialGroup()
                                                                        .addContainerGap(37, Short.MAX_VALUE)
                                                                        .addComponent(DeliveryA1).addGap(37, 37, 37)));

                        CyanA1.setBackground(new java.awt.Color(90, 200, 250));

                        javax.swing.GroupLayout CyanA1Layout = new javax.swing.GroupLayout(CyanA1);
                        CyanA1.setLayout(CyanA1Layout);
                        CyanA1Layout.setHorizontalGroup(
                                        CyanA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 100, Short.MAX_VALUE));
                        CyanA1Layout.setVerticalGroup(
                                        CyanA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 0, Short.MAX_VALUE));

                        GreenA1.setBackground(new java.awt.Color(52, 199, 89));

                        javax.swing.GroupLayout GreenA1Layout = new javax.swing.GroupLayout(GreenA1);
                        GreenA1.setLayout(GreenA1Layout);
                        GreenA1Layout.setHorizontalGroup(
                                        GreenA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 100, Short.MAX_VALUE));
                        GreenA1Layout.setVerticalGroup(
                                        GreenA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGap(0, 584, Short.MAX_VALUE));

                        javax.swing.GroupLayout BackgroundCanvasA1Layout = new javax.swing.GroupLayout(
                                        BackgroundCanvasA1);
                        BackgroundCanvasA1.setLayout(BackgroundCanvasA1Layout);
                        BackgroundCanvasA1Layout.setHorizontalGroup(BackgroundCanvasA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundCanvasA1Layout.createSequentialGroup()
                                                        .addGroup(BackgroundCanvasA1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(StudentNoA1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(PurpleA1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        BackgroundCanvasA1Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                                                        .addComponent(CyanA1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, 0)
                                                                                                        .addComponent(GreenA1,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addComponent(TopPanelA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)));
                        BackgroundCanvasA1Layout.setVerticalGroup(BackgroundCanvasA1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TopPanelA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(BackgroundCanvasA1Layout.createSequentialGroup()
                                                        .addComponent(PurpleA1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(StudentNoA1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(BackgroundCanvasA1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(CyanA1,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                        .addComponent(GreenA1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))));

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        layout.createSequentialGroup().addComponent(BackgroundCanvasA1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 0, Short.MAX_VALUE)));
                        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(0, 0, 0)
                                                        .addComponent(BackgroundCanvasA1,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                        .addGap(0, 0, 0)));

                        pack();
                        setLocationRelativeTo(null);
                }

                private void formWindowActivated(java.awt.event.WindowEvent evt) {

                }

                private void formWindowClosed(java.awt.event.WindowEvent evt) {

                }

                public void Output2(String args[]) {

                        try {
                                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                                .getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                break;
                                        }
                                }
                        } catch (ClassNotFoundException ex) {
                                java.util.logging.Logger.getLogger(Output.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                                java.util.logging.Logger.getLogger(Output.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                                java.util.logging.Logger.getLogger(Output.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                java.util.logging.Logger.getLogger(Output.class.getName())
                                                .log(java.util.logging.Level.SEVERE, null, ex);
                        }

                        /* Create and display the form */
                        java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                        new Output().setVisible(true);
                                }
                        });
                }

                // Variables declaration - do not modify
                public javax.swing.JPanel BackgroundCanvasA1;
                public javax.swing.JPanel CyanA1;
                public javax.swing.JLabel DeliveryA1;
                public javax.swing.JPanel GreenA1;
                public javax.swing.JPanel OrangeA1;
                public javax.swing.JPanel PurpleA1;
                public javax.swing.JPanel RedA1;
                public javax.swing.JPanel StudentNoA1;
                public javax.swing.JPanel TopPanelA1;
                public javax.swing.JLabel jLabel1;
                public javax.swing.JLabel jLabel2;
                public javax.swing.JPanel jPanel1;
                public java.awt.TextArea textArea1;
                // End of variables declaration
        }

        // method to use haversine formula to get distance
        public static double distanceFormula(double YAxis1, double XAxis1, double YAxis2, double XAxis2) {
                double DifferenceLatituide = Math.toRadians(YAxis2 - YAxis1);
                double DifferenceLongitude = Math.toRadians(XAxis2 - XAxis1);

                YAxis1 = Math.toRadians(YAxis1);
                YAxis2 = Math.toRadians(YAxis2);

                double a = Math.sin(DifferenceLatituide / 2) * Math.sin(DifferenceLatituide / 2)
                                + Math.cos(YAxis1) * Math.cos(YAxis2) * Math.sin(DifferenceLongitude / 2)
                                                * Math.sin(DifferenceLongitude / 2);

                return 2 * 6371 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        }

}
