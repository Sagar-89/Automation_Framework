package generic_Script;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Script implements Selen_Frmwrk_Constant
{
	public static String getdata(String s,int r,int c)
	{
		String value = null;
		try {
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(s);
		Row rw = sh.getRow(r);
		Cell cl = rw.getCell(c);
		value = cl.toString();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return value;
	}
}
