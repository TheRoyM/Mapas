package co.edu.unac.poo1.unidad2;

import co.edu.unac.poo1.clientes.Nacionalidad;
import co.edu.unac.poo1.relojes.RelojPulso;
import co.edu.unac.poo1.relojes.Smartwatch;

import java.time.LocalDate;
import java.util.*;

public class Unidad2 {
    private static List<RelojPulso> obtenerListaRelojs(){
        RelojPulso relojPulso1 = new RelojPulso("123a", "Q&Q", 120.000F, LocalDate.now(),"Acero",20.000F);
        RelojPulso relojPulso2 = new RelojPulso("123b", "Grand Sedquio", 120.000F, LocalDate.now(),"Cuero",30.000F);
        RelojPulso relojPulso3 = new RelojPulso("123c", "Rolex", 190.000F, LocalDate.now(),"Acero",90.000F);
        RelojPulso relojPulso4 = new RelojPulso("123d", "Gucci", 110.000F, LocalDate.now(),"Metal",40.000F);
        RelojPulso relojPulso5 = new RelojPulso("123e", "Tag Heuer", 150.000F, LocalDate.now(),"Plastico",50.000F);

        List<RelojPulso> listaRelojs = new LinkedList<>();
        listaRelojs.add(relojPulso1);
        listaRelojs.add(relojPulso2);
        listaRelojs.add(relojPulso3);
        listaRelojs.add(relojPulso4);
        listaRelojs.add(relojPulso5);


        return listaRelojs;
    }
    private static List<Smartwatch> obtenerListaSmart(){
        Smartwatch smartwatch1 = new Smartwatch("11a","Xiaomi",90.000F,LocalDate.now(),"caucho",14.000F,10.5,"Chayomixd");
        Smartwatch smartwatch2 = new Smartwatch("11b","Apple",900.000F,LocalDate.now(),"caucho",144.000F,11.5,"Apple");
        Smartwatch smartwatch3 = new Smartwatch("11c","Honor",50.000F,LocalDate.now(),"cuero",20.000F,12.5,"HonorX");
        Smartwatch smartwatch4 = new Smartwatch("11d","Huawei",80.000F,LocalDate.now(),"metal",35.000F,13.5,"Huaweytm");
        Smartwatch smartwatch5 = new Smartwatch("11e","Frutopl",90.000F,LocalDate.now(),"acero",25.000F,9.5,"Qwertxd");

        List<Smartwatch> listaSmartwatchs = new LinkedList<>();
        listaSmartwatchs.add(smartwatch1);
        listaSmartwatchs.add(smartwatch2);
        listaSmartwatchs.add(smartwatch3);
        listaSmartwatchs.add(smartwatch4);
        listaSmartwatchs.add(smartwatch5);

        return listaSmartwatchs;

    }

    /*public static void comprarRelojs(){
        RelojPulso relojPulso1 = new RelojPulso("123a", "Q&Q", 120.000F, LocalDate.now(),"Acero",20.000F);
        RelojPulso relojPulso2 = new RelojPulso("123b", "Grand Sedquio", 120.000F, LocalDate.now(),"Cuero",30.000F);
        RelojPulso relojPulso3 = new RelojPulso("123c", "Rolex", 190.000F, LocalDate.now(),"Acero",90.000F);
        RelojPulso relojPulso4 = new RelojPulso("123d", "Gucci", 110.000F, LocalDate.now(),"Metal",40.000F);
        RelojPulso relojPulso5 = new RelojPulso("123e", "Tag Heuer", 150.000F, LocalDate.now(),"Plastico",50.000F);

        List<RelojPulso> listaRelojs = new LinkedList<>();
        listaRelojs.add(relojPulso1);
        listaRelojs.add(relojPulso2);
        listaRelojs.add(relojPulso3);
        listaRelojs.add(relojPulso4);
        listaRelojs.add(relojPulso5);

        Smartwatch smartwatch1 = new Smartwatch("11a","Xiaomi",90.000F,LocalDate.now(),"caucho",14.000F,10.5,"Chayomixd");
        Smartwatch smartwatch2 = new Smartwatch("11b","Apple",900.000F,LocalDate.now(),"caucho",144.000F,11.5,"Apple");
        Smartwatch smartwatch3 = new Smartwatch("11c","Honor",50.000F,LocalDate.now(),"cuero",20.000F,12.5,"HonorX");
        Smartwatch smartwatch4 = new Smartwatch("11d","Huawei",80.000F,LocalDate.now(),"metal",35.000F,13.5,"Huaweytm");
        Smartwatch smartwatch5 = new Smartwatch("11e","Frutopl",90.000F,LocalDate.now(),"acero",25.000F,9.5,"Qwertxd");

        List<Smartwatch> listaSmartwatchs = new LinkedList<>();
        listaSmartwatchs.add(smartwatch1);
        listaSmartwatchs.add(smartwatch2);
        listaSmartwatchs.add(smartwatch3);
        listaSmartwatchs.add(smartwatch4);
        listaSmartwatchs.add(smartwatch5);

        Map<String, RelojPulso> listaFusionada = new TreeMap<>();
        for (RelojPulso relojPulso : listaRelojs){
            listaFusionada.put(relojPulso.getMarca(),relojPulso);
            listaFusionada.put(relojPulso.getMaterialPulso(),relojPulso);
            listaFusionada.put(relojPulso.getNumeroSerial(),relojPulso);
            listaFusionada.put(String.valueOf(relojPulso.getPrecioPulso()),relojPulso);
        }
        for (Smartwatch smartwatch : listaSmartwatchs){
            listaFusionada.put(smartwatch.getMarca(),smartwatch);
            listaFusionada.put(smartwatch.getMaterialPulso(),smartwatch);
            listaFusionada.put(String.valueOf(smartwatch.getPrecioPulso()),smartwatch);
        }
    }*/

    /*private static TreeMap<String, Object> fusionListas(List<RelojPulso> carritoRelojs){

        TreeMap<String, Object> listaFusionada = new TreeMap<>();
        for (RelojPulso relojPulso : obtenerListaRelojs()){
            listaFusionada.put(relojPulso.getMarca(),relojPulso);
            listaFusionada.put(relojPulso.getMaterialPulso(),relojPulso);
            listaFusionada.put(relojPulso.getNumeroSerial(),relojPulso);
        }
        for (Smartwatch smartwatch : obtenerListaSmart()){
            listaFusionada.put(smartwatch.getMarca(),smartwatch);
            listaFusionada.put(smartwatch.getMaterialPulso(),smartwatch);
        }
       return listaFusionada;
    }

    public static void preciosRelojss() {


        int opciones = 1;
        int totalCompra = 0;
        List<RelojPulso> carritoRelojs = new LinkedList<>();

        System.out.println("LISTA DE RELOJS Y SMARTWATCHS ");
        System.out.println("Cual es su nacionalidad?");
        Scanner entrada = new Scanner(System.in);
        Nacionalidad nacionalidades = Nacionalidad.valueOf(entrada.nextLine().toUpperCase());

        if (nacionalidades == Nacionalidad.COLOMBIANO) {
            System.out.println("Menú para clientes colombianos:");
            System.out.println("Comprar relojs ");

            fusionListas(carritoRelojs);
            System.out.println("Dijite el nombre del reloj que vas a comprar");
            String nombreReloj = entrada.nextLine();

            if (fusionListas(carritoRelojs).get(nombreReloj) != null){
                System.out.println(fusionListas(carritoRelojs).get(nombreReloj));
            }else {
                System.out.println("NO EXISTE U.U");
            }

        }else {
            System.out.println("SOLO PARA PERSONAL COLOMBIANO ");
        }

    }
    public static void carritoRelojs(){

        System.out.println("LISTA DE RELOJS Y SMARTWATCHS ");
        System.out.println("Cual es su nacionalidad?");
        Scanner entrada = new Scanner(System.in);
        Nacionalidad nacionalidades = Nacionalidad.valueOf(entrada.nextLine().toUpperCase());

        if (nacionalidades == Nacionalidad.COLOMBIANO) {
            System.out.println("Menú para clientes colombianos:");
            System.out.println("Comprar relojs ");

        }

    }*/

    public static void ventaRelojsColombia(){
        System.out.println("LISTA DE RELOJS Y SMARTWATCHS ");
        System.out.println("Cual es su nacionalidad?");
        Scanner entrada = new Scanner(System.in);
        Nacionalidad nacionalidades = Nacionalidad.valueOf(entrada.nextLine().toUpperCase());

        if (nacionalidades == Nacionalidad.COLOMBIANO) {
            System.out.println("Menú para clientes colombianos:");
            System.out.println("Comprar relojs ");
            carritocompra();
        }
    }

    public static void verMenuRelojes(List<RelojPulso> listaRelojPulso ){
        System.out.println("LISTA DE RELOJS Y SMARTWATCHS ");
        listaRelojPulso.sort(Comparator.comparing(RelojPulso ::getNumeroSerial).reversed());
        for (int i = 0; i < listaRelojPulso.size(); i++) {
            System.out.println((i + 1) + "---" );
            System.out.println("serie " + listaRelojPulso.get(i).getNumeroSerial() );
            System.out.println("costo " + listaRelojPulso.get(i).getPrecio() );
            System.out.println("marca " + listaRelojPulso.get(i).getMarca() );

        }

    }
    public static void verMenuSmartwachs (List<Smartwatch> listaSmartwhach ){
        listaSmartwhach.sort(Comparator.comparing(RelojPulso ::getNumeroSerial).reversed());
        for (int i = 0; i < listaSmartwhach.size(); i++) {
            System.out.println((i + 6) + "---" );
            System.out.println("serie " + listaSmartwhach.get(i).getNumeroSerial() );
            System.out.println("costo " + listaSmartwhach.get(i).getPrecio() );
            System.out.println("marca " + listaSmartwhach.get(i).getMarca() );

        }

    }

    public static void carritocompra(){

        ventaRelojsColombia();
        Float ValorCarrito = 0F;
        int OpcionMenu = 1;
        Scanner scanner = new Scanner(System.in);

        List<RelojPulso> List1RelojPulso = obtenerListaRelojs();
        List<Smartwatch> List1Smartwhach = obtenerListaSmart();
        System.out.println("LISTA DE RELOJS Y SMARTWATCHS ");
        System.out.println("Cual es su nacionalidad?");
        Scanner entrada = new Scanner(System.in);
        Nacionalidad nacionalidades = Nacionalidad.valueOf(entrada.nextLine().toUpperCase());

        if (nacionalidades == Nacionalidad.COLOMBIANO) {
            System.out.println("Menú para clientes colombianos:");
            do{
                carritocompra();
                System.out.println("Escoge el reloj que deseas comprar, cuando finalices tu compre digita el numero 0");
                verMenuRelojes(List1RelojPulso);
                verMenuSmartwachs(List1Smartwhach);
                OpcionMenu = scanner.nextInt();

                if(OpcionMenu >= 1 && OpcionMenu <= 5) {
                    ValorCarrito += List1RelojPulso.get(OpcionMenu -1 ).getPrecioPulso();
                }
                if (OpcionMenu >= 6 && OpcionMenu <= 10){
                    ValorCarrito += List1Smartwhach.get(OpcionMenu -6).getPrecio();

                }
                if (OpcionMenu == 0){
                    System.out.println("Haz finalizado tu compra ");
                }else {
                    System.out.println("Costo total de su compra " + ValorCarrito);
                }
            }while (OpcionMenu != 0);

            System.out.println("Costo total de su compra : " + ValorCarrito);

        }else {
            System.out.println("sapo");
        }



    }



}
