package androiddadosortido.joaopedronunes.com.br.dadossortidoss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean rolar = true;
    ImageView image;
    TextView pontos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.idDice);
        pontos = findViewById(R.id.tPontos);
    }

    public void onReiniciar(View view) {
        rolar = true;
        pontos.setText("0");
        image.setImageResource(R.drawable.dice1);
    }

    public void onRolar(View view) {
        if(rolar){
            Random random = new Random();
            Integer rndP = random.nextInt(6);
            if(rndP==0){
                image.setImageResource(R.drawable.dice1);
            }else if(rndP==1){
                image.setImageResource(R.drawable.dice2);
            }else if(rndP==2){
                image.setImageResource(R.drawable.dice3);
            }else if(rndP==3){
                image.setImageResource(R.drawable.dice4);
            }else if(rndP==4){
                image.setImageResource(R.drawable.dice5);
            }else{
                image.setImageResource(R.drawable.dice6);
            }
            rndP++;
            rndP+=Integer.parseInt(String.valueOf(pontos.getText()));
            pontos.setText(rndP.toString());
        }

    }

    public void onParar(View view) {
        rolar = false;

    }

}
