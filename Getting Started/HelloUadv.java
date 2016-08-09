import javax.swing.JOptionPane;

public class HelloUadv
    {
        public static void main ( String args[])
        {
            String name = JOptionPane.showInputDialog( "What's your name?" );
            
            String age = JOptionPane.showInputDialog( "And what's your age?");
            
            System.out.println( "Hello, " + name + "! You are " + age + " years old.");
        } // end method main
        
        
    } // end class HelloUadv