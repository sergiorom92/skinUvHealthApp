package com.example.sergio.skinuvhealth;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentThree extends Fragment {

    ImageView imagen;
    TextView textos;
    int indexImg = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_three, container, false);
        final Integer[] images = {
                R.drawable.pik1,
                R.drawable.pik2,
                R.drawable.pik3,
                R.drawable.pik4,
                R.drawable.pik5,
                R.drawable.pik6,
                R.drawable.pik7,
                R.drawable.pik8,
                R.drawable.pik9,
                R.drawable.pik10,

        };

        final String[] descText = {
                "Dormir es vital para tu piel, ya que ayuda a que esta se recupere del daño sufrido durante todo el día, ademas previene posibles enfermedades relacionadas a ella.",
                "El tomar agua es primordial para tu salud, ya que mantiene en tu cuerpo los niveles de humedad recomendables, ademas que ayuda a tener la piel joven y tersa.",
                "Una alimentación equilibrada ayuda a una buena salud de la piel, elige una dieta con altos contenidos de fibra, vitamina E,etc..",
                "Cuando haces ejercicio, incrementas el flujo sanguíneo hacia la piel, lo que implica que ésta reciba de manera óptima los nutrientes y vitaminas esenciales. Por otra parte el ejercicio tonifica tus músculos, lo que ayuda a darle forma a tu piel.\n",
                "Mantener los niveles de estrés altos hace al cuerpo producir hormonas de estrés, los cuales agotan su cuerpo y sus emociones. evitar estas situaciones es vital para una buena salud mental y por consiguiente una buena salud dermatologica.",
                "Las mascaras o los masajes exfoliantes contienen partículas que favorecen el proceso de renovación celular sin agredir a la epidermis. Algunos contienen ácidos procedentes de algunas frutas que ayudan a eliminar las células muertas de la piel.\n",
                "El acto de quitar tu maquillaje remueve las bacterias que el rostro acumula durante el día de simples cosas como tocarte la cara con las manos.  Dejar que esas bacterias se asienten en el rostro ocasionará acné y tu piel se verá poco saludable.\n",
                "Una de las zonas mas sensibles del rostro son los labios, mantenerlos húmedos y bien cuidados da una apariencia mas joven y reluciente.",
                "El humo del tabaco seca tu piel, a la vez que constriñe los vasos sanguíneos y, por lo tanto, la cantidad de sangre que llega a la piel, privándola de nutrientes esenciales, Otros malos hábitos como el comer mal y tomar demasiado alcohol hace que tu organismo se deteriore y por lo tanto no nutra correctamente la piel. \n",
                "Presta mucha atención a los niveles de radiación solar de tu zona, ya que estos influyen en la cantidad de rayos UVA y UVB que penetran en tu piel, una observación constante de este indice te ayudara a realizar acciones cotidianas que disminuyan la posibilidad de contraer enfermedades relacionadas a ella. Tal como nosotros te ayudamos con esta aplicación. \n"
        };


        imagen = (ImageView) rootView.findViewById(R.id.imageView4);
        textos = (TextView) rootView.findViewById(R.id.textDescripcion);
        imagen.setImageResource(images[0]);
        textos.setText(descText[0]);
        ImageView left = (ImageView) rootView.findViewById(R.id.imageView5);
        ImageView right = (ImageView) rootView.findViewById(R.id.imageView6);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(indexImg > 0){
                    indexImg--;
                    imagen.setImageResource(images[indexImg]);
                    textos.setText(descText[indexImg]);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(indexImg < images.length-1){
                    indexImg++;
                    imagen.setImageResource(images[indexImg]);
                    textos.setText(descText[indexImg]);
                }
            }
        });

        return rootView;
    }
}
