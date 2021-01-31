package javaActivity2;

class CustomException  extends Exception {
	private String message = null;
	
	public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity2_4 {

	public static void exceptionTest(String string) throws CustomException
	{
		if(string == null)
		{
			throw new CustomException("String value is Null");
		}
		else
		{
			System.out.println(string); 
		}
	}
	
	//Main method
	public static void main(String[] args) throws CustomException {
		
		//prints exception in console.
		exceptionTest("Non Null string value as message");
		
		//throws exception
		exceptionTest(null);


	}

}
