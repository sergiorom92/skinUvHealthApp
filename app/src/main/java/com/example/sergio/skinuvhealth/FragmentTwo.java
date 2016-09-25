package com.example.sergio.skinuvhealth;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

        Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_two, container, false);
        ExpandableListView elv = (ExpandableListView) rootView.findViewById(R.id.list);
        elv.setAdapter(new SavedTabsListAdapter());

        return rootView;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "¿Por qué usar la App?", "UVA Y UVB", "Uso del bloqueador solar", "Cuáles bloqueadores son tóxicos" , "Índice UV"};

        private String[][] children = {
                { "Actualmente, el uso del protector solar está ampliamente extendido; se lo asocia a una amplia gama de propósitos, desde reducir el envejecimiento de la piel hasta disminuir el riesgo de cáncer de piel. Pero para la gran mayoría de protectores solares estas afirmaciones podrían no ser ciertas, de hecho muchos de éstos nos están causando daño. Los rayos UVB son la principal causa de quemadura solar, y se unen directamente al ADN provocando mutaciones precancerosas. Los rayos UVA penetran más profundamente en el tejido de la piel y son más responsables de generar radicales libres que podrían dañar el ADN y las células de la piel. Los protectores solares pueden ayudar a reducir el daño causado por los radicales libres asociados a los rayos UV al desviar la radiación de la piel, pero los ingredientes de los protectores solares pueden liberar sus propios radicales libres en el proceso." },
                { "La luz ultravioleta del sol se presenta en dos ondas largas – UVA y UVB. Es muy importante que entienda la diferencia entre ambos y los factores riesgosos de cada uno.Considere los rayos UVB como \"los buenos\", aunque por supuesto no podría olvidarse de los rayos UVA si se va exponer al sol. Los rayos UVB ayudan a su piel a obtener vitamina D.Los rayos UVA son considerados \"los malos\", debido a que penetran la piel más profundamente y causan más daños por los radicales libres. No solo eso, sino también los rayos UVA son constantes durante todas las horas de luz natural durante todo el año.En comparación, UVB son más bajos durante la mañana y la noche pero aumentan durante el mediodía.Por lo tanto, si usted sale por las mañanas o por las tardes, usted obtiene rayos UVA (malos) y no suficientes rayos UVB (buenos).Es más, ¿alguna vez ha recibido quemaduras solares durante un día nublado? Usted piensa que no necesita protegerse y termina arrepentido por no haberlo hecho. Así es como los rayos UVA trabajan. Pueden meterse atreves de las nubes y la contaminación dañándole la piel." },
                { "Limitar la exposición solar, el uso de vestimenta protectora y el uso de protectores solares 100% naturales sin químicos puede reducir sus riesgos de efectos dañinos del sol.Pero si no puede evitar los siguientes tres escenarios:\n" +
                        "1) Está obligado a los rayos solares directos por un largo tiempo, más de lo seguro\n" +
                        "2) recibe la luz solar intensa gradualmente \n" +
                        "3) Está en una situación donde el bloqueo solar con vestimentas estratégicas o sombrillas no es práctico\n" +
                        "Use el protector solar para ayudar a protegerse contra las quemaduras solares, sin embargo, tenga cuidado al aplicarse cualquier marca comercial. " },
                { "Tire su protector solar a la basura si contiene cualquier de estos químicos cuestionables:\n" +
                        "Acido para-amino benzoico…\n" +
                        "Octílico salicyclate…\n" +
                        "Avobenzone…\n" +
                        "Oxybenzone…\n" +
                        "Cinoxate…\n" +
                        "Padimate …\n" +
                        "Dioxybenzone…\n" +
                        "Phenylbenzimidazole…\n" +
                        "Homosalate…\n" +
                        "Sulisobenzone…\n" +
                        "Antranilato de mentilo…\n" +
                        "Trolamine salicyclate…\n" +
                        "Octocrylene…\n" +
                        "¡Químicos potencialmente dañinos tales como: dioxybenzone y oxybenzone son algunos de los generadores más potenciales de radicales libres conocidos por el hombre!Por lo tanto, si su protector solar contiene dioxybenzone, oxybenzone o algún otro químico que acabo de describir, le recomiendo altamente que cambie la formula por uno natural." },
                {"El índice UV solar mundial (IUV) es una medida de la intensidad de la radiación UV solar en la superficie terrestre. El índice se expresa como un valor superior a cero, y cuanto más alto, mayor es la probabilidad de lesiones cutáneas y oculares y menos tardan en producirse esas lesiones.\nEste instrumento debe utilizarse como parte integral de un programa para informar a la población sobre la protección solar y los riesgos de la radiación UV para la salud.\nLas recomendaciones de las campañas educativas deben subrayar que el riesgo de efectos adversos para la salud debidos a la exposición a la radiación UV es acumulativo, y que la exposición en la vida diaria puede ser tan importante como la que se produce durante las vacaciones en climas soleados.\nRECUERDE: Las cremas de protección solar no deben utilizarse para aumentar el tiempo de exposición al sol, sino para aumentar la protección cuando la exposición es inevitable. La protección que proporcionan depende en gran medida de si se aplican correctamente."}

        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(FragmentTwo.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setTextSize(25);
            textView.setTextColor(Color.parseColor("#FFFFFF"));

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(FragmentTwo.this.getActivity());



            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }
}
