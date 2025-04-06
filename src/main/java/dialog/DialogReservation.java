/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import presentation.FrameReservation;

public class DialogReservation {

    
    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private LocalDate selectedDate;
    private String selectedTime;
    private int nbPersonnes;
    private int selectTable;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
        frameReservation.resetChamps();
    }

    public void handleDateSelectedEvent(LocalDate date) {
        if (date == null) {
            // NULL POINTER EXCEPTION A LA REMISE A 0
            return;
        }
        LocalDate aujourdhui = LocalDate.now();
        if (date.isBefore(aujourdhui)) {
            System.out.println("impossible");
            return;
        }
        this.selectedDate = date;
        System.out.println("Date sélectionnée : " + selectedDate);
    }

    public void handleTimeSelectedEvent(String time) {
        this.selectedTime = time;
        System.out.println("Heure sélectionnée: " + selectedTime);
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
        System.out.println("Nombre de personnes: " + nbPersonnes);
    }


    public void handleTableSelectedEvent(String numTable) {
        char Table = numTable.charAt(6);
        int selectedTable = Table - '0';
        this.selectTable = selectedTable;
        System.out.println("Numéro de Table: " + numTable);
    }
   

    public void handleCancelEvent() {
        frameReservation.resetChamps();
        System.out.println("Réservation annulée. Toutes les informations ont été réinitialisées.");
    }

    public void handleValidationEvent() {
        String message = "Réservation confirmée pour " + this.selectedDate + " à " + this.selectedTime + 
                " pour " + this.nbPersonnes + " personnes" + "à la Table n°" + this.selectTable;
        JOptionPane.showMessageDialog(null, message , "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        frameReservation.resetChamps();
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
