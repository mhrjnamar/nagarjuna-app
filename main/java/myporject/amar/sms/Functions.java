package myporject.amar.sms;

import android.support.design.widget.TextInputEditText;

/**
 * Created by User on 1/30/2017.
 */

public class Functions {

    public static void showError(TextInputEditText et, String msg){
        et.requestFocus();
        et.setError(msg);
    }

    public static String getText(TextInputEditText et){
        return et.getText().toString().trim();
    }
}
