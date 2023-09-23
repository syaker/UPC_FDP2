package upc.trabajo_final;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CartaGeneral carta = new CartaGeneral();

            //Categorías
            SeccionCarta seccionCartaDesayuno;
            seccionCartaDesayuno = new SeccionCarta("Desayunos","de 8am a 1pm");
            SeccionCarta seccionCartaEntradas;
            seccionCartaEntradas = new SeccionCarta("Entradas","1pm");
            SeccionCarta seccionCartaSanguches = new SeccionCarta("Sanguches","24hrs");
            SeccionCarta seccionCartaFondos = new SeccionCarta("Fondos","1pm");
            SeccionCarta seccionCartaCafes = new SeccionCarta("Cafés","24hrs");
            SeccionCarta seccionCartaEspeciales = new SeccionCarta("Especiales","24hrs");
            SeccionCarta seccionCartaCocteles = new SeccionCarta("Cócteles Clásicos","24hrs");
            SeccionCarta seccionCartaJugos = new SeccionCarta("Jugos y Frios","24hrs");
            SeccionCarta seccionCartaAutor = new SeccionCarta("Cócteles de Autor","24hrs");
            SeccionCarta seccionCartaVinos = new SeccionCarta("Vinos","24hrs");



            //Platos
            //Desayunos

            //DY01-PERUVIAN EGGS
            carta.registrarProducto("DY01","PERUVIAN EGGS","Tortilla de salchicha huachana y chalaquita.",seccionCartaDesayuno, 26,new Date());

            //DY02-AMERICANO
            carta.registrarProducto("DY02","AMERICANO","Pan campesino, tocino y huevos a la inglesa.",seccionCartaDesayuno,23,new Date());

            //DY03-ACAI BOWL
            carta.registrarProducto("DY03","ACAI BOWL","Con frutas de estación, granola y mantequilla de maní.",seccionCartaDesayuno,28,new Date());

            //DY04-BELGIAN WAFFLES
            carta.registrarProducto("DY04","BELGIAN WAFFLES","Con frutos de estación, miel y mantequilla de maní.",seccionCartaDesayuno,27,new Date());

            //DY05-AVENA BOWL
            carta.registrarProducto("DY05","AVENA BOWL","Con frutos de estación, leche de coco, leche de almendras y canela.",seccionCartaDesayuno,25,new Date());

            //DY06-TOSTONES RUE
            carta.registrarProducto("DY06", "TOSTONES RUE","Palta, ajonjolí y huevo pochado.",seccionCartaDesayuno,26,new Date());

            //DY07-HUEVOS BENEDCITINOS
            carta.registrarProducto("DY07","HUEVOS BENEDCITINOS","Pan brioche, huevo pochado, tocino y salsa holandesa.",seccionCartaDesayuno,29,new Date());

            //DY08-TOSTADAS A LA FRANCHUTE
            carta.registrarProducto("DY08","TOSTADAS A LA FRANCHUTE","Pan brioche, frutos del bosque, crema casera y miel de maple.", seccionCartaDesayuno, 28,new Date());

            //DY09-REVUELTOS DE LA CASA
            carta.registrarProducto("DY01","REVUELTOS DE LA CASA","En tostones, palta y tomate cherry.",seccionCartaDesayuno,24,new Date());


            //Entradas

            //ET01-RONDA DE TAPAS
            carta.registrarProducto("ET01","RONDA DE TAPAS","5 tapas varias del dia.",seccionCartaEntradas,34,new Date());

            //ET02-TIRADITO DE CONCHAS
            carta.registrarProducto("ET02","TIRADITO DE CONCHAS","Con crema de ají amarillo y camote.",seccionCartaEntradas,38,new Date());

            //ET03-CHAMPIÑONES AL VINO
            carta.registrarProducto("ET03","CHAMPIÑONES AL VINO","Maserado en vino tinto y aceite de romero.",seccionCartaEntradas,27,new Date());

            //ET04-CARPACCIO DE LOMO
            carta.registrarProducto("ET04","CARPACCIO DE LOMO","Mostaza dijon, tostadas pan pita y alcaparras.",seccionCartaEntradas,38,new Date());

            //ET05-STRACCIATELLA
            carta.registrarProducto("ET05","STRACCIATELLA","Tomates berry confitados, arúgula y pan campesino.",seccionCartaEntradas,32,new Date());

            //ET06-LANGOSTINOS AL AJILLO
            carta.registrarProducto("ET06","LANGOSTINOS AL AJILLO","Mantequilla negra, tomate cherry y pan campesino.",seccionCartaEntradas,37, new Date());

            //ET07-PASTEL DE CHOCLO
            carta.registrarProducto("ET07","PASTEL DE CHOCLO","Clásico pastel con carne y notas picantes.",seccionCartaEntradas,28,new Date());

            //ET08-TEQUEÑOS
            carta.registrarProducto("ET08","TEQUEÑOS","Queso andino y guacamole.",seccionCartaEntradas,24,new Date());

            //ET09-HUMMUS & VEGETALES
            carta.registrarProducto("ET09","HUMMUS & VEGETALES","Apio, zanahorías y tostadas de pan pita.",seccionCartaEntradas,23,new Date());

            //ET10-PIZZA STRACIATELLA
            carta.registrarProducto("ET10","PIZZA STRACIATELLA","Salsa de pesto, Straciatella y tomate cherry.",seccionCartaEntradas,56,new Date());

            //ET11-PIZZA PROSCIUTTO
            carta.registrarProducto("ET11","PIZZA STRACIATELLA","Mozarella, prosciutto y cebolla caramelizada.",seccionCartaEntradas,56,new Date());


            //Sanguches

            //SG01-FRESH CAPRESE
            carta.registrarProducto("SG01","FRESH CAPRESE","Tostón con pesto, mozarrella, tomate y pan campesino.",seccionCartaSanguches,23,new Date());

            //SG02-BAGEL DE SALMÓN
            carta.registrarProducto("SG02","BAGEL DE SALMÓN","Queso crema, kiuri, cebolla y salmón.",seccionCartaSanguches,29,new Date());

            //SG03-RUE MIXTO
            carta.registrarProducto("SG03","RUE MIXTO","Jamon crocante, mozarrella fresca pickles encurtidos y cebolla caramelizada.",seccionCartaSanguches,27,new Date());

            //SG04-PULLED PORK
            carta.registrarProducto("SG04","PULLED PORK","Brioche ér úrqeuito desilachado.",seccionCartaSanguches,29,new Date());

            //SG05-LOMO FINO
            carta.registrarProducto("SG05","LOMO FINO","Lomo fino, gouda, champiñones y salsa mostaza en focaccia artesanal.",seccionCartaSanguches,32,new Date());

            //SG06-POLLO CLÁSICO
            carta.registrarProducto("SG06","POLLO CLÁSICO","Pollo en mayonesa, apio y palta.",seccionCartaSanguches,24,new Date());

            //SG07-SHRIMP ROLL
            carta.registrarProducto("SG07","SHRIMP ROLL","Langostinos en mayonesa siracha, togarasbi y palta en pan brioche.",seccionCartaSanguches,29,new Date());

            //SG08-ROAST BEEF
            carta.registrarProducto("SG08","ROAST BEEF","Arúgula, mostaza Dijon y alcaparras.",seccionCartaSanguches,29,new Date());


            //Fondos

            //FD01-POKE BOWL DE ATÚN
            carta.registrarProducto("FD01","POKE BOWL DE ATÚN","Atún, quinua, pepino, zanahoria, palta en salsa acevichada.",seccionCartaFondos,36,new Date());

            //FD02-PEZ ESPADA PANADERO
            carta.registrarProducto("FD02","POKE BOWL DE ATÚN","Pez espada, papas panaderas y vegetales.",seccionCartaFondos,49,new Date());

            //FD03-CONFIT DE POLLO
            carta.registrarProducto("FD03","CONFIT DE POLLO","Pure de papas y vegetales bebe.",seccionCartaFondos,43,new Date());

            //FD04-POLLO AL CURRY
            carta.registrarProducto("FD04","POLLO AL CURRY","Casbews, durazno, huevo, cebolla china, salsa curry y arroz blanco.",seccionCartaFondos,44,new Date());

            //FD05-PEPIÁN & ATÚN
            carta.registrarProducto("FD05","PEPIÁN & ATÚN","Pepián de maiz dulce y medallón de atún en salsa anticuchera.",seccionCartaFondos,48,new Date());

            //FD06-RUE BURGER
            carta.registrarProducto("FD06","RUE BURGER","Tocino, cebolla caramelizada, cheddar, papas fritas y ensalada.",seccionCartaFondos,38,new Date());

            //FD07-ENSALADA CAESAR
            carta.registrarProducto("FD07","ENSALADA CAESAR","Lechuga, parmesano, crutones, frutos secos, Pollo o Tocino.",seccionCartaFondos,33,new Date());

            //FD08-RISOTTO & ATÚN ORIENTAL
            carta.registrarProducto("FD08","RISOTTO & ATÚN ORIENTAL","De aji amarillo, medallón de atún en salsa oriental.",seccionCartaFondos,49,new Date());

            //FD09-PASTA PESTO
            carta.registrarProducto("FD09","PASTA PESTO","Linguini al esto genovés, mozarella, tomate cherry y frutos secos.",seccionCartaFondos,38,new Date());

            //FD10-MAC N' CHEESE
            carta.registrarProducto("FD10","MAC N' CHEESE","Conchiglie rigate, cheddar, crea de leche y tocino.",seccionCartaFondos,38,new Date());

            //FD11-PASTA FUNGHI PORCINI
            carta.registrarProducto("FD11","PASTA FUNGHI PORCINI","Fettuccini en salsa porcini & portobello.",seccionCartaFondos,46,new Date());

            //FD012-LOMO SALTADO
            carta.registrarProducto("FD12","LOMO SALTADO","Lomo fino, cebolla, tomate, papas fritas y arroz.",seccionCartaFondos,49,new Date());



            //Cafés

            //CF01-EXPRESSO
            carta.registrarProducto("CF01","EXPRESSO","--",seccionCartaCafes,8,new Date());

            //CF02-AMERICANO
            carta.registrarProducto("CF02","AMERICANO","--",seccionCartaCafes,8,new Date());

            //CF03-CAPUCCINO
            carta.registrarProducto("CF03","CAPUCCINO","--",seccionCartaCafes,10,new Date());

            //CF04-FLAT WHITE
            carta.registrarProducto("CF04","FLAT WHITE","--",seccionCartaCafes,14,new Date());

            //CF05-LATTE
            carta.registrarProducto("CF05","LATTE","--",seccionCartaCafes,10,new Date());

            //CF06-PINK LATTE
            carta.registrarProducto("CF06","PINK LATTE","Betabel Vanilla y Leche",seccionCartaCafes,15,new Date());

            //CF07-MOCACCINO
            carta.registrarProducto("CF07","MOCACCINO","--",seccionCartaCafes,14,new Date());

            //CF08-IRISH COFFEE
            carta.registrarProducto("CF08","IRISH COFFEE","--",seccionCartaCafes,18,new Date());

            //CF09-CAFÉ BOMBÓN
            carta.registrarProducto("CF09","CAFÉ BOMBÓN","--",seccionCartaCafes,16,new Date());

            //CF10-AFFOGATTO
            carta.registrarProducto("CF10","AFFOGATTO","--",seccionCartaCafes,18,new Date());

            //CF11-COLD BREW
            carta.registrarProducto("CF11","COLD BREW","--",seccionCartaCafes,16,new Date());

            //CF12-MATCHA LATTE
            carta.registrarProducto("CF12","MATCHA LATTE","Matcha, Leche",seccionCartaCafes,15,new Date());


            //Especiales

            //ES01 - LIMONADA RUE
            carta.registrarProducto("ES01","LIMONADA RUE","Jamaica y Maracuyá",seccionCartaEspeciales,14,new Date());

            //ES02 - ICE - TEA
            carta.registrarProducto("ES02","LIMONADA RUE","Clasico Té Helado",seccionCartaEspeciales,16,new Date());

            //ES03 - FRAPPÉ
            carta.registrarProducto("ES03","FRAPPÉ","--",seccionCartaEspeciales,18,new Date());

            //ES04 - LIMONADA RUE
            carta.registrarProducto("ES04","LIMONADA RUE","Jamaica y Maracuyá",seccionCartaEspeciales,14,new Date());

            //ES05 - INFUSIONES
            carta.registrarProducto("ES05","INFUSIONES","--",seccionCartaEspeciales,11,new Date());


            //Cocteles Clásicos

            //CC01 - GIN TONIC
            carta.registrarProducto("CC01","GIN TONIC","Aromatizado con Romero, Pimienta Rosa y Twist de Limón",seccionCartaCocteles,32,new Date());

            //CC02 - MOSCOW MULE
            carta.registrarProducto("CC02","MOSCOW MULE","--",seccionCartaCocteles,32,new Date());

            //CC03 - CHILCANO CLÁSICO
            carta.registrarProducto("CC03","CHILCANO CLÁSICO","--",seccionCartaCocteles,24,new Date());

            //CC04 - CHILCANO DE MARACUYÁ
            carta.registrarProducto("CC04","CHILCANO DE MARACUYÁ","--",seccionCartaCocteles,26,new Date());

            //CC05 - TINTO DE VERANO
            carta.registrarProducto("CC05","TINTO DE VERANO","Vino Argentino, Vermout Rosso, Zumo de Naranja, Limón y Ginger Ale",seccionCartaCocteles,24,new Date());

            //CC06 - APERAL SPRITE
            carta.registrarProducto("CC06","APERAL SPRITE","--",seccionCartaCocteles,29,new Date());

            //CC07 - PISCO SOUR
            carta.registrarProducto("CC07","PISCO SOUR","--",seccionCartaCocteles,29,new Date());

            //CC08 - MARACUYÁ SOUR
            carta.registrarProducto("CC08","MARACUYÁ SOUR","--",seccionCartaCocteles,32,new Date());

            //CC09 - NEGRONI
            carta.registrarProducto("CC01","GIN TONIC","--",seccionCartaCocteles,33,new Date());

            //CC10 - PINK SKY
            carta.registrarProducto("CC01","GIN TONIC","Vodka, Naranja y Pink Soda",seccionCartaCocteles,30,new Date());

            //CC11 - CARAJILLO
            carta.registrarProducto("CC11","CARAJILLO","Aromatizado con Romero, Pimienta Rosa y Twist de Limón",seccionCartaCocteles,31,new Date());

            //CC12 - MIMOSA
            carta.registrarProducto("CC12","MIMOSA","Espumante y Zumo de Naranja",seccionCartaCocteles,26,new Date());


            //Jugos y frios

            //JF01 - SODAS ITALIANAS
            carta.registrarProducto("JF01","SODAS ITALIANAS","--",seccionCartaJugos,15,new Date());

            //JF02 - FRUTOS ROJOS
            carta.registrarProducto("JF02","FRUTOS ROJOS","Freesa, arandanos y frambuesas.",seccionCartaJugos,17,new Date());

            //JF03 - DETOX ROJO
            carta.registrarProducto("JF03","DETOX ROJO","Fresa, betabel, zanahoria y piña.",seccionCartaJugos,16,new Date());

            //JF04 - DETOX VERDE
            carta.registrarProducto("JF04","DETOX VERDE","Manzana, perejil, platano, pepino y jengibre.",seccionCartaJugos,16,new Date());

            //JF05 - NATURALES
            carta.registrarProducto("JF05","NATURALES","--",seccionCartaJugos,14,new Date());

            //JF06 - JUGO MIX
            carta.registrarProducto("JF06","JUGO MIX","Piña, fresa y naranja.",seccionCartaJugos,16,new Date());

            //JF07 - LIMONADAS
            carta.registrarProducto("JF07","LIMONADAS","--",seccionCartaJugos,12,new Date());

            //JF08 - GASEOSAS
            carta.registrarProducto("JF08","GASEOSAS","--",seccionCartaJugos,8.5,new Date());

            //JF09 - AGUA ANDEA
            carta.registrarProducto("JF09","AGUA ANDEA","--",seccionCartaJugos,8.5,new Date());


            //Cócteles de autor

            //CA01 - JAMAICA TONIC
            carta.registrarProducto("CA01","JAMAICA TONIC","Gin, Agua Tónica, Infusión de Jamaica y Zumo de Naranja",seccionCartaAutor,35,new Date());

            //CA02 - PRIMA VERA
            carta.registrarProducto("CA02","PRIMA VERA","Gin, Vermouth Blanco, Pepino Kiuri y Cardamomo",seccionCartaAutor,32,new Date());

            //CA03 - BARRANCO MULE
            carta.registrarProducto("CA03","JBARRANCO MULE","Pisco, Ginger Beer, Pepinillo Kiuri, Menta y Sal Maldon",seccionCartaAutor,35,new Date());

            //CA04 - ESTATE PUNCH
            carta.registrarProducto("CA04","ESTATE PUNCH","Appleton Estatet, Limon Tahiti, Mr Perkins de Piña y Peneapple",seccionCartaAutor,33,new Date());



            //Vinos

            //VN01 - SEPTIMA OBRA
            carta.registrarProducto("VN01","SEPTIMA OBRA","Malbec Reserva",seccionCartaVinos,150,new Date());

            //VN02 - LOS INTOCABLES
            carta.registrarProducto("VN02","LOS INTOCABLES","Malbec en Roble",seccionCartaVinos,150,new Date());

            //VN03 - SEPTIMA
            carta.registrarProducto("VN03","SEPTIMA","Sauvignon Blanc",seccionCartaVinos,150,new Date());

            //VN04 - CANALLAS
            carta.registrarProducto("VN04","CANALLAS","Merseguera y moscatel",seccionCartaVinos,150,new Date());

            //VN05 - FREIXENET
            carta.registrarProducto("VN05","FREIXENET","Pinot Grigio",seccionCartaVinos,240,new Date());

            //VN06 - PADRILLOS
            carta.registrarProducto("VN06","PADRILLOS","Malbec Reserva",seccionCartaVinos,220,new Date());

            //VN07 - PIERNAS LARGAS
            carta.registrarProducto("VN07","PIERNAS LARGAS","Carmenere - Valle de Rapel",seccionCartaVinos,220,new Date());

            //VN08 - BALA PERDIDA
            carta.registrarProducto("VN08","BALA PERDIDA","Alicante Bouchet",seccionCartaVinos,220,new Date());

        String[] seccionesCartaGeneral = {"Desayunos", "Entradas", "Sanguches", "Fondos", "Cafés", "Especiales", "Cócteles Clásicos", "Jugos y Frios", "Cócteles de Autor", "Vinos"};

        int i = 0;

        //Imprimir carta
        for(Producto producto : carta.getListaProductos()) {
            if(i < seccionesCartaGeneral.length && producto.getSeccionCarta().getNombreCarta().equals(seccionesCartaGeneral[i])){


                System.out.println("------------------------------------------------------");
                System.out.println("            " + producto.getSeccionCarta().getNombreCarta() + " - " + producto.getSeccionCarta().getHorario());
                System.out.println("------------------------------------------------------\n");

                int j = 0;
                for (Producto food : carta.getListaProductos()) {
                    if (food.getSeccionCarta().getNombreCarta().equals(seccionesCartaGeneral[i])) {
                        j++;
                        System.out.println(j + ". Código: " + food.getCodigo() + " Plato: " + food.getNombre() + ". Descripción: " + food.getDescripcion() + " Precio: " + food.getPrecio() + "\n");
                    }//Cambiar fecha "new Date()" por un String.
                }
                i++;
            }
        }
        System.out.println("=====================");
        //Pedido.solicitarPedido();
        List<Producto> productosSolicitados = Pedido.listaProductosSolicitados();
        mostrarProductos(productosSolicitados);
    }

    public static void mostrarProductos(List<Producto> productos) {
        System.out.println("Productos Solicitados:");
        for (Producto producto : productos) {
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Descripción: " + producto.getDescripcion());
            System.out.println("Sección: " + producto.getSeccionCarta().getNombreCarta());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Fecha de Creación: " + producto.getFechaCreacion());
            System.out.println("-----------------------------");
        }
    }
}
