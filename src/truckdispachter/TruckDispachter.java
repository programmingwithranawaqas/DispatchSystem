
package truckdispachter;

public class TruckDispachter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperAdminDashBoard().setVisible(true);
            }
        });
    }
    
}
