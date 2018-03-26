import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;

public class HelloWorld_xx_clip {
    public static void main (String[] args) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Clipboard clip = kit.getSystemClipboard();
		String s="";
		try {
			s = (String) clip.getData(DataFlavor.stringFlavor);
		} catch (UnsupportedFlavorException e) {
		} catch (IOException e) {
		}
        System.out.println(s);
    }
}