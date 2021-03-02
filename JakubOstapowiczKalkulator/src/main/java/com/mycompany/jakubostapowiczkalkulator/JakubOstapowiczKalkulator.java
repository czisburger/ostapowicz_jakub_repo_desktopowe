/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jakubostapowiczkalkulator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class JakubOstapowiczKalkulator extends javax.swing.JFrame {

    /**
     * Creates new form JakubOstapowiczKalkulator
     */
    
   
    public JakubOstapowiczKalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jo_jPanelMain = new javax.swing.JPanel();
        jo_jTextFieldCalculations = new javax.swing.JTextField();
        jo_jButtonClear = new javax.swing.JButton();
        jo_jButtonDivide = new javax.swing.JButton();
        jo_jButtonMultiply = new javax.swing.JButton();
        jo_jButtonBack = new javax.swing.JButton();
        jo_jButtonSeven = new javax.swing.JButton();
        jo_jButtonEight = new javax.swing.JButton();
        jo_jButtonNine = new javax.swing.JButton();
        jo_jButtonMinus = new javax.swing.JButton();
        jo_jButtonFour = new javax.swing.JButton();
        jo_jButtonFive = new javax.swing.JButton();
        jo_jButtonSix = new javax.swing.JButton();
        jo_jButtonPlus = new javax.swing.JButton();
        jo_jButtonOne = new javax.swing.JButton();
        jo_jButtonTwo = new javax.swing.JButton();
        jo_jButtonThree = new javax.swing.JButton();
        jo_jButtonEquals = new javax.swing.JButton();
        jo_jButtonSquareRoot = new javax.swing.JButton();
        jo_jButtonZero = new javax.swing.JButton();
        jo_jButtonComma = new javax.swing.JButton();
        jo_jMenuBarMenu = new javax.swing.JMenuBar();
        jo_jMenuFile = new javax.swing.JMenu();
        jo_jCheckBoxMenuItemSaveActivityHistory = new javax.swing.JCheckBoxMenuItem();
        jo_jMenuItemClose = new javax.swing.JMenuItem();
        jo_jMenuTools = new javax.swing.JMenu();
        jo_jMenuItemDays = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jo_jTextFieldCalculations.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jo_jTextFieldCalculations.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jo_jTextFieldCalculations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jTextFieldCalculationsActionPerformed(evt);
            }
        });

        jo_jButtonClear.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jo_jButtonClear.setForeground(new java.awt.Color(0, 102, 255));
        jo_jButtonClear.setText("C");
        jo_jButtonClear.setBorder(null);
        jo_jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonClearActionPerformed(evt);
            }
        });

        jo_jButtonDivide.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonDivide.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonDivide.setForeground(new java.awt.Color(0, 102, 255));
        jo_jButtonDivide.setText("÷");
        jo_jButtonDivide.setBorder(null);
        jo_jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonDivideActionPerformed(evt);
            }
        });

        jo_jButtonMultiply.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonMultiply.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonMultiply.setForeground(new java.awt.Color(0, 102, 255));
        jo_jButtonMultiply.setText("×");
        jo_jButtonMultiply.setBorder(null);
        jo_jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonMultiplyActionPerformed(evt);
            }
        });

        jo_jButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jo_jButtonBack.setForeground(new java.awt.Color(0, 102, 255));
        jo_jButtonBack.setText("←");
        jo_jButtonBack.setBorder(null);
        jo_jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonBackActionPerformed(evt);
            }
        });

        jo_jButtonSeven.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonSeven.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonSeven.setText("7");
        jo_jButtonSeven.setBorder(null);
        jo_jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonSevenActionPerformed(evt);
            }
        });

        jo_jButtonEight.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonEight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonEight.setText("8");
        jo_jButtonEight.setBorder(null);
        jo_jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonEightActionPerformed(evt);
            }
        });

        jo_jButtonNine.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonNine.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonNine.setText("9");
        jo_jButtonNine.setBorder(null);
        jo_jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonNineActionPerformed(evt);
            }
        });

        jo_jButtonMinus.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonMinus.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jo_jButtonMinus.setForeground(new java.awt.Color(0, 102, 255));
        jo_jButtonMinus.setText("-");
        jo_jButtonMinus.setBorder(null);
        jo_jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonMinusActionPerformed(evt);
            }
        });

        jo_jButtonFour.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonFour.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonFour.setText("4");
        jo_jButtonFour.setBorder(null);
        jo_jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonFourActionPerformed(evt);
            }
        });

        jo_jButtonFive.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonFive.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonFive.setText("5");
        jo_jButtonFive.setBorder(null);
        jo_jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonFiveActionPerformed(evt);
            }
        });

        jo_jButtonSix.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonSix.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonSix.setText("6");
        jo_jButtonSix.setBorder(null);
        jo_jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonSixActionPerformed(evt);
            }
        });

        jo_jButtonPlus.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonPlus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonPlus.setForeground(new java.awt.Color(0, 102, 255));
        jo_jButtonPlus.setText("+");
        jo_jButtonPlus.setBorder(null);
        jo_jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonPlusActionPerformed(evt);
            }
        });

        jo_jButtonOne.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonOne.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonOne.setText("1");
        jo_jButtonOne.setBorder(null);
        jo_jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonOneActionPerformed(evt);
            }
        });

        jo_jButtonTwo.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonTwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonTwo.setText("2");
        jo_jButtonTwo.setBorder(null);
        jo_jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonTwoActionPerformed(evt);
            }
        });

        jo_jButtonThree.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonThree.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonThree.setText("3");
        jo_jButtonThree.setBorder(null);
        jo_jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonThreeActionPerformed(evt);
            }
        });

        jo_jButtonEquals.setBackground(new java.awt.Color(0, 102, 255));
        jo_jButtonEquals.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonEquals.setForeground(new java.awt.Color(255, 255, 255));
        jo_jButtonEquals.setText("=");
        jo_jButtonEquals.setBorder(null);
        jo_jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonEqualsActionPerformed(evt);
            }
        });

        jo_jButtonSquareRoot.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonSquareRoot.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jo_jButtonSquareRoot.setText("√");
        jo_jButtonSquareRoot.setBorder(null);

        jo_jButtonZero.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonZero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jo_jButtonZero.setText("0");
        jo_jButtonZero.setBorder(null);
        jo_jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonZeroActionPerformed(evt);
            }
        });

        jo_jButtonComma.setBackground(new java.awt.Color(255, 255, 255));
        jo_jButtonComma.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jo_jButtonComma.setText(",");
        jo_jButtonComma.setBorder(null);
        jo_jButtonComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jButtonCommaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jo_jPanelMainLayout = new javax.swing.GroupLayout(jo_jPanelMain);
        jo_jPanelMain.setLayout(jo_jPanelMainLayout);
        jo_jPanelMainLayout.setHorizontalGroup(
            jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                .addComponent(jo_jTextFieldCalculations, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addComponent(jo_jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jo_jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addComponent(jo_jButtonSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jo_jButtonZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                                .addComponent(jo_jButtonOne, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jo_jButtonFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jo_jButtonSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))
                        .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jo_jButtonTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                                .addComponent(jo_jButtonNine, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jo_jButtonSix, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jo_jButtonThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jo_jButtonComma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jo_jButtonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addComponent(jo_jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jo_jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jo_jPanelMainLayout.setVerticalGroup(
            jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                .addComponent(jo_jTextFieldCalculations, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jo_jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jo_jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addComponent(jo_jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jo_jButtonMultiply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jo_jButtonNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jo_jButtonMinus, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jo_jButtonEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jo_jButtonSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jo_jButtonFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jo_jButtonFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jo_jButtonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jo_jButtonSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jo_jPanelMainLayout.createSequentialGroup()
                        .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jo_jButtonOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonThree, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jo_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jo_jButtonSquareRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jo_jButtonZero, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jo_jButtonComma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jo_jButtonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jo_jMenuFile.setText("Plik");

        jo_jCheckBoxMenuItemSaveActivityHistory.setSelected(true);
        jo_jCheckBoxMenuItemSaveActivityHistory.setText("Zapisz Historię Działań");
        jo_jMenuFile.add(jo_jCheckBoxMenuItemSaveActivityHistory);

        jo_jMenuItemClose.setText("Zamknij");
        jo_jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jMenuItemCloseActionPerformed(evt);
            }
        });
        jo_jMenuFile.add(jo_jMenuItemClose);

        jo_jMenuBarMenu.add(jo_jMenuFile);

        jo_jMenuTools.setText("Narzędzia");

        jo_jMenuItemDays.setText("Ile dni pomiędzy datami");
        jo_jMenuItemDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jMenuItemDaysActionPerformed(evt);
            }
        });
        jo_jMenuTools.add(jo_jMenuItemDays);

        jo_jMenuBarMenu.add(jo_jMenuTools);

        setJMenuBar(jo_jMenuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jo_jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jo_jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jo_jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonClearActionPerformed
        jo_jTextFieldCalculations.setText("");
    }//GEN-LAST:event_jo_jButtonClearActionPerformed

    private void jo_jButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonFiveActionPerformed
        if(jo_jButtonFive.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"5");
        }
    }//GEN-LAST:event_jo_jButtonFiveActionPerformed

    private void jo_jTextFieldCalculationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jTextFieldCalculationsActionPerformed
        
    }//GEN-LAST:event_jo_jTextFieldCalculationsActionPerformed

    private void jo_jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonZeroActionPerformed
        if(jo_jButtonZero.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"0");
        }
    }//GEN-LAST:event_jo_jButtonZeroActionPerformed

    private void jo_jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonOneActionPerformed
        if(jo_jButtonOne.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"1");
        }
    }//GEN-LAST:event_jo_jButtonOneActionPerformed

    private void jo_jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonTwoActionPerformed
        if(jo_jButtonTwo.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"2");
        }
    }//GEN-LAST:event_jo_jButtonTwoActionPerformed

    private void jo_jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonThreeActionPerformed
        if(jo_jButtonThree.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"3");
        }
    }//GEN-LAST:event_jo_jButtonThreeActionPerformed

    private void jo_jButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonFourActionPerformed
        if(jo_jButtonFour.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"4");
        }
    }//GEN-LAST:event_jo_jButtonFourActionPerformed

    private void jo_jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonSixActionPerformed
        if(jo_jButtonSix.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"6");
        }
    }//GEN-LAST:event_jo_jButtonSixActionPerformed

    private void jo_jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonSevenActionPerformed
        if(jo_jButtonSeven.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"7");
        }
    }//GEN-LAST:event_jo_jButtonSevenActionPerformed

    private void jo_jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonEightActionPerformed
        if(jo_jButtonEight.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"8");
        }
    }//GEN-LAST:event_jo_jButtonEightActionPerformed

    private void jo_jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonNineActionPerformed
        if(jo_jButtonNine.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+"9");
        }
    }//GEN-LAST:event_jo_jButtonNineActionPerformed

    private void jo_jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jMenuItemCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jo_jMenuItemCloseActionPerformed

    private void jo_jButtonCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonCommaActionPerformed
        if(jo_jButtonComma.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+",");
        }
    }//GEN-LAST:event_jo_jButtonCommaActionPerformed

    private void jo_jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonBackActionPerformed
        String cofnij = null;
        if(jo_jTextFieldCalculations.getText().length() > 0){
            StringBuilder strB = new StringBuilder(jo_jTextFieldCalculations.getText());
            strB.deleteCharAt(jo_jTextFieldCalculations.getText().length() - 1);
            cofnij = strB.toString();
            jo_jTextFieldCalculations.setText(cofnij);
        }
    }//GEN-LAST:event_jo_jButtonBackActionPerformed

    private void jo_jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonDivideActionPerformed
        if(jo_jButtonDivide.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+" / ");
        }
    }//GEN-LAST:event_jo_jButtonDivideActionPerformed

    private void jo_jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonMultiplyActionPerformed
        if(jo_jButtonMultiply.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+" * ");
        }
    }//GEN-LAST:event_jo_jButtonMultiplyActionPerformed

    private void jo_jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonMinusActionPerformed
        if(jo_jButtonMinus.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+" - ");
        }
    }//GEN-LAST:event_jo_jButtonMinusActionPerformed

    private void jo_jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonPlusActionPerformed
        if(jo_jButtonPlus.isEnabled()){
            jo_jTextFieldCalculations.setText(jo_jTextFieldCalculations.getText()+" + ");
        }
    }//GEN-LAST:event_jo_jButtonPlusActionPerformed

    private void jo_jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jButtonEqualsActionPerformed
        var str = jo_jTextFieldCalculations.getText();
        var array = str.split(" + ");
        jo_jTextFieldCalculations.setText(array+"");
    }//GEN-LAST:event_jo_jButtonEqualsActionPerformed

    private void jo_jMenuItemDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jMenuItemDaysActionPerformed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String data = JOptionPane.showInputDialog("Wprowadź datę w formacie (dd mm yyyy): ");
        if(data != null && data.length() == 10){
            LocalDate ldnow = LocalDate.now();
            LocalDate ldinput = LocalDate.parse(data, formatter);
            long days = ChronoUnit.DAYS.between(ldinput, ldnow);
            JOptionPane.showMessageDialog(rootPane, ""+days, "Ilość dni", HEIGHT);
        }
    }//GEN-LAST:event_jo_jMenuItemDaysActionPerformed

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
            java.util.logging.Logger.getLogger(JakubOstapowiczKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JakubOstapowiczKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JakubOstapowiczKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JakubOstapowiczKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JakubOstapowiczKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jo_jButtonBack;
    private javax.swing.JButton jo_jButtonClear;
    private javax.swing.JButton jo_jButtonComma;
    private javax.swing.JButton jo_jButtonDivide;
    private javax.swing.JButton jo_jButtonEight;
    private javax.swing.JButton jo_jButtonEquals;
    private javax.swing.JButton jo_jButtonFive;
    private javax.swing.JButton jo_jButtonFour;
    private javax.swing.JButton jo_jButtonMinus;
    private javax.swing.JButton jo_jButtonMultiply;
    private javax.swing.JButton jo_jButtonNine;
    private javax.swing.JButton jo_jButtonOne;
    private javax.swing.JButton jo_jButtonPlus;
    private javax.swing.JButton jo_jButtonSeven;
    private javax.swing.JButton jo_jButtonSix;
    private javax.swing.JButton jo_jButtonSquareRoot;
    private javax.swing.JButton jo_jButtonThree;
    private javax.swing.JButton jo_jButtonTwo;
    private javax.swing.JButton jo_jButtonZero;
    private javax.swing.JCheckBoxMenuItem jo_jCheckBoxMenuItemSaveActivityHistory;
    private javax.swing.JMenuBar jo_jMenuBarMenu;
    private javax.swing.JMenu jo_jMenuFile;
    private javax.swing.JMenuItem jo_jMenuItemClose;
    private javax.swing.JMenuItem jo_jMenuItemDays;
    private javax.swing.JMenu jo_jMenuTools;
    private javax.swing.JPanel jo_jPanelMain;
    private javax.swing.JTextField jo_jTextFieldCalculations;
    // End of variables declaration//GEN-END:variables
}
