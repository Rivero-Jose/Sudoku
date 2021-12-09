
import javax.swing.JOptionPane;//imports JOptionPane
import java.awt.Desktop;
import java.net.URI;
/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class Egg /*implements LineListener*/ {
	
	
	
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
    /**
     * this flag indicates whether the playback completes or not.
     */
	
	public void music(){
		
		String t = in("Choose song\n" +
        		"a)Relaxing music 1 b)Relaxing music 2 c)Relaxing music 3 c)Relaxing music 4 e)Relaxing music 5\n" +
        		"A little music for your Sudoku\n" +
        		"Requires internet connection\n" +
        		"DISCLAIMER: I DO NOT OWN THESE SONGS THEY BELONG TO [Meditation Relax Music] on youtube");
		if(t.equals("a")){
    	if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=DJUIgV7t8C0"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
		}else if(t.equals("b")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=yjj7zIWO88s"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			
	    		}
	    	}
			}else if(t.equals("c")){
				
				
		    	if(Desktop.isDesktopSupported()){
		    		try{
		    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=VnQ8AhkX7bQ"));
		    		}catch(Exception e){
		    			msg("The link is not supported, or you do not have internet connection");
		    			
		    		}
		    	}
				}else if(t.equals("d")){
					
					
			    	if(Desktop.isDesktopSupported()){
			    		try{
			    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=KqecsHPqX6Y"));
			    		}catch(Exception e){
			    			msg("The link is not supported, or you do not have internet connection");
			    			
			    		}
			    	}
					}else if(t.equals("e")){
						
						
				    	if(Desktop.isDesktopSupported()){
				    		try{
				    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=9vdFHnl89Yk"));
				    		}catch(Exception e){
				    			msg("The link is not supported, or you do not have internet connection");
				    		
				    		}
				    	}
						}else{
							msg("Nothing was chosen, heading back to the home menu");
							
						}
        
        
    }
	
	public void music1(){
		Sodoku F = new Sodoku();
		String t = in("Choose song\n" +
        		"a) b) c) d) e) f)\n" +
        		":3   have fun with your reward\n" +
        		"Hahaha this will be great write your reviews in the comments haha");
		if(t.equals("a")){
    	if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=AZOyUtXawig"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			F.home();
    		}
    	}
		}else if(t.equals("b")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=mO4XBiarMVU"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			F.home();
	    		}
	    	}
		}else if(t.equals("c")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=ZbM6WbUw7Bs"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			F.home();
	    		}
	    	}
		}else if(t.equals("d")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=FrVYD2Ac6nM&t=103s"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			F.home();
	    		}
	    	}
		}else if(t.equals("e")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=xjOVqBm-Lu8"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			F.home();
	    		}
	    	}
		}else if(t.equals("f")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=RY7vcYvb69k"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			F.home();
	    		}
	    	}
		}
		F.home();
	}
}
