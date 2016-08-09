import javax.swing.JOptionPane;

public class HelloU
    {
        public static void main ( String args[])
        {
            String input = JOptionPane.showInputDialog( "What's your name?" );
            
            System.out.println( "Hello " + input );
        } // end method main
        
        
    } // end class HelloU