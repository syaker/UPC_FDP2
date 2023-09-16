package upc.trabajo_final;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartaGeneral {
    public void mostrarCarta() {

        //Atributos para producto y Menú
        Producto producto;

        //Atributos para la sección
        MenuTipo menuTipoDesayuno;//ListaA
        MenuTipo menuTipoEntradas;//ListaB
        MenuTipo menuTipoSanguches;//ListaC
        MenuTipo menuTipoFondos;//ListaD
        MenuTipo menuTipoCafe;//ListaE
        MenuTipo menuTipoEspeciales;//ListaF
        MenuTipo menuTipoJugos;//ListaG
        MenuTipo menuTipoCocteles;//ListaH
        //----------------------------------
        List<Producto> ListaA = new ArrayList<>();
        List<Producto> ListaB = new ArrayList<>();
        List<Producto> ListaC = new ArrayList<>();
        List<Producto> ListaD = new ArrayList<>();
        List<Producto> ListaE = new ArrayList<>();
        List<Producto> ListaF = new ArrayList<>();
        List<Producto> ListaG = new ArrayList<>();
        List<Producto> ListaH = new ArrayList<>();
        //----------------------------------


        //Creando menú
        //Desayunos de 8am a 1pm

        //DY01-PERUVIAN EGGS
        producto = new Producto("PERUVIAN EGGS",26,new Date(),"Tortilla de salchicha huachana y chalaquita.","DY01");
        ListaA.add(producto);

        //DY02-AMERICANO
        producto = new Producto("AMERICANO",23,new Date(),"Pan campesino, tocino y huevos a la inglesa.","DY02");
        ListaA.add(producto);

        //DY03-ACAI BOWL
        producto = new Producto("ACAI BOWL",28,new Date(),"Con frutas de estación, granola y mantequilla de maní.","DY03");
        ListaA.add(producto);

        //DY04-BELGIAN WAFFLES
        producto = new Producto("BELGIAN WAFFLES",27,new Date(),"Con frutos de estación, miel y mantequilla de maní.","DY04");
        ListaA.add(producto);

        //DY05-AVENA BOWL
        producto = new Producto("AVENA BOWL",25,new Date(),"Con frutos de estación, leche de coco, leche de almendras y canela.","DY05");
        ListaA.add(producto);

        //DY06-TOSTONES RUE
        producto = new Producto("TOSTONES RUE",26,new Date(),"Palta, ajonjolí y huevo pochado.","DY06");
        ListaA.add(producto);

        //DY07-HUEVOS BENEDCITINOS
        producto = new Producto("HUEVOS BENEDCITINOS",29,new Date(),"Pan brioche, huevo pochado, tocino y salsa holandesa.","DY07");
        ListaA.add(producto);

        //DY08-TOSTADAS A LA FRANCHUTE
        producto = new Producto("TOSTADAS A LA FRANCHUTE",28,new Date(),"Pan brioche, frutos del bosque, crema casera y miel de maple.","DY08");
        ListaA.add(producto);

        //DY09-REVUELTOS DE LA CASA
        producto = new Producto("REVUELTOS DE LA CASA",24,new Date(),"En tostones, palta y tomate cherry.","DY01");
        ListaA.add(producto);

        //Lista de seccion Desayuno
        menuTipoDesayuno = new MenuTipo("Desayuno ","De 8am a 1pm",ListaA);

        //===================================


        //Entradas 1pm
        //ET01-RONDA DE TAPAS
        producto = new Producto("RONDA DE TAPAS",34,new Date(),"5 tapas varias del dia.","ET01");
        ListaB.add(producto);

        //ET02-TIRADITO DE CONCHAS
        producto = new Producto("TIRADITO DE CONCHAS",38,new Date(),"Con crema de ají amarillo y camote.","ET02");
        ListaB.add(producto);

        //ET03-CHAMPIÑONES AL VINO
        producto = new Producto("CHAMPIÑONES AL VINO",27,new Date(),"Maserado en vino tinto y aceite de romero.","ET03");
        ListaB.add(producto);

        //ET04-CARPACCIO DE LOMO
        producto = new Producto("CARPACCIO DE LOMO",38,new Date(),"Mostaza dijon, tostadas pan pita y alcaparras.","ET04");
        ListaB.add(producto);

        //ET05-STRACCIATELLA
        producto = new Producto("STRACCIATELLA",32,new Date(),"Tomates cberry conffitados, arúgula y pan campesino.","ET05");
        ListaB.add(producto);

        //ET06-LANGOSTINOS AL AJILLO
        producto = new Producto("LANGOSTINOS AL AJILLO",37,new Date(),"Mantequilla negra, tomate cherry y pan campesino.","ET06");
        ListaB.add(producto);

        //ET07-PASTEL DE CHOCLO
        producto = new Producto("PASTEL DE CHOCLO",28,new Date(),"Clásico pastel con carne y notas picantes.","ET07");
        ListaB.add(producto);

        //ET08-TEQUEÑOS
        producto = new Producto("TEQUEÑOS",24,new Date(),"Queso andino y guacamole.","ET08");
        ListaB.add(producto);

        //ET09-HUMMUS & VEGETALES
        producto = new Producto("HUMMUS & VEGETALES",23,new Date(),"Apio, zanahorías y tostadas de pan pita.","ET09");
        ListaB.add(producto);

        //ET10-PIZZA STRACIATELLA
        producto = new Producto("PIZZA STRACIATELLA",56,new Date(),"Salsa de pesto, Straciatella y tomate cherry.","ET10");
        ListaB.add(producto);

        //ET11-PIZZA PROSCIUTTO
        producto = new Producto("PIZZA STRACIATELLA",56,new Date(),"Mozarella, prosciutto y cebolla caramelizada.","ET11");
        ListaB.add(producto);

        //Lista de seccion Desayuno
        menuTipoEntradas = new MenuTipo("Entradas ","Apartir de la 1pm",ListaB);

        //===================================

        //Sanguches 24hrs
        //SG01-FRESH CAPRESE
        producto = new Producto("FRESH CAPRESE",23,new Date(),"Tostón con pesto, mozarrella, tomate y pan campesino.","SG01");
        ListaC.add(producto);

        //SG02-BAGEL DE SALMÓN
        producto = new Producto("BAGEL DE SALMÓN",29,new Date(),"Queso crema, kiuri, cebolla y salmón.","SG02");
        ListaC.add(producto);

        //SG03-RUE MIXTO
        producto = new Producto("RUE MIXTO",27,new Date(),"Jamon crocante, mozarrella fresca pickles encurtidos y cebolla caramelizada.","SG03");
        ListaC.add(producto);

        //SG04-PULLED PORK
        producto = new Producto("PULLED PORK",29,new Date(),"Brioche ér úrqeuito desilachado.","SG04");
        ListaC.add(producto);

        //SG05-LOMO FINO
        producto = new Producto("LOMO FINO",32,new Date(),"Lomo fino, gouda, champiñones y salsa mostaza en focaccia artesanal.","SG05");
        ListaC.add(producto);

        //SG06-POLLO CLÁSICO
        producto = new Producto("POLLO CLÁSICO",24,new Date(),"Pollo en mayonesa, apio y palta.","SG06");
        ListaC.add(producto);

        //SG07-SHRIMP ROLL
        producto = new Producto("SHRIMP ROLL",29,new Date(),"Langostinos en mayonesa siracha, togarasbi y palta en pan brioche.","SG07");
        ListaC.add(producto);

        //SG08-ROAST BEEF
        producto = new Producto("ROAST BEEF",29,new Date(),"Arúgula, mostaza Dijon y alcaparras.","SG08");
        ListaC.add(producto);

        //Lista de seccion Desayuno
        menuTipoSanguches = new MenuTipo("Sanguches ","Todo el día",ListaC);

        //===================================

        //Fondos 1pm
        //FD01-POKE BOWL DE ATÚN
        producto = new Producto("POKE BOWL DE ATÚN",36,new Date(),"Atún, quinua, pepino, zanahoria, palta en salsa acevichada.","FD01");
        ListaD.add(producto);

        //FD02-PEZ ESPADA PANADERO
        producto = new Producto("POKE BOWL DE ATÚN",49,new Date(),"Pez espada, papas panaderas y vegetales.","FD02");
        ListaD.add(producto);

        //FD03-CONFIT DE POLLO
        producto = new Producto("CONFIT DE POLLO",43,new Date(),"Pure de papas y vegetales bebe.","FD03");
        ListaD.add(producto);

        //FD04-POLLO AL CURRY
        producto = new Producto("POLLO AL CURRY",44,new Date(),"Casbews, durazno, huevo, cebolla china, salsa curry y arroz blanco.","FD04");
        ListaD.add(producto);

        //FD05-PEPIÁN & ATÚN
        producto = new Producto("PEPIÁN & ATÚN",48,new Date(),"Pepián de maiz dulce y medallón de atún en salsa anticuchera.","FD05");
        ListaD.add(producto);

        //FD06-RUE BURGER
        producto = new Producto("RUE BURGER",38,new Date(),"Tocino, cebolla caramelizada, cheddar, papas fritas y ensalada.","FD06");
        ListaD.add(producto);

        //FD07-ENSALADA CAESAR
        producto = new Producto("ENSALADA CAESAR",33,new Date(),"Lechuga, parmesano, crutones, frutos secos, Pollo o Tocino.","FD07");
        ListaD.add(producto);

        //FD08-RISOTTO & ATÚN ORIENTAL
        producto = new Producto("RISOTTO & ATÚN ORIENTAL",49,new Date(),"De aji amarillo, medallón de atún en salsa oriental.","FD08");
        ListaD.add(producto);

        //FD09-PASTA PESTO
        producto = new Producto("PASTA PESTO",38,new Date(),"Linguini al esto genovés, mozarella, tomate cherry y frutos secos.","FD09");
        ListaD.add(producto);

        //FD10-MAC N' CHEESE
        producto = new Producto("MAC N' CHEESE",38,new Date(),"Conchiglie rigate, cheddar, crea de leche y tocino.","FD10");
        ListaD.add(producto);

        //FD11-PASTA FUNGHI PORCINI
        producto = new Producto("PASTA FUNGHI PORCINI",46,new Date(),"Fettuccini en salsa porcini & portobello.","FD11");
        ListaD.add(producto);

        //FD012-LOMO SALTADO
        producto = new Producto("LOMO SALTADO",49,new Date(),"Lomo fino, cebolla, tomate, papas fritas y arroz.","FD12");
        ListaD.add(producto);

        //Lista de seccion Desayuno
        menuTipoFondos = new MenuTipo("Fondos ","Apartir de la 1pm",ListaD);

        //===================================


        //Cafés 24hrs
        //CF01-EXPRESSO
        producto = new Producto("EXPRESSO",8,new Date(),"--","CF01");
        ListaE.add(  producto);

        //CF02-AMERICANO
        producto = new Producto("AMERICANO",8,new Date(),"--","CF02");
        ListaE.add(producto);

        //CF03-CAPUCCINO
        producto = new Producto("CAPUCCINO",10,new Date(),"--","CF03");
        ListaE.add(producto);

        //CF04-FLAT WHITE
        producto = new Producto("FLAT WHITE",14,new Date(),"--","CF04");
        ListaE.add(producto);

        //CF05-LATTE
        producto = new Producto("LATTE",10,new Date(),"--","CF05");
        ListaE.add(producto);

        //CF06-PINK LATTE
        producto = new Producto("PINK LATTE",15,new Date(),"Betabel Vanilla y Leche","CF06");
        ListaE.add(producto);

        //CF07-MOCACCINO
        producto = new Producto("MOCACCINO",14,new Date(),"--","CF07");
        ListaE.add(producto);

        //CF08-IRISH COFFEE
        producto = new Producto("IRISH COFFEE",18,new Date(),"--","CF08");
        ListaE.add(producto);

        //CF09-CAFÉ BOMBÓN
        producto = new Producto("CAFÉ BOMBÓN",16,new Date(),"--","CF09");
        ListaE.add(producto);

        //CF10-AFFOGATTO
        producto = new Producto("AFFOGATTO",18,new Date(),"--","CF10");
        ListaE.add(producto);

        //CF11-COLD BREW
        producto = new Producto("COLD BREW",16,new Date(),"--","CF11");
        ListaE.add(producto);

        //CF12-MATCHA LATTE
        producto = new Producto("MATCHA LATTE",15,new Date(),"Matcha, Leche","CF12");
        ListaE.add(producto);

        //Lista de seccion Café
        menuTipoCafe = new MenuTipo("Cafés ","Todo el día",ListaE);


        //===================================


        //Especiales 24hrs
        //ES01-EXPRESSO
        producto = new Producto("EXPRESSO",8,new Date(),"--","CF01");
        ListaE.add(producto);








        //Carta General - Lista de Secciones
        List<MenuTipo> listaMenus = new ArrayList<>();
        listaMenus.add(menuTipoDesayuno);
        listaMenus.add(menuTipoEntradas);
        listaMenus.add(menuTipoSanguches);
        listaMenus.add(menuTipoFondos);
        listaMenus.add(menuTipoCafe);






        //===================================
        //IMPRESION
        //===================================


        System.out.println();
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("                   CARTA GENERAL");
        System.out.println("=====================================================\n");


        for (MenuTipo menuTipo: listaMenus) {
            System.out.println("------------------------------------------------------");
            System.out.println("            " + menuTipo.getNombreCarta() + " - " + menuTipo.getHorario());
            System.out.println("------------------------------------------------------\n");

            int i = 0;
            for (Producto food: menuTipo.getPlatos()){
                i++;
                System.out.println(i + ". Código: " + food.getCoodigo() + " Plato: " + food.getNombre() + ". Descripción: " + food.getDescripcion() + " Precio: " + food.getPrecio() + "\n") ;
            }
        }


    }
}
