/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingpackage.shopping;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import shoppingpackage.shopping.entity.Balance;
import shoppingpackage.shopping.entity.Category;
import shoppingpackage.shopping.entity.CategoryName;
import shoppingpackage.shopping.entity.Transactions;
import shoppingpackage.shopping.initialize.CategoryInit;
import shoppingpackage.shopping.repository.BalanceRepository;
import shoppingpackage.shopping.repository.TransactionsRepository;
import shoppingpackage.shopping.service.TransactionService;

/**
 *
 * @author mrbutcher
 */



public class ShoppingApplicationUI extends javax.swing.JFrame {

	static ShoppingApplication app; 
	ShoppingApplicationUI ui;
	@Autowired
	TransactionService transactionService;
   
    /**
     * Creates new form ShoppingApplicationUI
     */
    public ShoppingApplicationUI() {
   
        initComponents();
        this.setTitle("Shopping App");
        jScrollPane1.setVisible(false);
        
        try{
        List balanceList = app.transactionService.getAllBalance();
        balanceText.setText( balanceList.get(balanceList.size()-1).toString() );
        }catch(Exception e){
            balanceText.setText("0");
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

        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        food = new javax.swing.JLabel();
        car = new javax.swing.JLabel();
        entertainment = new javax.swing.JLabel();
        travel = new javax.swing.JLabel();
        shopping = new javax.swing.JLabel();
        subscriptions = new javax.swing.JLabel();
        other = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        balanceLabel = new javax.swing.JLabel();
        balanceText = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        downloadLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeMouseReleased(evt);
            }
        });

        food.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food.png"))); // NOI18N
        food.setToolTipText("");
        food.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                foodMouseReleased(evt);
            }
        });

        car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car.png"))); // NOI18N
        car.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carMouseReleased(evt);
            }
        });

        entertainment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entertainment.png"))); // NOI18N
        entertainment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entertainment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                entertainmentMouseReleased(evt);
            }
        });

        travel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel.png"))); // NOI18N
        travel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        travel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                travelMouseReleased(evt);
            }
        });

        shopping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping.png"))); // NOI18N
        shopping.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shoppingMouseReleased(evt);
            }
        });

        subscriptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/subscriptions.png"))); // NOI18N
        subscriptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subscriptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subscriptionsMouseReleased(evt);
            }
        });

        other.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other.png"))); // NOI18N
        other.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        other.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                otherMouseReleased(evt);
            }
        });

        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plusMouseReleased(evt);
            }
        });

        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minus.png"))); // NOI18N
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minusMouseReleased(evt);
            }
        });

        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Összeg", "Megjegyzés", "Dátum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(categoryTable);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(2).setResizable(false);
        }

        balanceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceLabel.setText("Egyenleg:");
        balanceLabel.setToolTipText("");

        balanceText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceText.setText("0");

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        downloadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Download.png"))); // NOI18N
        downloadLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                downloadLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(balanceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(balanceText)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(categoryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(downloadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(food)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(car)
                                .addGap(18, 18, 18)
                                .addComponent(entertainment)
                                .addGap(18, 18, 18)
                                .addComponent(travel)
                                .addGap(18, 18, 18)
                                .addComponent(shopping)
                                .addGap(18, 18, 18)
                                .addComponent(subscriptions)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(other)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minus, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(plus, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(balanceText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(other)
                            .addComponent(subscriptions)
                            .addComponent(shopping)
                            .addComponent(travel)
                            .addComponent(entertainment)
                            .addComponent(car)
                            .addComponent(food)
                            .addComponent(home))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(categoryLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(downloadLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseReleased
       
        tableRefresh(new Long(1));
        
    }//GEN-LAST:event_homeMouseReleased

    private void foodMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseReleased
               tableRefresh(new Long(2));
    }//GEN-LAST:event_foodMouseReleased

    private void carMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carMouseReleased
                tableRefresh(new Long(7));

    }//GEN-LAST:event_carMouseReleased

    private void entertainmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entertainmentMouseReleased
                tableRefresh(new Long(3));

    }//GEN-LAST:event_entertainmentMouseReleased

    private void travelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelMouseReleased
                tableRefresh(new Long(5));

    }//GEN-LAST:event_travelMouseReleased

    private void shoppingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingMouseReleased
                tableRefresh(new Long(4));

    }//GEN-LAST:event_shoppingMouseReleased
    
    
    private void subscriptionsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subscriptionsMouseReleased
        tableRefresh(new Long(6));
     
    }//GEN-LAST:event_subscriptionsMouseReleased

    private void otherMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherMouseReleased
                tableRefresh(new Long(8));
    }//GEN-LAST:event_otherMouseReleased

    private void plusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseReleased
      
    	
    	String result = (String)JOptionPane.showInputDialog(
                this,
                "Add meg az összeget", 
                "Összeg megadása",            
                JOptionPane.PLAIN_MESSAGE,
                null,            
                null, 
                "0"
             );
    	long resultLong = 0;	
    	try {
			resultLong = Long.parseLong(result);
		} catch (NumberFormatException e) {
			
			JOptionPane.showConfirmDialog(this, "Számot adj meg kérlek");
		}
    	
    	List<Balance> allBalance = app.transactionService.getAllBalance();
    	Balance balance;
    	if(allBalance.size() ==0)
    		balance = new Balance(0, LocalDateTime.now());
    	else 
    	balance = allBalance.get( allBalance.size()-1 );
    
    	Balance newBalance = new Balance(resultLong + balance.getAmount(),LocalDateTime.now());
    
    	app.transactionService.saveBalance(newBalance);
    	
    	balanceText.setText(newBalance.toString());
    	
    }//GEN-LAST:event_plusMouseReleased

    private void minusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseReleased
       
    	String[] selection = {"Háztartás","Autó/Motor","Étel","Szórakozás","Utazás","Bevásárlás","Előfizetések","Egyéb" };
    	
    	String resultCategory = (String)JOptionPane.showInputDialog(
                this,
                "Kérlek válassz kategóriát", 
                "Kategóriák",            
                JOptionPane.PLAIN_MESSAGE,
                null,            
                selection, 
                ""
             );
    	
    	String result = (String)JOptionPane.showInputDialog(
                this,
                "Add meg az összeget", 
                "Összeg megadása",            
                JOptionPane.PLAIN_MESSAGE,
                null,            
                null, 
                "0"
             );
    	
    	
    	long resultLong = 0;	
    	try {
			resultLong = Long.parseLong(result);
		} catch (NumberFormatException e) {
			
			JOptionPane.showConfirmDialog(this, "Számot adj meg kérlek");
		}
    	
    	List<Balance> allBalance = app.transactionService.getAllBalance();
    	Balance balance;
    	if(allBalance.size() ==0)
    		balance = new Balance(0, LocalDateTime.now());
    	else 
    	balance = allBalance.get( allBalance.size()-1 );
    
    	Balance newBalance = new Balance(balance.getAmount() - resultLong,LocalDateTime.now());
    
    	app.transactionService.saveBalance(newBalance);
    	
    	String resultDescription = (String)JOptionPane.showInputDialog(
                this,
                "Kérlek írj megjegyzést(nem kötelező)!", 
                "Megjegyzés",            
                JOptionPane.PLAIN_MESSAGE,
                null,            
                null, 
                ""
             );
    	
    	CategoryName name = null;
    	Category category = null;
    	switch (resultCategory) {
    	case "Háztartás": category = app.transactionService.getCategoryById(new Long(1));  break;
    	case"Autó/Motor":  category = app.transactionService.getCategoryById(new Long(7)); break;		
    	case "Étel" :category = app.transactionService.getCategoryById(new Long(2));  break;
    	case "Szórakozás":  category = app.transactionService.getCategoryById(new Long(3)); break;
    	case "Utazás":   category = app.transactionService.getCategoryById(new Long(5)); break;
    	case "Bevásárlás":  category = app.transactionService.getCategoryById(new Long(4)); break;
    	case "Előfizetések": category = app.transactionService.getCategoryById(new Long(6)); break;
    	case "Egyéb" :   category = app.transactionService.getCategoryById(new Long(8)); break;
    	default:
			break;
		}
    	Transactions transaction = new Transactions(LocalDateTime.now(), resultLong, resultDescription,category);
    	
    	app.transactionService.saveTransaction(transaction);
    	tableRefresh(category.getId());
    	
    	balanceText.setText(newBalance.toString());
    	
    	
    	
    }//GEN-LAST:event_minusMouseReleased

    private void downloadLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadLabelMouseReleased
    	List<String[]> dataLines = new ArrayList<>();    	
    List<Transactions> allTransaction = app.transactionService.getAllTransactions();
    
    for (Transactions item : allTransaction) {
			dataLines.add(new String[] {item.getCategory().toString(), ((Long)item.getAmount()).toString() , item.getDescription(), item.getDate().toString()    } );
    	
	}
    	
    	try {
			givenDataArray_whenConvertToCSV_thenOutputCreated(dataLines);
			JOptionPane.showMessageDialog(this, "Sikeres exportálás!");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }//GEN-LAST:event_downloadLabelMouseReleased

    
    public String convertToCSV(String[] data) {
        return Stream.of(data)
          .map(this::escapeSpecialCharacters)
          .collect(Collectors.joining(";"));
    }
    
    public void givenDataArray_whenConvertToCSV_thenOutputCreated(List<String[]> dataLines ) throws IOException {
       
    	File csvOutputFile = new File("export" +LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_hh_mm_ss_SS"))+ ".csv");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
              .map(this::convertToCSV)
              .forEach(pw::println);
        }
        
    
    }
    
    
    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
    
    private void tableRefresh(Long id){
    	
    
			try {
				List<Transactions> list = app.transactionService.getTransactionsById( id );
				if(list.size() == 0)
					jScrollPane1.setVisible(false);
				else
					 jScrollPane1.setVisible(true);
				
				categoryTable.setModel(tableInit(list));
				
			} catch (NullPointerException e) {
				
			}
    	
        
        switch( Integer.parseInt(Long.toString(id) ) )
        {
            case 1 : categoryLabel.setText("Háztartás");  break;
            case 7 :  categoryLabel.setText("Autó / Motor"); break;
            case 2 :  categoryLabel.setText("Étkezés");break;
            case 3 : categoryLabel.setText("Szórakozás"); break;
            case 4 : categoryLabel.setText("Bevásárlás"); break;
            case 5 :  categoryLabel.setText("Utazás"); break;
            case 6 : categoryLabel.setText("Előfizetések"); break;
            case 8 : categoryLabel.setText("Egyéb"); break;
            default : break;
        
        }
                
        
    }
    
    private DefaultTableModel tableInit(List<Transactions> list){
    
        
        Object[][] matrix = new Object[list.size()][3];
        int i=0;
        int j=0;
        for (Transactions item : list) {
            
            matrix[i][j] = (Long)item.getAmount();
            ++j;
            matrix[i][j] = item.getDescription();
            ++j;
            matrix[i][j] =  item.getDate().toString();
            j = 0;
            ++i;
        }
        
    Object [ ] colNames = {"Összeg","Megjegyzés","Dátum"};    
        
   return new DefaultTableModel(matrix, colNames);
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
    	
    	ShoppingApplicationUI ui = new ShoppingApplicationUI();
    	
    	ConfigurableApplicationContext context = SpringApplication.run(ShoppingApplication.class, args);
		 app = context.getBean(ShoppingApplication.class);
		 app.categoryInit.createInitData();
    	
		
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShoppingApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingApplicationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceText;
    private javax.swing.JLabel car;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel downloadLabel;
    private javax.swing.JLabel entertainment;
    private javax.swing.JLabel food;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel other;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel shopping;
    private javax.swing.JLabel subscriptions;
    private javax.swing.JLabel travel;
    // End of variables declaration//GEN-END:variables
}