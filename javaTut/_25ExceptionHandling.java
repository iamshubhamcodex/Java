package javaTut;
import m.Ut;
public class _25ExceptionHandling {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int i = Ut.inputint();
		}catch(Exception e) {
			System.out.println("Sorry some error OCCURED while taking input. Error is: " + e);
		}

	}

}
