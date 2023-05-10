package co.edu.unac.poo1.unidad3;

import co.edu.unac.poo1.relojes.Reloj;
import co.edu.unac.poo1.relojes.RelojPulso;
import co.edu.unac.poo1.relojes.Smartwatch;

import java.time.LocalDate;
import java.util.*;

public class Unidad3 {
    private static List<RelojPulso> obtenerListaRelojs() {
        RelojPulso relojPulso1 = new RelojPulso("123a", "Q&Q", 120.000F, LocalDate.now(), "Acero", 20.000F);
        RelojPulso relojPulso2 = new RelojPulso("123b", "Grand Sedquio", 120.000F, LocalDate.now(), "Cuero", 30.000F);
        RelojPulso relojPulso3 = new RelojPulso("123c", "Rolex", 190.000F, LocalDate.now(), "Acero", 90.000F);
        RelojPulso relojPulso4 = new RelojPulso("123d", "Gucci", 110.000F, LocalDate.now(), "Metal", 40.000F);
        RelojPulso relojPulso5 = new RelojPulso("123e", "Tag Heuer", 150.000F, LocalDate.now(), "Plastico", 50.000F);

        List<RelojPulso> listaRelojs = new LinkedList<>();
        listaRelojs.add(relojPulso1);
        listaRelojs.add(relojPulso2);
        listaRelojs.add(relojPulso3);
        listaRelojs.add(relojPulso4);
        listaRelojs.add(relojPulso5);


        return listaRelojs;
    }

    public static void elejirRelojMapa() {
        Map<String, RelojPulso> mapaRelojs = new HashMap<>();
        for (RelojPulso relojPulso : obtenerListaRelojs()) {
            mapaRelojs.put(relojPulso.getMarca(), relojPulso);
            System.out.println(relojPulso);
        }

    }

    public static void relojsOrdenados() {

        Map<String, RelojPulso> mapaRelojs2 = new TreeMap<>();
        for (RelojPulso relojPulso : obtenerListaRelojs()) {
            mapaRelojs2.put(relojPulso.getMarca(), relojPulso);
        }
        List<RelojPulso> listaOrdenada = new LinkedList<>(mapaRelojs2.values());
        for (RelojPulso relojPulsoactual : listaOrdenada) {
            System.out.println(relojPulsoactual);
        }


    }

    public static void ordenarListaHasmap() {
        Map<String, RelojPulso> mapaRelojs22 = new HashMap<>();
        for (RelojPulso relojPulso : obtenerListaRelojs()) {
            mapaRelojs22.put(relojPulso.getMarca(), relojPulso);
        }
        System.out.println("lista ordenada");
        List<RelojPulso> listaOrdenadas = new LinkedList<>(mapaRelojs22.values());
        listaOrdenadas.sort(Comparator.comparing(Reloj::getMarca).reversed());
        for (RelojPulso relojPulso : listaOrdenadas) {
            System.out.println(relojPulso);
        }


    }

    //Punto 2 buscar un elemnto de una lista y agregarlo a un mapa
    public static void elementodeListaaMap() {
        Smartwatch smartwatch1 = new Smartwatch("11a", "Xiaomi", 90.000F, LocalDate.now(), "caucho", 14.000F, 10.5, "Chayomixd");
        Smartwatch smartwatch2 = new Smartwatch("11b", "Apple", 900.000F, LocalDate.now(), "caucho", 144.000F, 11.5, "Apple");
        Smartwatch smartwatch3 = new Smartwatch("11c", "Honor", 50.000F, LocalDate.now(), "cuero", 20.000F, 12.5, "HonorX");
        Smartwatch smartwatch4 = new Smartwatch("11d", "Huawei", 80.000F, LocalDate.now(), "metal", 35.000F, 13.5, "Huaweytm");
        Smartwatch smartwatch5 = new Smartwatch("11e", "Frutopl", 90.000F, LocalDate.now(), "acero", 25.000F, 9.5, "Qwertxd");
        Smartwatch smartwatch6 = new Smartwatch("11e", "Frutopl", 90.000F, LocalDate.now(), "acero", 25.000F, 9.5, "Qwertxd");

        List<Smartwatch> listaSmartwatchs = new LinkedList<>();
        listaSmartwatchs.add(smartwatch1);
        listaSmartwatchs.add(smartwatch2);
        listaSmartwatchs.add(smartwatch3);
        listaSmartwatchs.add(smartwatch4);
        listaSmartwatchs.add(smartwatch5);
        listaSmartwatchs.add(smartwatch6);

        Smartwatch buscarSmar = null;
        for (Smartwatch smartwatch : listaSmartwatchs) {
            if (smartwatch.getMarca().equals("Apple")) {
                buscarSmar = smartwatch;
            }
        }

        Map<String, Smartwatch> mapaSmar = new HashMap<>();
        mapaSmar.put("Apple", buscarSmar);
        System.out.println(buscarSmar);
    }


}