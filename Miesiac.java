/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uniwersalnykalendarz;

import java.util.GregorianCalendar;

/**
 *
 * @author kayne
 */
public class Miesiac extends javax.swing.JPanel {

    private GregorianCalendar kalendarz;
    
    private Model poprzedni;
    private Model obecny;
    private Model następny;

    /**
     * Creates new form Miesiac
     */
    public Miesiac() {
        initComponents();
    }

    public void setKalendarz(GregorianCalendar kal) {
        kalendarz = kal;
        poprzedni = new Model(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH)-1);
        obecny = new Model(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH));
        następny = new Model(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH)+1);
        jList1.setModel(poprzedni);
        jList2.setModel(obecny);
        jList3.setModel(następny);
    }
    
    public void rysujMiesiąc() {
        rysujMiesiąc(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH));
    }
    
    public void rysujMiesiąc(int r, int m) {
        poprzedni.zmieńDatę(r, m-1);
        obecny.zmieńDatę(r, m);
        następny.zmieńDatę(r, m+1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();

        setLayout(new java.awt.GridLayout(0, 3));

        jList1.setCellRenderer(new Kreslarz());
        jScrollPane2.setViewportView(jList1);

        add(jScrollPane2);

        jList2.setCellRenderer(new Kreslarz());
        jScrollPane1.setViewportView(jList2);

        add(jScrollPane1);

        jList3.setCellRenderer(new Kreslarz());
        jScrollPane3.setViewportView(jList3);

        add(jScrollPane3);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}