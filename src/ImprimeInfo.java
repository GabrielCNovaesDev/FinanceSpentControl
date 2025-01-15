import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImprimeInfo {
    List<String> elementosAlinhados = new ArrayList<>();
    String elementoDesalinhado;

    public void ImprimeValores(List<String> lista1, List<Integer> lista2){
        System.out.println("***************");
        System.out.println("COMPRAS REALIZADAS:");
        for(int i = 0;i < lista1.size();i++){
            elementoDesalinhado = (lista1.get(i) + " - " + lista2.get(i));
            elementosAlinhados.add(elementoDesalinhado);
        }
        Collections.sort(elementosAlinhados);
        for (String elementosAlinhado : elementosAlinhados) {
            System.out.println(elementosAlinhado);
        }
        System.out.println("***************");
    }
    //Comentário para amanhã
    //Vou colocar o comando de print como uma String e tentar fazer um override no metodo sort do colections para
    //reordenar os valores das compras realizadas
}
