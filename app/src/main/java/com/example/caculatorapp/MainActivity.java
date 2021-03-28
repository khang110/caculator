package com.example.caculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMultiply, btnSubtract,
            btnDivision, btnEqual, btnClear;
    TextView tvInput, tvOutput;
    String process="";

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnClear = findViewById(R.id.btnClear);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnPlus = findViewById(R.id.btnPlus);
        btnSubtract = findViewById(R.id.btnSubtraction);
        btnEqual = findViewById(R.id.btnEqual);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(tvInput.getText() + "");
                crunchifyDivision = true;
                tvInput.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(tvInput.getText() + "");
                crunchifyMultiplication = true;
                tvInput.setText(null);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput == null) {
                    tvInput.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvInput.getText() + "");
                    crunchifyAddition = true;
                    tvInput.setText(null);
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(tvInput.getText() + "");
                mSubtract = true;
                tvInput.setText(null);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(tvInput.getText() + "");

                if (crunchifyAddition == true) {
                    tvOutput.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    tvOutput.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    tvOutput.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    tvOutput.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });
    }
}