package locators.com.utilities;

import com.google.common.base.Verify;

public class StringUtlilty {
    public static Verify getVerify(String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        return null;
    }
}
