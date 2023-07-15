package edu.utec.practicalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText etUsuario;
    public EditText etPassword;
    public Button btnIngresar;

    //defino una clave que sera una variable constante
    public static final String EXTRA_MESSAGE = "edu.utec.practicalogin.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.txtUsuario);
        etPassword = findViewById(R.id.txtPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

       /* btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = etUsuario.getText().toString();
                String password = etPassword.getText().toString();

                //validar datos obligatorios
                if(usuario.isEmpty()){
                    String mensaje1 =  "Debe ingresar un nombre de Usuario";
                    etUsuario.setError(mensaje1);
                    showToast(mensaje1);
                } else if (password.isEmpty()) {
                    String mensaje2 =  "Debe ingresar un password de Usuario";
                    etPassword.setError(mensaje2);
                    showToast(mensaje2);
                } else if(password.length()<6){
                    String mensaje3 = "La password debe tener mas de 6 caracteres";
                    etPassword.setError(mensaje3);
                    showToast(mensaje3);
                } else {
                    showToast("El inicio de session fue exitoso para " + usuario);

                    Intent intent = new Intent(this,Bienvenida.class);
                    EditText EtUsuario = (EditText) findViewById(R.id.txtUsuario);
                    String usuarioLog = EtUsuario.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE,usuarioLog);
                    startActivity(intent);

                }

            }
        });
*/
    }
    // creo el metodo para el mensaje de Toast
    private void showToast(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }

    // Creo el metodo para enviar la informacion
     public void enviarUsuario(View view){

         String usuario = etUsuario.getText().toString();
         String password = etPassword.getText().toString();

         //validar datos obligatorios
         if(usuario.isEmpty()){
             String mensaje1 =  "Debe ingresar un nombre de Usuario";
             etUsuario.setError(mensaje1);
             showToast(mensaje1);
         } else if (password.isEmpty()) {
             String mensaje2 =  "Debe ingresar un password de Usuario";
             etPassword.setError(mensaje2);
             showToast(mensaje2);
         } else if(password.length()<6){
             String mensaje3 = "La password debe tener mas de 6 caracteres";
             etPassword.setError(mensaje3);
             showToast(mensaje3);
         } else {
             showToast("El inicio de session fue exitoso para " + usuario);

             Intent intent = new Intent(this,Bienvenida.class);
             EditText EtUsuario = (EditText) findViewById(R.id.txtUsuario);
             String usuarioLog = EtUsuario.getText().toString();
             intent.putExtra(EXTRA_MESSAGE,usuarioLog);
             startActivity(intent);

         }


    }

}