package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtMssv,editTuoi;
    RadioButton rdNam, rbNu;
    CheckBox cbDaBong, cbChoiGame;
    TextView tvTT,tvGT,tvST;
    Button btnLuu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        edtTen=findViewById(R.id.edtTen);
        edtMssv=findViewById(R.id.edtMssv);
        editTuoi=findViewById(R.id.edtTuoi);
        rbNu=findViewById(R.id.rbNu);
        rdNam=findViewById(R.id.rbNam);
        cbDaBong=findViewById(R.id.cbDaBong);
        cbChoiGame=findViewById(R.id.cbChoiGame);
        btnLuu=findViewById(R.id.btnLuu);
        tvTT=findViewById(R.id.tvTT);

        //xử lý nút lưu

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten= edtTen.getText().toString();
                String mssv= edtMssv.getText().toString();
                String tuoi= editTuoi.getText().toString();
                String gioitinh;
                if(rdNam.isChecked())
                {
                    gioitinh="Nam";
                }
                else gioitinh="Nữ";
                String sothich="";
                if(cbChoiGame.isChecked() && cbChoiGame.isChecked())
                {
                    sothich="Đá bóng, Chơi game";
                }
                else if (cbDaBong.isChecked()){
                    sothich="Đá bóng";
                }
                else sothich="Chơi game";
                tvTT.setText("Tôi tên: "+ten+"\n"+"Mssv: "+mssv+"\n"+"Tuổi: "+tuoi+"\n"+"Giới tính: "+gioitinh+"\n"+"Sở thích: "+sothich);

            }
        });

    }
}