package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


public class LoginData {
	int a=2;
	@DataProvider
	public Object[][] createProduct(){
		return ExcelUtils.getData("TestData.xls", "NegativeLogin");
	}
	
	@DataProvider
	public Object[][] CreatePatient(){
		return new Object[][] { 
			new Object[] {
			ExcelUtils.data("SuiteData.xls", "Sheet1", "createPatient").toArray() }
			};
	}
	
	@DataProvider
	public Object[][] SearchPatient(){
		return new Object[][] { ExcelUtils.data("SuiteData.xls", "Sheet1", "searchPatient").toArray() };
	}
}
