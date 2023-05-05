/**
 * Owen Rabe
 * May 4 23
 * A gui that sorts 1 of 2 sets of numbers and displays some stats about them
 */
package rabesortingproject;

import java.io.File;
import java.util.Scanner;

public class RabeSortingProject extends javax.swing.JFrame {

    public RabeSortingProject() {
        initComponents();
        displayedSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selection", "Bubble", "Quick"}));
        fillArrays();
    }
    private static int[] nums10000 = new int[10000];
    private static int nums10[] = new int[10];
    private static int bLoops,qLoops,sLoops;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numBtns = new javax.swing.ButtonGroup();
        ascDescBtns = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn10 = new javax.swing.JRadioButton();
        btn1000 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnAscend = new javax.swing.JRadioButton();
        btnDescend = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        String[] sorts = {"Bubble","Insertion","Quick"};
        displayedSort = new javax.swing.JComboBox<>(sorts);
        btnSort = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newTxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        origTxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bigSortTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jLabel1.setText("Sorting Efficiencies");

        jLabel2.setText("Amount of Numbers to Sort:");

        numBtns.add(btn10);
        btn10.setSelected(true);
        btn10.setText("10");

        numBtns.add(btn1000);
        btn1000.setText("10000");

        jLabel3.setText("Sort Order:");

        ascDescBtns.add(btnAscend);
        btnAscend.setSelected(true);
        btnAscend.setText("Ascending");

        ascDescBtns.add(btnDescend);
        btnDescend.setText("Descending");

        jLabel4.setText("Display Numbers Sorted by:");

        displayedSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        displayedSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayedSortActionPerformed(evt);
            }
        });

        btnSort.setText("Sort!");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jLabel5.setText("Original Numbers:");

        newTxt.setBackground(new java.awt.Color(255, 255, 255));
        newTxt.setColumns(20);
        newTxt.setRows(5);
        jScrollPane1.setViewportView(newTxt);

        origTxt.setBackground(new java.awt.Color(255, 255, 255));
        origTxt.setColumns(20);
        origTxt.setRows(5);
        jScrollPane2.setViewportView(origTxt);

        jLabel6.setText("Sorted Numbers");

        jLabel7.setText("Sort Results:");

        bigSortTxt.setBackground(new java.awt.Color(255, 255, 255));
        bigSortTxt.setColumns(20);
        bigSortTxt.setRows(5);
        jScrollPane3.setViewportView(bigSortTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDescend)
                            .addComponent(btnAscend))
                        .addGap(18, 18, 18)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btn10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1000))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayedSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btn10)
                            .addComponent(btn1000))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(displayedSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(btnAscend))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDescend))
                                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayedSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayedSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayedSortActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        int[] b, q, s;
        String msg = "";
        String origMsg = "";
        double bubbleTime1 = 0,bubbleTime2=0,selectTime1=0,selectTime2=0,quickTime1=0,quickTime2 = 0;
        qLoops = 0;
        sLoops = 0;
        bLoops = 0;
        if (btn10.isSelected()) {
            b = nums10.clone();
            q = nums10.clone();
            s = nums10.clone();
            for (int i = 0; i < nums10.length; i++) {
                origMsg+= i + " : " + nums10[i] + "\n";
            }

        } else {
            b = nums10000.clone();
            q = nums10000.clone();
            s = nums10000.clone();
            for (int i = 0; i < nums10000.length; i++) {
                origMsg+= i + " : " + nums10000[i] + "\n";
            }
            

        }
        origTxt.setText(origMsg);
        if (btnAscend.isSelected()) {
            bubbleTime1 = System.nanoTime();
            ascBubbleSort(b, b.length);
            bubbleTime2 = System.nanoTime();
            selectTime1 = System.nanoTime();
            ascSelectSort(s, s.length);
            selectTime2 = System.nanoTime();
            quickTime1 = System.nanoTime();
            ascQuickSort(q,0,q.length-1);
            quickTime2 = System.nanoTime();

        } else {
            descBubbleSort(b, b.length);
            System.out.println("bubbledone");
            descSelectSort(s, s.length);
            System.out.println("selectdone");
            descQuickSort(q,0,q.length-1);
            System.out.println("quickdone");
        }
        if(displayedSort.getSelectedItem().toString().equalsIgnoreCase("Bubble")){
            for (int i = 0; i < b.length; i++) {
                msg+= i + " : " + b[i] + "\n";
            }
            
        }else if(displayedSort.getSelectedItem().toString().equalsIgnoreCase("Quick")){
            for (int i = 0; i < q.length; i++) {
                msg+= i + " : " + q[i] + "\n";
            }
        }else{
            for (int i = 0; i < s.length; i++) {
                msg+= i + " : " + s[i] + "\n";
            }
        }
        newTxt.setText(msg);
        bigSortTxt.setText("Bubble Sort:\nNumber of times a loop was Executed: \n" + bLoops + "\nNumber of Nanoseconds to complete sort: " + (bubbleTime2-bubbleTime1) + "\n"
                + "Quick Sort:\nNumber of times a loop was Executed: \n" + qLoops + "\nNumber of Nanoseconds to complete sort: " + (quickTime2-quickTime1) + "\n"
                        + "Selection Sort:\nNumber of times a loop was Executed: \n" + sLoops + "\nNumber of Nanoseconds to complete sort: " + (selectTime2-selectTime1));
    }//GEN-LAST:event_btnSortActionPerformed
    /**
     * algorithm to sort the strings using bubble sort
     *
     * @param numItems the number of strings in the array
     */
    public static void ascBubbleSort(int[] nums, int numItems) {
        int bottom = numItems - 1;
        int temp;
        boolean sw = true;
        //loops until it doesn't swap anything around anymore meaning everything must be in place.
        while (sw) {
            //var that says if a swap has taken place
            sw = false;
            //loop to continuously put the lexographically smaller string to the right until it hits the end
            for (int j = 0; j < bottom; j++) {
                if (nums[j] - nums[j + 1] > 0) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sw = true;
                }
                bLoops++;

            }
            bottom = bottom - 1;
        }
    }

    public static void descBubbleSort(int[] nums, int numItems) {
        int bottom = numItems - 1;
        int temp;
        boolean sw = true;
        //loops until it doesn't swap anything around anymore meaning everything must be in place.
        while (sw) {
            System.out.println("test");
            //var that says if a swap has taken place
            sw = false;
            //loop to continuously put the lexographically smaller string to the right until it hits the end
            for (int j = 0; j < bottom; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sw = true;
                    System.out.println("swapped");
                }
                
                bLoops ++;

            }
            bottom = bottom - 1;
        }
    }

    public static void ascSelectSort(int[] nums, int numItems) {
        int temp;
        for (int i = 0; i < numItems - 1; i++) {
            for (int j = i + 1; j < numItems; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                sLoops++;
            }
        }
    }

    public static void descSelectSort(int[] nums, int numItems) {
        int temp;
        for (int i = 0; i < numItems - 1; i++) {
            for (int j = i + 1; j < numItems; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                sLoops++;
            }
        }
    }

    public static void ascQuickSort(int a[], int left, int right) {

        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int temp;
        int pivot = a[(left + right) / 2];
        while (i < j) {
            while (a[i] < pivot) {
                i++;
                qLoops++;
            }
            while (pivot < a[j]) {
                j--;
                qLoops++;
            }
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        ascQuickSort(a, left, j);
        ascQuickSort(a, i, right);
    }

    public static void descQuickSort(int a[], int right, int left) {

        if (left <= right) {
            return;
        }
        int i = left;
        int j = right;
        int temp;
        int pivot = a[(left + right) / 2];
        while (i >= j) {
            while (a[i] < pivot) {
                i--;
                qLoops++;
            }
            while (pivot < a[j]) {
                j++;
                qLoops++;
            }
            if (i >= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i--;
                j++;
            }
        }
        descQuickSort(a, left, j);
        descQuickSort(a, i, right);
    }

    public static void fillArrays() {
        File f = new File("src/rabesortingproject/10nums.txt");
        try {
            Scanner s = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                nums10[i] = Integer.parseInt(s.nextLine());
            }
            f = new File("src/rabesortingproject/10000nums.txt");
            s = new Scanner(f);
            for (int i = 0; i < 10000; i++) {
                nums10000[i] = Integer.parseInt(s.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

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
            java.util.logging.Logger.getLogger(RabeSortingProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RabeSortingProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RabeSortingProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RabeSortingProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RabeSortingProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ascDescBtns;
    private javax.swing.JTextArea bigSortTxt;
    private javax.swing.JRadioButton btn10;
    private javax.swing.JRadioButton btn1000;
    private javax.swing.JRadioButton btnAscend;
    private javax.swing.JRadioButton btnDescend;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> displayedSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea newTxt;
    private javax.swing.ButtonGroup numBtns;
    private javax.swing.JTextArea origTxt;
    // End of variables declaration//GEN-END:variables
}
