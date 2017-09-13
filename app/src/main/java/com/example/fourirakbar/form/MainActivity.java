package com.example.fourirakbar.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_nrp)
    EditText inputNRP;
    @BindView(R.id.input_institusi)
    EditText inputInstutusi;
    @BindView(R.id.input_jurusan)
    EditText inputJurusan;

    @BindView(R.id.simpan)
    Button simpanButton;

    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nrp)
    TextView hasilNRP;
    @BindView(R.id.hasil_institusi)
    TextView hasilInstitusi;
    @BindView(R.id.hasil_jurusan)
    TextView hasilJurusan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.simpan)
    public void btnClicked() {
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String nrp = inputNRP.getText().toString();
        hasilNRP.setText(nrp);
        String institusi = inputInstutusi.getText().toString();
        hasilInstitusi.setText(institusi);
        String jurusan = inputJurusan.getText().toString();
        hasilJurusan.setText(jurusan);
    }
}
