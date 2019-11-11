import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestInterfaceMap {

    public static void main(String[] args) {

        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(1, "João Delfino");
        mapNames.put(2, "Maria do Carmo");
        mapNames.put(3, "Claudinei Silva");

        System.out.println(mapNames);

        //resgatando o nome da posição 2
        System.out.println(mapNames.get(2));

        //Collection<integer> conjNomes = mapaNomes.keySet();

        Set<Entry<Integer, String>> set = mapNames.entrySet();
        Iterator it = set.iterator();

        System.out.println("Código\t\tValor");

        //getKey() - recupera a chave do mapa
        //getValue() - recupera o valor do mapa

        while(it.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + "\t\t"+entry.getValue());
        }
    }
}

