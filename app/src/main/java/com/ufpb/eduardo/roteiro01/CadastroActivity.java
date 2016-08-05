package com.ufpb.eduardo.roteiro01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText mNome, mSobrenome, mUsuario, mSenha;
    private Button mBtnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        mNome = (EditText)findViewById(R.id.nome);
        mSobrenome = (EditText)findViewById(R.id.sobrenome);
        mUsuario = (EditText)findViewById(R.id.usuario);
        mSenha = (EditText)findViewById(R.id.senha);
        mBtnCadastrar = (Button)findViewById(R.id.btnCadastrar);

        mBtnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrar();
            }
        });

    }

    private void cadastrar (){

        String nome,sobrenome, usuario, senha;
        nome = mNome.getText().toString();
        sobrenome = mSobrenome.getText().toString();
        usuario = mUsuario.getText().toString();
        senha = mSenha.getText().toString();



        if(!nome.isEmpty() && !sobrenome.isEmpty() && !usuario.isEmpty() && !senha.isEmpty()){
            Intent intent = new Intent(this,MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("usuario", usuario);
            intent.putExtras(bundle);
            startActivity(intent);


        }
        else{
            View focus;
            if(TextUtils.isEmpty(nome)){
                mNome.setError("Campo vazio!");
                focus = mNome;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(sobrenome)){
                mSobrenome.setError("Campo vazio!");
                focus = mSobrenome;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(usuario)){
                mUsuario.setError("Campo vazio!");
                focus = mUsuario;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(senha)){
                mSenha.setError("Campo vazio!");
                focus = mSenha;
                focus.requestFocus();
            }
        }
    }
}
