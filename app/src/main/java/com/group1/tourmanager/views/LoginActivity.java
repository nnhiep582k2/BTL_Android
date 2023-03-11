package com.group1.tourmanager.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.group1.tourmanager.R;

public class LoginActivity extends AppCompatActivity {
    // region Biến
    TextInputLayout layout_username;
    TextInputLayout layout_password;
    TextInputEditText eTxtUserName;
    TextInputEditText eTxtPassword;
    Button btnLogin;
    // endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Lấy ra các control bên file XML - nnhiep 09.03.2023
        layout_username = findViewById(R.id.layout_username);
        layout_password = findViewById(R.id.layout_password);
        eTxtUserName = findViewById(R.id.eTxtUserName);
        eTxtPassword = findViewById(R.id.eTxtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Sự kiện nhấp nút Đăng nhập - nnhiep 09.03.2023
        btnLogin.setOnClickListener(v -> {
            if (validateData()) {
                if (String.valueOf(eTxtUserName.getText()).equals("admin") && String.valueOf(eTxtPassword.getText()).equals("123")) {
                    // Correct - chuyển sang Main Activity
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("LoginState", true);
                    LoginActivity.this.startActivity(intent);
                } else {
                    // Incorrect
                    Toast.makeText(LoginActivity.this, LoginActivity.this.getResources().getString(R.string.login_failed), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Sự kiện blur ra ngoài edit text Username - nnhiep 11.03.2023
        eTxtUserName.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus) {
                checkUsername();
            }
        });

        // Sự kiện blur ra ngoài edit text Password - nnhiep 11.03.2023
        eTxtPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus) {
                checkPassword();
            }
        });
    }

    // Kiểm tra Username - nnhiep 11.03.2023
    private boolean checkUsername() {
        if (String.valueOf(eTxtUserName.getText()).isEmpty()) {
            layout_username.setError(this.getResources().getString(R.string.required));
            return false;
        } else {
            if (!String.valueOf(eTxtUserName.getText()).equals("admin")) {
                layout_username.setError(this.getResources().getString(R.string.incorrect_username));
                return false;
            } else {
                layout_username.setErrorEnabled(false);
                return true;
            }
        }
    }

    // Kiểm tra Password - nnhiep 11.03.2023
    private boolean checkPassword() {
        if (String.valueOf(eTxtPassword.getText()).isEmpty()) {
            layout_password.setError(this.getResources().getString(R.string.required));
            return false;
        } else {
            if (!String.valueOf(eTxtPassword.getText()).equals("123")) {
                layout_password.setError(this.getResources().getString(R.string.incorrect_password));
                return false;
            } else {
                layout_password.setErrorEnabled(false);
                return true;
            }
        }
    }

    // Hàm kiểm tra dữ liệu đầu vào - nnhiep 11.03.2023
    private boolean validateData() {
        boolean isValid;
        isValid = checkUsername();
        if (isValid) {
            isValid = checkPassword();
        }
        return isValid;
    }
}