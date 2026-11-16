package constant;

public class Constant {
	public static final String CONFIGFILE = System.getProperty("user.dir")+"\\src\\main\\resources\\Config.property";
	public static final String TESTDATA = System.getProperty("user.dir")+"\\src\\test\\resources\\GroceryTest.xlsx";
	public static final String VALIDCREDENTIALERROR = "User is unable to login  with valid credentials";
	public static final String VALIDANDINVALIDERROR = "User is able to login with correct username and incorrect password";
	public static final String INVALIDANDVALIDERROR ="User is able to login with incorrect username and correct password";
	public static final String INVALIDCREDENTIALERROR = "User is able to login with invalid credentials";
	public static final String LOGOUTERROR = "User is unable to logout";
	public static final String ADDINDNEWADMINUSERERROR = "User is not able to add new users";
	public static final String SEARCHINGNEWLYADDEDDADMINUSERERROR = "User is unable to search";
	public static final String ADDINGNEWDELIVERYBOYERROR = "User is unable to add new list delivery boy";
	public static final String ADDINGNEWCATEGORYERROR = "User is unable to add new category";
	public static final String SEARCHINGNEWLYADDEDCATEGORYERROR = "User is unable search category";
	
}
