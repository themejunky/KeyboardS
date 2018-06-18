package themejunky.com.keyboards;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity {

    private InputMethodManager mImm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select(View view) {
        invokeLanguageAndInputSettings();

    }

    void invokeLanguageAndInputSettings() {
        final Intent intent = new Intent();
        intent.setAction(Settings.ACTION_INPUT_METHOD_SETTINGS);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }

    void invokeInputMethodPicker() {
        // Invoke input method picker.
        mImm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        mImm.showInputMethodPicker();

    }

    public void select2(View view) {
        invokeInputMethodPicker();
    }
}
