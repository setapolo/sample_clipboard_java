import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld_xx_putclip  {
    public static void main (String[] args) throws IOException{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Clipboard clip = kit.getSystemClipboard();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String ss="";
        String lf = System.getProperty("line.separator");
        while (null != (s = buffer.readLine())) {
            if (!s.isEmpty()){
	            ss += s+lf;
        	}
        }
		StringSelection ssl = new StringSelection(ss);
		clip.setContents(ssl, ssl);
    }
}