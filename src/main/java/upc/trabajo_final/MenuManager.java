package upc.trabajo_final;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private MenuCarta menuCarta;

    public MenuManager() {
        this.menuCarta = new MenuCarta();

        //Estos son las categorias Bebidas y Comidas
        CategoriaCarta categoriaComidas = new CategoriaCarta("Comidas");
        CategoriaCarta categoriaBebidas = new CategoriaCarta("Bebidas");

        SubCategoriaCarta desayunos = new SubCategoriaCarta("Desayunos de 8am - 1pm");
        desayunos.agregarMenu(new Comida("DY01","PERUVIAN EGGS","Tortilla de salchicha huachana y chalaquita",26));
        desayunos.agregarMenu(new Comida("DY02","AMERICANO","Pan campesino, tocino y huevos a la inglesa",23));
        desayunos.agregarMenu(new Comida("DY03","ACAI BOWL","Con frutas de estación, granola y mantequilla de maní",28));
        desayunos.agregarMenu(new Comida("DY04","BELGIAN WAFFLES","Con frutos de estación, miel y mantequilla de maní",27));
        desayunos.agregarMenu(new Comida("DY05","AVENA BOWL","Con frutos de estación, leche coco, leche almendras y canela",25));
        desayunos.agregarMenu(new Comida("DY06","TOSTONES RUE","Palta, ajonjolí y huevo pochado",26));
        desayunos.agregarMenu(new Comida("DY07","HUEVOS BENEDCITINOS","Pan brioche, huevo pochado, tocino y salsa holandesa",29));
        desayunos.agregarMenu(new Comida("DY08","TOSTADAS A LA FRANCHUTE","Pan brioche, frutos del bosque, crema casera y miel de maple",28));
        desayunos.agregarMenu(new Comida("DY09","REVUELTOS DE LA CASA","En tostones, palta y tomate cherry",24));

        SubCategoriaCarta entradas = new SubCategoriaCarta("Entradas 1pm*");
        entradas.agregarMenu(new Comida("ET01","RONDA DE TAPAS","5 tapas varias del dia",34));
        entradas.agregarMenu(new Comida("ET02","TIRADITO DE CONCHAS","Con crema de ají amarillo y camote",38));
        entradas.agregarMenu(new Comida("ET03","CHAMPIÑONES AL VINO","Maserado en vino tinto y aceite de romero",27));
        entradas.agregarMenu(new Comida("ET04","CARPACCIO DE LOMO","Mostaza dijon, tostadas pan pita y alcaparras",38));
        entradas.agregarMenu(new Comida("ET05","STRACCIATELLA","Tomates cberry conffitados, arúgula y pan campesino",32));
        entradas.agregarMenu(new Comida("ET06","LANGOSTINOS AL AJILLO","Mantequilla negra, tomate cherry y pan campesino",37));
        entradas.agregarMenu(new Comida("ET07","PASTEL DE CHOCLO","Clásico pastel con carne y notas picantes",28));
        entradas.agregarMenu(new Comida("ET08","TEQUEÑOS","Queso andino y guacamole",24));
        entradas.agregarMenu(new Comida("ET09","HUMMUS & VEGETALES","Apio, zanahorías y tostadas de pan pita",23));
        entradas.agregarMenu(new Comida("ET10","PIZZA STRACIATELLA","Salsa de pesto, Straciatella y tomate cherry",56));
        entradas.agregarMenu(new Comida("ET11","PIZZA PROSCIUTTO","Mozarella, prosciutto y cebolla caramelizada",56));

        SubCategoriaCarta sanguches = new SubCategoriaCarta("Sanguches 1pm*");
        sanguches.agregarMenu(new Comida("SG01","FRESH CAPRESE","Tostón con pesto, mozarrella, tomate y pan campesino",23));
        sanguches.agregarMenu(new Comida("SG02","BAGEL DE SALMÓN","Queso crema, kiuri, cebolla y salmón",29));
        sanguches.agregarMenu(new Comida("SG03","RUE MIXTO","Jamon crocante, mozarrella fresca pickles encurtidos y cebolla caramelizada",27));
        sanguches.agregarMenu(new Comida("SG04","PULLED PORK","Brioche ér úrqeuito desilachado",29));
        sanguches.agregarMenu(new Comida("SG05","LOMO FINO","Lomo fino, gouda, champiñones y salsa mostaza en focaccia artesanal",32));
        sanguches.agregarMenu(new Comida("SG06","POLLO CLÁSICO","Pollo en mayonesa, apio y palta",24));
        sanguches.agregarMenu(new Comida("SG07","SHRIMP ROLL","Langostinos en mayonesa siracha, togarasbi y palta en pan brioche",29));
        sanguches.agregarMenu(new Comida("SG08","ROAST BEEF","Arúgula, mostaza Dijon y alcaparras",29));

        SubCategoriaCarta fondos = new SubCategoriaCarta("Fondos 1pm*");
        fondos.agregarMenu(new Comida("FD01","POKE BOWL DE ATÚN","Atún, quinua, pepino, zanahoria, palta en salsa acevichada",36));
        fondos.agregarMenu(new Comida("FD02","PEZ ESPADA PANADERO","Pez espada, papas panaderas y vegetales",49));
        fondos.agregarMenu(new Comida("FD03","CONFIT DE POLLO","Pure de papas y vegetales bebe",43));
        fondos.agregarMenu(new Comida("FD04","POLLO AL CURRY","Casbews, durazno, huevo, cebolla china, salsa curry y arroz blanco",44));
        fondos.agregarMenu(new Comida("FD05","PEPIÁN & ATÚN","Pepián de maiz dulce y medallón de atún en salsa anticuchera",48));
        fondos.agregarMenu(new Comida("FD06","RUE BURGER","Tocino, cebolla caramelizada, cheddar, papas fritas y ensalada",38));
        fondos.agregarMenu(new Comida("FD07","ENSALADA CAESAR","Lechuga, parmesano, crutones, frutos secos, Pollo o Tocino",33));
        fondos.agregarMenu(new Comida("FD08","RISOTTO & ATÚN ORIENTAL","De aji amarillo, medallón de atún en salsa oriental",49));
        fondos.agregarMenu(new Comida("FD09","PASTA PESTO","Linguini al esto genovés, mozarella, tomate cherry y frutos secos",38));
        fondos.agregarMenu(new Comida("FD10","MAC N' CHEESE","Conchiglie rigate, cheddar, crea de leche y tocino",38));
        fondos.agregarMenu(new Comida("FD11","PASTA FUNGHI PORCINI","Fettuccini en salsa porcini & portobello",46));
        fondos.agregarMenu(new Comida("FD12","LOMO SALTADO","Lomo fino, cebolla, tomate, papas fritas y arroz",49));

        //Categorias y Subcategorias para Bebidas
        SubCategoriaCarta cafes = new SubCategoriaCarta("Cafés");
        cafes.agregarMenu(new Bebida("CF01","EXPRESSO","Café expresso.",8));
        cafes.agregarMenu(new Bebida("CF02","AMERICANO","Café americano.",8));
        cafes.agregarMenu(new Bebida("CF03","CAPUCCINO","Café capuccino.",10));
        cafes.agregarMenu(new Bebida("CF04","FLAT WHITE","Flat white",14));
        cafes.agregarMenu(new Bebida("CF05","LATTE","Café latte.",10));
        cafes.agregarMenu(new Bebida("CF06","PINK LATTE","Pink latte",15));
        cafes.agregarMenu(new Bebida("CF07","MOCACCINO","Café mocaccino.",14));
        cafes.agregarMenu(new Bebida("CF08","IRISH COFFEE","Irish coffee",18));
        cafes.agregarMenu(new Bebida("CF09","CAFÉ BOMBÓN","Café bombón",16));
        cafes.agregarMenu(new Bebida("CF10","AFFOGATTO","Café affogatto.",18));
        cafes.agregarMenu(new Bebida("CF11","COLD BREW","Cold Brew",16));
        cafes.agregarMenu(new Bebida("CF12","MATCHA LATTE","Matcha latte",15));

        SubCategoriaCarta especiales = new SubCategoriaCarta("Especiales");
        especiales.agregarMenu(new Bebida("ES01","LIMONADA R u E","Jamaica y Maracuyá",14));
        especiales.agregarMenu(new Bebida("ES02","ICE - TEA","Clasico Té Helado",16));
        especiales.agregarMenu(new Bebida("ES03","FRAPPÉ","Café. Caramel o chocolate",18));
        especiales.agregarMenu(new Bebida("ES04","CHOCLATE CALIENTE","Negro o blanco",16));
        especiales.agregarMenu(new Bebida("ES05","INFUSIONES","Té verde, Té negro, Jamaica, coca, manzanilla, hierbaluisa, mena y hieba buena.",11));


        SubCategoriaCarta coctelesClasicos = new SubCategoriaCarta("Cócteles Clásicos");
        coctelesClasicos.agregarMenu(new Bebida("CC01","GIN TONIC","Aromatizado con Romero, Pimienta Rosa y Twist de Limón",32));
        coctelesClasicos.agregarMenu(new Bebida("CC02","MOSCOW MULE","Moscow mule",32));
        coctelesClasicos.agregarMenu(new Bebida("CC03","CHILCANO CLÁSICO","Chilcano clásico",24));
        coctelesClasicos.agregarMenu(new Bebida("CC04","CHILCANO DE MARACUYÁ","Chilcano de maracuyá",26));
        coctelesClasicos.agregarMenu(new Bebida("CC05","TINTO DE VERANO","Vino Argentino, Vermout Rosso, Zumo de Naranja, Limón y Ginger Ale",24));
        coctelesClasicos.agregarMenu(new Bebida("CC06","APERAL SPRITE","Aperal sprite",29));
        coctelesClasicos.agregarMenu(new Bebida("CC07","PISCO SOUR","Pisco sour",29));
        coctelesClasicos.agregarMenu(new Bebida("CC08","MARACUYÁ SOUR","Maracuyá sour",32));
        coctelesClasicos.agregarMenu(new Bebida("CC09","NEGRONI","Negroni",33));
        coctelesClasicos.agregarMenu(new Bebida("CC10","PINK SKY","Vodka, Naranja y Pink Soda",30));
        coctelesClasicos.agregarMenu(new Bebida("CC11","CARAJILLO","Carajillo",31));
        coctelesClasicos.agregarMenu(new Bebida("CC12","MIMOSA","Espumante y Zumo de Naranja",26));


        SubCategoriaCarta jugosFrios = new SubCategoriaCarta("Jugos y Frios");
        jugosFrios.agregarMenu(new Bebida("JF01","SODAS ITALIANAS","Sabores de Fresa y Hierbabuena, frutos rojos y romero y Maracumango",15));
        jugosFrios.agregarMenu(new Bebida("JF02","FRUTOS ROJOS","Fresa, arandanos y frambuesas",17));
        jugosFrios.agregarMenu(new Bebida("JF03","DETOX ROJO","Fresa, betabel, zanahoria y piña",16));
        jugosFrios.agregarMenu(new Bebida("JF04","DETOX VERDE","Manzana, perejil, platano, pepino y jengibre",16));
        jugosFrios.agregarMenu(new Bebida("JF05","NATURALES","Naranja, piña, fresa o maracuya",14));
        jugosFrios.agregarMenu(new Bebida("JF06","JUGO MIX","Piña, fresa y naranja",16));
        jugosFrios.agregarMenu(new Bebida("JF07","LIMONADAS","Clasica, hierbaluisa o jamaica",12));
        jugosFrios.agregarMenu(new Bebida("JF08","GASEOSAS","Inca Kola, Coca cola y Sprite",8.5));
        jugosFrios.agregarMenu(new Bebida("JF09","AGUA ANDEA","Con gas o sin gas",8.5));

        SubCategoriaCarta coctelesAutor = new SubCategoriaCarta("Cócteles de Autor");
        coctelesAutor.agregarMenu(new Bebida("CA01","JAMAICA TONIC","Gin, Agua Tónica, Infusión de Jamaica y Zumo de Naranja",35));
        coctelesAutor.agregarMenu(new Bebida("CA02","PRIMA VERA","Gin, Vermouth Blanco, Pepino Kiuri y Cardamomo",32));
        coctelesAutor.agregarMenu(new Bebida("CA03","BARRANCO MULE","Pisco, Ginger Beer, Pepinillo Kiuri, Menta y Sal Maldon",35));
        coctelesAutor.agregarMenu(new Bebida("CA04","ESTATE PUNCH","Appleton Estatet, Limon Tahiti, Mr Perkins de Piña y Peneapple",33));

        SubCategoriaCarta vinos = new SubCategoriaCarta("Vinos");
        vinos.agregarMenu(new Bebida("VN01","SEPTIMA OBRA","Malbec Reserva",150));
        vinos.agregarMenu(new Bebida("VN02","LOS INTOCABLES","Malbec en Roble",150));
        vinos.agregarMenu(new Bebida("VN03","SEPTIMA","Sauvignon Blanc",150));
        vinos.agregarMenu(new Bebida("VN04","CANALLAS","Merseguera y moscatel",150));
        vinos.agregarMenu(new Bebida("VN05","FREIXENET","Pinot Grigio",240));
        vinos.agregarMenu(new Bebida("VN06","PADRILLOS","Malbec",220));
        vinos.agregarMenu(new Bebida("VN07","PIERNAS LARGAS","Carmenere - Valle de Rapel",220));
        vinos.agregarMenu(new Bebida("VN08","BALA PERDIDA","Alicante Bouchet",220));

        //Trae subcaterias de las categorias para Comidas
        categoriaComidas.agregarSubCategoria(desayunos);
        categoriaComidas.agregarSubCategoria(entradas);
        categoriaComidas.agregarSubCategoria(sanguches);
        categoriaComidas.agregarSubCategoria(fondos);
        //Trae subcategorias de las categorias para Bebidas
        categoriaBebidas.agregarSubCategoria(cafes);
        categoriaBebidas.agregarSubCategoria(especiales);
        categoriaBebidas.agregarSubCategoria(coctelesClasicos);
        categoriaBebidas.agregarSubCategoria(jugosFrios);
        categoriaBebidas.agregarSubCategoria(coctelesAutor);
        categoriaBebidas.agregarSubCategoria(vinos);

        menuCarta.agregarCategoria(categoriaComidas);
        menuCarta.agregarCategoria(categoriaBebidas);
    }

    public MenuCarta getMenuCarta() {
        return menuCarta;
    }
}
