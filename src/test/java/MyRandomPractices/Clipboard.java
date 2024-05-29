package MyRandomPractices;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Clipboard {
	
	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		 Object flavor = clipboard.getData(DataFlavor.stringFlavor);
		 String partycode=(String) flavor;
		 System.out.println(partycode);
	}

}
