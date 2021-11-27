package ipn.cecyt9.calculadora_individual;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1, numero2, resultado;
    String operador;


    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickButtonCero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickButtonPi(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3.14159265");
    }

    public void onClickOperacionCapturaNumero1(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView){
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickResta(View miView){
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickMultiplicacion(View miView){
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickDivision(View miView){
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickEurPes(View miView){
        operador="europesos";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMegaByte(View miView){
        operador="megabyte";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickKmCm(View miView){
        operador="KiloCenti";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickConvertir(View miView){
        operador = ">";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickNew(View miView){
        operador="N";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickRaiz(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        onClickOperacionCapturaNumero1(miView);
        resultado =Math.sqrt(numero1);

        tv.setText(resultado.toString());
    }

    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero2 = Double.parseDouble(tv.getText().toString());

        try{

            if (operador.equals("+")){
                resultado = numero1 + numero2;
            }
            else
            if (operador.equals("-")) {
                resultado = numero1 - numero2;
            }
            else
            if (operador.equals("*")) {
                resultado = numero1 * numero2;
            }
            else
            if (operador.equals("/")) {
                resultado = numero1 / numero2;
            }
            else
            if (operador.equals("europesos")) {
                resultado = numero1 * 24.61;
            }
            else
            if (operador.equals("megabyte")) {
                resultado = numero1 * 1000000;
            }
            else
            if (operador.equals("KiloCenti")) {
                resultado = numero1 * 100000;
            }
            if(operador.equals(">")) {
                resultado = numero1 * 86000;
            }
            else
            if (operador.equals("N")) {
                numero1 = null;
                numero2 = null;
                resultado = null;
            }
            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText( this, "Numero Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}