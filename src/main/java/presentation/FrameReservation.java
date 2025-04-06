/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame(){
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }
  
    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        LabelDate = new javax.swing.JLabel();
        hourPicker = new javax.swing.JComboBox<>();
        LabelHeure = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        LabelNbPers = new javax.swing.JLabel();
        nbPersPicker = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesPicker = new javax.swing.JLabel();
        LabelChoixTable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeTables = new javax.swing.JList<>();
        annulationButton = new javax.swing.JButton();
        validationButton = new javax.swing.JButton();
        LabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datePicker.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                datePickerAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        LabelDate.setText("1. Choisissez la date");
        LabelDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        hourPicker.setEditable(true);
        hourPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        hourPicker.setSelectedIndex(-1);
        hourPicker.setEnabled(false);
        hourPicker.setRequestFocusEnabled(true);
        hourPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourPickerActionPerformed(evt);
            }
        });

        LabelHeure.setText("2. 2. Choisissez l'heure");
        LabelHeure.setEnabled(false);
        LabelHeure.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(LabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHeure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");
        hourPicker.getAccessibleContext().setAccessibleParent(hourPicker);

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelNbPers.setText("3. Indiquez le nombre de personnes");
        LabelNbPers.setEnabled(false);
        LabelNbPers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        nbPersPicker.setEditable(true);
        nbPersPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nbPersPicker.setSelectedIndex(-1);
        nbPersPicker.setEnabled(false);
        nbPersPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbPersPickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelNbPers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelNbPers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nbPersPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pickTablePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablesPicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesPicker.setEnabled(false);

        LabelChoixTable.setText("4. Choisissez votre table");
        LabelChoixTable.setEnabled(false);
        LabelChoixTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        listeTables.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listeTables.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listeTablesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listeTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listeTablesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listeTables);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelChoixTable, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelChoixTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablesPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 248, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        annulationButton.setText("Annuler");
        annulationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulationButtonActionPerformed(evt);
            }
        });

        validationButton.setText("Valider");
        validationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationButtonActionPerformed(evt);
            }
        });

        LabelTitle.setText("Réservez une table");
        LabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annulationButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulationButton)
                    .addComponent(validationButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hourPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourPickerActionPerformed
        String time = (String)hourPicker.getSelectedItem();
        validationButton.setEnabled(false);
        if (time != null){
            nbPersPicker.setEnabled(true);
            LabelNbPers.setEnabled(true);
        } else {
            nbPersPicker.setEnabled(false);
            LabelNbPers.setEnabled(false);
        }
        dialog.handleTimeSelectedEvent(time);
    }//GEN-LAST:event_hourPickerActionPerformed

    private void nbPersPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbPersPickerActionPerformed
        String nbPersonnes = (String)nbPersPicker.getSelectedItem();
        if (nbPersonnes != null) {
            int nombrePersonnes = Integer.parseInt(nbPersonnes);
            listeTables.setEnabled(true);
            tablesPicker.setEnabled(true);
            LabelChoixTable.setEnabled(true);
            String[] tablesDisponibles = {};
            if (nombrePersonnes <= 2) {
                tablesDisponibles = new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5" };
            } else if (nombrePersonnes <= 4) {
                tablesDisponibles = new String[] { "Table 2", "Table 3", "Table 4", "Table 5" };
            } else if (nombrePersonnes <= 8) {
                tablesDisponibles = new String[] { "Table 6" };
            } 
            // Mise à jour de la liste
            listeTables.setListData(tablesDisponibles);
            listeTables.clearSelection();
            dialog.handleNumOfPersonsSelectedEvent(nombrePersonnes);
        }
    }//GEN-LAST:event_nbPersPickerActionPerformed

    private void annulationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulationButtonActionPerformed
        dialog.handleCancelEvent();
        resetChamps();
    }//GEN-LAST:event_annulationButtonActionPerformed

    private void validationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationButtonActionPerformed
        dialog.handleValidationEvent();
        resetChamps();
    }//GEN-LAST:event_validationButtonActionPerformed

    private void datePickerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_datePickerAncestorAdded
        LocalDate selectedDate = datePicker.getDate();
        dialog.handleDateSelectedEvent(selectedDate);
    }//GEN-LAST:event_datePickerAncestorAdded

    private void listeTablesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listeTablesAncestorAdded
        String selectedTable = listeTables.getSelectedValue();
        dialog.handleTableSelectedEvent(selectedTable);
    }//GEN-LAST:event_listeTablesAncestorAdded

    private void listeTablesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeTablesMousePressed
        String selectedTable = listeTables.getSelectedValue();
        if (selectedTable != null) {
            dialog.handleTableSelectedEvent(selectedTable);
            validationButton.setEnabled(true);
        }
    }//GEN-LAST:event_listeTablesMousePressed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        LocalDate selectedDate = dateEvent.getNewDate();
        if (selectedDate != null && !selectedDate.isBefore(LocalDate.now())) {
            LabelHeure.setEnabled(true);
            hourPicker.setEnabled(true);
            dialog.handleDateSelectedEvent(selectedDate);
        } else {
            hourPicker.setEnabled(false);
            LabelHeure.setEnabled(false);
            dialog.handleDateSelectedEvent(selectedDate);
        }
    }

    public void resetChamps() {
        // Réinitialiser la date
        datePicker.setDate(null);
        datePicker.setEnabled(true);

        // Réinitialiser l'heure
        hourPicker.setSelectedIndex(-1);
        hourPicker.setEnabled(false);
        LabelHeure.setEnabled(false);

        // Réinitialiser le nombre de personnes
        nbPersPicker.setSelectedIndex(-1);
        nbPersPicker.setEnabled(false);
        LabelNbPers.setEnabled(false);

        // Réinitialiser les tables
        listeTables.clearSelection();
        listeTables.setEnabled(false);
        tablesPicker.setEnabled(false);
        LabelChoixTable.setEnabled(false);

        // Réinitialiser le bouton "Valider"
        validationButton.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelChoixTable;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelHeure;
    private javax.swing.JLabel LabelNbPers;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton annulationButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> hourPicker;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listeTables;
    private javax.swing.JComboBox<String> nbPersPicker;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesPicker;
    private javax.swing.JButton validationButton;
    // End of variables declaration//GEN-END:variables

}
