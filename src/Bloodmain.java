
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bloodmain {
    public static void main(String[] args) throws SQLException {
      Splash splash=new Splash();
      LogIn2 login2 = null;
      LogIn login = null;
        try {
            login = new LogIn();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bloodmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        loading frm = new loading();
       frm.setVisible(true);
        try{
            for(int i=0;i<=100;i++) {
                Thread.sleep(30);
             if(i==100)
                    frm.setVisible(false);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
          }
      try{
           splash.setVisible(true);
      for(int i=0;i<=100;i++) {
          Thread.sleep(45);
           splash.loadingnum.setText(Integer.toString(i)+"%");
                splash.loadingbar.setValue(i);
                if(i==100) {
                    splash.setVisible(false);
               login.setVisible(true);
              }
           }
      
         } catch(InterruptedException E){
             System.out.println("Error");
    
            }
     }
  }
