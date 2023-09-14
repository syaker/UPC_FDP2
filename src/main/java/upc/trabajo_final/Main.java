package upc.trabajo_final;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        //Atributos para producto y Menú
        Comida producto;

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
        List<Comida> ListaA = new ArrayList<>();
        List<Comida> ListaB = new ArrayList<>();
        List<Comida> ListaC = new ArrayList<>();
        List<Comida> ListaD = new ArrayList<>();
        List<Comida> ListaE = new ArrayList<>();
        List<Comida> ListaF = new ArrayList<>();
        List<Comida> ListaG = new ArrayList<>();
        List<Comida> ListaH = new ArrayList<>();
        //----------------------------------


        //Creando menú
        //Desayunos de 8am a 1pm

        //DY01-PERUVIAN EGGS
        producto = new Comida ("PERUVIAN EGGS",26,new Date(),"Tortilla de salchicha huachana y chalaquita.","DY01","Huevos, salchicha huachana y chalaquita.");
        ListaA.add(producto);

        //DY02-AMERICANO
        producto = new Comida ("AMERICANO",23,new Date(),"Pan campesino, tocino y huevos a la inglesa.","DY02","Pan campesino, tocino y huevos.");
        ListaA.add(producto);

        //DY03-ACAI BOWL
        producto = new Comida ("ACAI BOWL",28,new Date(),"Con frutas de estación, granola y mantequilla de maní.","DY03","Frutas de estación, granola y mantequilla de maní.");
        ListaA.add(producto);

        //DY04-BELGIAN WAFFLES
        producto = new Comida ("BELGIAN WAFFLES",27,new Date(),"Con frutos de estación, miel y mantequilla de maní.","DY04","Frutos de estación, miel y mantequilla de maní.");
        ListaA.add(producto);

        //DY05-AVENA BOWL
        producto = new Comida ("AVENA BOWL",25,new Date(),"Con frutos de estación, leche de coco, leche de almendras y canela.","DY05","Frutos de estación, leche de coco, leche de almendras y canela");
        ListaA.add(producto);

        //DY06-TOSTONES RUE
        producto = new Comida ("TOSTONES RUE",26,new Date(),"Palta, ajonjolí y huevo pochado.","DY06","Palta, ajonjolí y huevo.");
        ListaA.add(producto);

        //DY07-HUEVOS BENEDCITINOS
        producto = new Comida ("HUEVOS BENEDCITINOS",29,new Date(),"Pan brioche, huevo pochado, tocino y salsa holandesa.","DY07","Pan brioche, huevo, tocino y salsa holandesa.");
        ListaA.add(producto);

        //DY08-TOSTADAS A LA FRANCHUTE
        producto = new Comida ("TOSTADAS A LA FRANCHUTE",28,new Date(),"Pan brioche, frutos del bosque, crema casera y miel de maple.","DY08","Pan brioche, frutos del bosque, crema casera y miel de maple.");
        ListaA.add(producto);

        //DY09-REVUELTOS DE LA CASA
        producto = new Comida ("REVUELTOS DE LA CASA",24,new Date(),"En tostones, palta y tomate cherry.","DY01","Tostones, palta y tomate cherry.");
        ListaA.add(producto);

        //Lista de seccion Desayuno
        menuTipoDesayuno = new MenuTipo("Desayuno ","De 8am a 1pm",ListaA);

        //===================================


        //Entradas 1pm
        //ET01-RONDA DE TAPAS
        producto = new Comida ("RONDA DE TAPAS",34,new Date(),"5 tapas varias del dia.","ET01","5 tapas varias del dia.");
        ListaB.add(producto);

        //ET02-TIRADITO DE CONCHAS
        producto = new Comida ("TIRADITO DE CONCHAS",38,new Date(),"Con crema de ají amarillo y camote.","ET02","Con crema de ají amarillo y camote.");
        ListaB.add(producto);

        //ET03-CHAMPIÑONES AL VINO
        producto = new Comida ("CHAMPIÑONES AL VINO",27,new Date(),"Maserado en vino tinto y aceite de romero.","ET03","Maserado en vino tinto y aceite de romero.");
        ListaB.add(producto);

        //ET04-CARPACCIO DE LOMO
        producto = new Comida ("CARPACCIO DE LOMO",38,new Date(),"Mostaza dijon, tostadas pan pita y alcaparras.","ET04","Mostaza dijon, tostadas pan pita y alcaparras.");
        ListaB.add(producto);

        //ET05-STRACCIATELLA
        producto = new Comida ("STRACCIATELLA",32,new Date(),"Tomates cberry conffitados, arúgula y pan campesino.","ET05","Tomates cberry conffitados, arúgula y pan campesino.");
        ListaB.add(producto);

        //ET06-LANGOSTINOS AL AJILLO
        producto = new Comida ("LANGOSTINOS AL AJILLO",37,new Date(),"Mantequilla negra, tomate cherry y pan campesino.","ET06","Mantequilla negra, tomate cherry y pan campesino.");
        ListaB.add(producto);

        //ET07-PASTEL DE CHOCLO
        producto = new Comida ("PASTEL DE CHOCLO",28,new Date(),"Clásico pastel con carne y notas picantes.","ET07","Clásico pastel con carne y notas picantes.");
        ListaB.add(producto);

        //ET08-TEQUEÑOS
        producto = new Comida ("TEQUEÑOS",24,new Date(),"Queso andino y guacamole.","ET08","Queso andino y guacamole.");
        ListaB.add(producto);

        //ET09-HUMMUS & VEGETALES
        producto = new Comida ("HUMMUS & VEGETALES",23,new Date(),"Apio, zanahorías y tostadas de pan pita.","ET09","Apio, zanahorías y tostadas de pan pita.");
        ListaB.add(producto);

        //ET10-PIZZA STRACIATELLA
        producto = new Comida ("PIZZA STRACIATELLA",56,new Date(),"Salsa de pesto, Straciatella y tomate cherry.","ET10","Salsa de pesto, Straciatella y tomate cherry.");
        ListaB.add(producto);

        //ET11-PIZZA PROSCIUTTO
        producto = new Comida ("PIZZA STRACIATELLA",56,new Date(),"Mozarella, prosciutto y cebolla caramelizada.","ET11","Mozarella, prosciutto y cebolla caramelizada.");
        ListaB.add(producto);

        //Lista de seccion Desayuno
        menuTipoEntradas = new MenuTipo("Entradas ","Apartir de la 1pm",ListaB);

        //===================================

        //Sanguches 24hrs
        //SG01-FRESH CAPRESE
        producto = new Comida ("FRESH CAPRESE",23,new Date(),"Tostón con pesto, mozarrella, tomate y pan campesino.","SG01","Tostón con pesto, mozarrella, tomate y pan campesino.");
        ListaC.add(producto);

        //SG02-BAGEL DE SALMÓN
        producto = new Comida ("BAGEL DE SALMÓN",29,new Date(),"Queso crema, kiuri, cebolla y salmón.","SG02","Queso crema, kiuri, cebolla y salmón.");
        ListaC.add(producto);

        //SG03-RUE MIXTO
        producto = new Comida ("RUE MIXTO",27,new Date(),"Jamon crocante, mozarrella fresca pickles encurtidos y cebolla caramelizada.","SG03","Jamon crocante, mozarrella fresca pickles encurtidos y cebolla caramelizada.");
        ListaC.add(producto);

        //SG04-PULLED PORK
        producto = new Comida ("PULLED PORK",29,new Date(),"Brioche ér úrqeuito desilachado.","SG04","Brioche ér úrqeuito desilachado.");
        ListaC.add(producto);

        //SG05-LOMO FINO
        producto = new Comida ("LOMO FINO",32,new Date(),"Lomo fino, gouda, champiñones y salsa mostaza en focaccia artesanal.","SG05","Lomo fino, gouda, champiñones y salsa mostaza en focaccia artesanal.");
        ListaC.add(producto);

        //SG06-POLLO CLÁSICO
        producto = new Comida ("POLLO CLÁSICO",24,new Date(),"Pollo en mayonesa, apio y palta.","SG06","Pollo en mayonesa, apio y palta.");
        ListaC.add(producto);

        //SG07-SHRIMP ROLL
        producto = new Comida ("SHRIMP ROLL",29,new Date(),"Langostinos en mayonesa siracha, togarasbi y palta en pan brioche.","SG07","TLangostinos en mayonesa siracha, togarasbi y palta en pan brioche.");
        ListaC.add(producto);

        //SG08-ROAST BEEF
        producto = new Comida ("ROAST BEEF",29,new Date(),"Arúgula, mostaza Dijon y alcaparras.","SG08","Arúgula, mostaza Dijon y alcaparras.");
        ListaC.add(producto);

        //Lista de seccion Desayuno
        menuTipoSanguches = new MenuTipo("Sanguches ","Todo el día",ListaC);

        //===================================

        //Fondos 1pm
        //FD01-POKE BOWL DE ATÚN
        producto = new Comida ("POKE BOWL DE ATÚN",36,new Date(),"Atún, quinua, pepino, zanahoria, palta en salsa acevichada.","FD01","Atún, quinua, pepino, zanahoria, palta en salsa acevichada.");
        ListaD.add(producto);

        //FD02-PEZ ESPADA PANADERO
        producto = new Comida ("POKE BOWL DE ATÚN",49,new Date(),"Pez espada, papas panaderas y vegetales.","FD02","Pez espada, papas panaderas y vegetales.");
        ListaD.add(producto);

        //FD03-CONFIT DE POLLO
        producto = new Comida ("CONFIT DE POLLO",43,new Date(),"Pure de papas y vegetales bebe.","FD03","Pure de papas y vegetales bebe.");
        ListaD.add(producto);

        //FD04-POLLO AL CURRY
        producto = new Comida ("POLLO AL CURRY",44,new Date(),"Casbews, durazno, huevo, cebolla china, salsa curry y arroz blanco.","FD04","Casbews, durazno, huevo, cebolla china, salsa curry y arroz blanco.");
        ListaD.add(producto);

        //FD05-PEPIÁN & ATÚN
        producto = new Comida ("PEPIÁN & ATÚN",48,new Date(),"Pepián de maiz dulce y medallón de atún en salsa anticuchera.","FD05","Pepián de maiz dulce y medallón de atún en salsa anticuchera.");
        ListaD.add(producto);

        //FD06-RUE BURGER
        producto = new Comida ("RUE BURGER",38,new Date(),"Tocino, cebolla caramelizada, cheddar, papas fritas y ensalada.","FD06","Tocino, cebolla caramelizada, cheddar, papas fritas y ensalada.");
        ListaD.add(producto);

        //FD07-ENSALADA CAESAR
        producto = new Comida ("ENSALADA CAESAR",33,new Date(),"Lechuga, parmesano, crutones, frutos secos, Pollo o Tocino.","FD07","Lechuga, parmesano, crutones, frutos secos, Pollo o Tocino.");
        ListaD.add(producto);

        //FD08-RISOTTO & ATÚN ORIENTAL
        producto = new Comida ("RISOTTO & ATÚN ORIENTAL",49,new Date(),"De aji amarillo, medallón de atún en salsa oriental.","FD08","ADe aji amarillo, medallón de atún en salsa oriental.");
        ListaD.add(producto);

        //FD09-PASTA PESTO
        producto = new Comida ("PASTA PESTO",38,new Date(),"Linguini al esto genovés, mozarella, tomate cherry y frutos secos.","FD09","Linguini al esto genovés, mozarella, tomate cherry y frutos secos.");
        ListaD.add(producto);

        //FD10-MAC N' CHEESE
        producto = new Comida ("MAC N' CHEESE",38,new Date(),"Conchiglie rigate, cheddar, crea de leche y tocino.","FD10","Conchiglie rigate, cheddar, crea de leche y tocino.");
        ListaD.add(producto);

        //FD11-PASTA FUNGHI PORCINI
        producto = new Comida ("PASTA FUNGHI PORCINI",46,new Date(),"Fettuccini en salsa porcini & portobello.","FD11","Fettuccini en salsa porcini & portobello.");
        ListaD.add(producto);

        //FD012-LOMO SALTADO
        producto = new Comida ("LOMO SALTADO",49,new Date(),"Lomo fino, cebolla, tomate, papas fritas y arroz.","FD12","Lomo fino, cebolla, tomate, papas fritas y arroz.");
        ListaD.add(producto);

        //Lista de seccion Desayuno
        menuTipoFondos = new MenuTipo("Fondos ","Apartir de la 1pm",ListaD);

        //===================================


        //Cafés 24hrs
        //CF01-EXPRESSO
        producto = new Comida ("EXPRESSO",8,new Date(),"--","CF01","--");
        ListaE.add(  producto);

        //CF02-AMERICANO
        producto = new Comida ("AMERICANO",8,new Date(),"--","CF02","--");
        ListaE.add(producto);

        //CF03-CAPUCCINO
        producto = new Comida ("CAPUCCINO",10,new Date(),"--","CF03","--");
        ListaE.add(producto);

        //CF04-FLAT WHITE
        producto = new Comida ("FLAT WHITE",14,new Date(),"--","CF04","--");
        ListaE.add(producto);

        //CF05-LATTE
        producto = new Comida ("LATTE",10,new Date(),"--","CF05","--");
        ListaE.add(producto);

        //CF06-PINK LATTE
        producto = new Comida ("PINK LATTE",15,new Date(),"Betabel Vanilla y Leche","CF06","Betabel Vanilla y Leche");
        ListaE.add(producto);

        //CF07-MOCACCINO
        producto = new Comida ("MOCACCINO",14,new Date(),"--","CF07","--");
        ListaE.add(producto);

        //CF08-IRISH COFFEE
        producto = new Comida ("IRISH COFFEE",18,new Date(),"--","CF08","--");
        ListaE.add(producto);

        //CF09-CAFÉ BOMBÓN
        producto = new Comida ("CAFÉ BOMBÓN",16,new Date(),"--","CF09","--");
        ListaE.add(producto);

        //CF10-AFFOGATTO
        producto = new Comida ("AFFOGATTO",18,new Date(),"--","CF10","--");
        ListaE.add(producto);

        //CF11-COLD BREW
        producto = new Comida ("COLD BREW",16,new Date(),"--","CF11","--");
        ListaE.add(producto);

        //CF12-MATCHA LATTE
        producto = new Comida ("MATCHA LATTE",15,new Date(),"Matcha, Leche","CF12","Matcha, Leche");
        ListaE.add(producto);

        //Lista de seccion Café
        menuTipoCafe = new MenuTipo("Cafés ","Todo el día",ListaE);


        //===================================


        //Especiales 24hrs
        //ES01-EXPRESSO
        producto = new Comida ("EXPRESSO",8,new Date(),"--","CF01","--");
        ListaE.add(  producto);








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
            for (Comida food: menuTipo.getPlatos()){
                i++;
                System.out.println(i + ". Código: " + food.getCoodigo() + " Plato: " + food.getNombre() + ". Descripción: " + food.getDescripcion() + " Ingredientes: " + food.getIngredientes() + " Precio: " + food.getPrecio() + "\n") ;
            }
        }



    }
}
