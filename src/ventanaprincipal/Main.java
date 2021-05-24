/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaprincipal;

import ventanaprincipal.Frm_IniciarSesion;

/**
 * 
 * @author usuario
 */
public class Main {
    
    private static Frm_IniciarSesion is;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        is= new Frm_IniciarSesion();
        is.setVisible(true);
    }

    public static Frm_IniciarSesion getIs() {
        return is;
    }

    public static void setIs(Frm_IniciarSesion is) {
        Main.is = is;
    }
}
