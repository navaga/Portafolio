/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import modelos.Moneda;
import modelos.Pais;
import modelos.Zona;



/**
 *
 * @author FOC
 */
@WebService(serviceName = "webServiceT6")
public class webServiceT6 {

 
    private List <Moneda> monedas;
    private List <Zona> zonas;
    private List <Pais> paises;
   
    
    @WebMethod(operationName = "getMonedas")
    public List<Moneda> getMonedas() {
        insertarDatos();       
        return monedas;
    }
    
    @WebMethod(operationName = "getMonedaByCodigo")
    public String getMonedaByCodigo(@WebParam(name = "codigo") int codigo) {
        
        insertarDatos();
        String respuesta="";
        if (codigo>monedas.size()){
            respuesta="No hay moneda con ese codigo";
        }
        else
        {
            respuesta = monedas.get(codigo).toString();
        }
        
        return respuesta;
    }
    
    
        
    @WebMethod(operationName = "getPaisesMoneda")
    public List<Pais> getPaisesMoneda(@WebParam(name = "codigoDivisa") String codigoDivisa) {
        
        insertarDatos();
        List paises1 = new ArrayList <Pais>();
        for (int i=0; i<paises.size();i++){
            if (paises.get(i).getCodigoDivisa().equals(codigoDivisa)){
                paises1.add(paises.get(i));
            }
        }
        return paises1;
    }
    
    @WebMethod(operationName = "getZonaById")
    public Zona getZonaById(@WebParam(name = "idZona") long idZona) {
        insertarDatos();
        int x=-1;
        for (int i=0; i<zonas.size();i++){
            if (zonas.get(i).getId()==idZona){
                x=i;
                break;
            }
        }        
        return zonas.get(x);
    }
    
    
    @WebMethod(operationName = "getZonas")
    public List<Zona> getZonas() {
        insertarDatos();
        return zonas;
    }
    
    
    @WebMethod(operationName = "getPaises")
    public List<Pais> getPaises() {
        insertarDatos();
        return paises;
    }
    
    @WebMethod(operationName = "getPaisesZona")
    public List<Pais> getPaisesZona(@WebParam(name = "idZona")  long idZona) {                
        insertarDatos();
        List <Pais> paisZona = new ArrayList <Pais>();
        for (int i=0; i<paises.size();i++){
            if (paises.get(i).getIdArea()==idZona){
                paisZona.add(paises.get(i));
            }
        }        
        return paisZona;
    }
    
    
    /***
     * Métodos encargados de cargar las colecciones con datos para realizar las prruebas.
     */
    public void insertarDatos() {
        
        monedas = new ArrayList <Moneda>();
        insertarMonedas();
        zonas = new ArrayList <Zona>();
        insertarZonas();
        paises = new ArrayList <Pais>();
        insertarPaises();
        
    }
    
    private void insertarMonedas() {
        // Inserción de monedas
        monedas.add(new Moneda("AED", "Dirham"));
        monedas.add(new Moneda("AFN", "Afgani Afgano"));
        monedas.add(new Moneda("ALL", "Lek Albanés"));
        monedas.add(new Moneda("AMD", "Dram Armenio"));
        monedas.add(new Moneda("ANG", "Florín Antillano Neerlandés"));
        monedas.add(new Moneda("AOA", "Kwanza Angoleño"));
        monedas.add(new Moneda("ARS", "Peso Argentino"));
        monedas.add(new Moneda("AUD", "Dólar Australiano"));
        monedas.add(new Moneda("AWG", "Florín Arubeño"));
        monedas.add(new Moneda("AZN", "Manat Azerbaiyano"));
        monedas.add(new Moneda("BAM", "Marco Convertible"));
        monedas.add(new Moneda("BBD", "Dólar"));
        monedas.add(new Moneda("BDT", "Taka"));
        monedas.add(new Moneda("BGN", "Lev Búlgaro"));
        monedas.add(new Moneda("BHD", "Dinar Bahreini"));
        monedas.add(new Moneda("BIF", "Franco Burundés"));
        monedas.add(new Moneda("BMD", "Dólar"));
        monedas.add(new Moneda("BND", "Dólar"));
        monedas.add(new Moneda("BOB", "Boliviano"));
        monedas.add(new Moneda("BRL", "Real Brasileño"));
        monedas.add(new Moneda("BSD", "Dólar Bahameño"));
        monedas.add(new Moneda("BTN", "Ngultrum"));
        monedas.add(new Moneda("BWP", "Pula"));
        monedas.add(new Moneda("BYN", "Rublo Bielorruso"));
        monedas.add(new Moneda("BZD", "Dólar"));
        monedas.add(new Moneda("CAD", "Dólar Canadiense"));
        monedas.add(new Moneda("CDF", "Franco Congoleño"));
        monedas.add(new Moneda("CHF", "Franco Suizo"));
        monedas.add(new Moneda("CLP", "Peso Chileno"));
        monedas.add(new Moneda("CNY", "Rmb Yuan Renminbi Chino"));
        monedas.add(new Moneda("COP", "Peso Colombiano"));
        monedas.add(new Moneda("CRC", "Colón Costarricense"));
        monedas.add(new Moneda("CUC", "Peso Cubano Convertible"));
        monedas.add(new Moneda("CVE", "Escudo Caboverdiano"));
        monedas.add(new Moneda("CZK", "Koruna Checa"));
        monedas.add(new Moneda("DJF", "Franco Yibutiano"));
        monedas.add(new Moneda("DKK", "Corona Danesa"));
        monedas.add(new Moneda("DOP", "Peso Dominicano"));
        monedas.add(new Moneda("DZD", "Dinar Algerino"));
        monedas.add(new Moneda("EGP", "Libra Egipcia"));
        monedas.add(new Moneda("ERN", "Nafka Eritreo"));
        monedas.add(new Moneda("ETB", "Birr Etiope"));
        monedas.add(new Moneda("EUR", "Euro"));
        monedas.add(new Moneda("FJD", "Dólar Fijiano"));
        monedas.add(new Moneda("GBP", "Libra Esterlina"));
        monedas.add(new Moneda("GEL", "Lari Georgiano"));
        monedas.add(new Moneda("GGP", "Libra"));
        monedas.add(new Moneda("GHS", "Cedi Ghanés"));
        monedas.add(new Moneda("GIP", "Libra"));
        monedas.add(new Moneda("GMD", "Dalasi Gambiano"));
        monedas.add(new Moneda("GNF", "Franco Guineano"));
        monedas.add(new Moneda("GTQ", "Quetzal Guatemalteco"));
        monedas.add(new Moneda("GYD", "Dólar Guyanés"));
        monedas.add(new Moneda("HKD", "Dólar"));
        monedas.add(new Moneda("HNL", "Lempira Hondureño"));
        monedas.add(new Moneda("HRK", "Kuna Croata"));
        monedas.add(new Moneda("HTG", "Gourde Haitiano"));
        monedas.add(new Moneda("HUF", "Forint Húngaro"));
        monedas.add(new Moneda("IDR", "Rupiah Indonesia"));
        monedas.add(new Moneda("ILS", "Nuevo Shékel Israeli"));
        monedas.add(new Moneda("IMP", "Libra"));
        monedas.add(new Moneda("INR", "Rupia India"));
        monedas.add(new Moneda("IQD", "Dinar Iraquí"));
        monedas.add(new Moneda("IRR", "Rial Iraní"));
        monedas.add(new Moneda("ISK", "Króna Islandesa"));
        monedas.add(new Moneda("JEP", "Libra"));
        monedas.add(new Moneda("JMD", "Dólar Jamaicano"));
        monedas.add(new Moneda("JOD", "Dinar Jordano"));
        monedas.add(new Moneda("JPY", "Yen Japonés"));
        monedas.add(new Moneda("KES", "Chelín Keniata"));
        monedas.add(new Moneda("KGS", "Som Kirguís"));
        monedas.add(new Moneda("KHR", "Riel Camboyano"));
        monedas.add(new Moneda("KID", "Dólar De Kiribati"));
        monedas.add(new Moneda("KMF", "Franco Comoriano"));
        monedas.add(new Moneda("KPW", "Won Norcoreano"));
        monedas.add(new Moneda("KRW", "Won Surcoreano"));
        monedas.add(new Moneda("KWD", "Dinar Kuwaití"));
        monedas.add(new Moneda("KYD", "Dólar Caimano"));
        monedas.add(new Moneda("KZT", "Tenge Kazajo"));
        monedas.add(new Moneda("LAK", "Kip Lao"));
        monedas.add(new Moneda("LBP", "Libra Libanesa"));
        monedas.add(new Moneda("LKR", "Rupia"));
        monedas.add(new Moneda("LRD", "Dólar Liberiano"));
        monedas.add(new Moneda("LSL", "Loti Lesotense"));
        monedas.add(new Moneda("LTL", "Litas Lituano"));
        monedas.add(new Moneda("LYD", "Dinar Libio"));
        monedas.add(new Moneda("MAD", "Dirham Marroquí"));
        monedas.add(new Moneda("MDL", "Leu Moldavo"));
        monedas.add(new Moneda("MGA", "Ariary Malgache"));
        monedas.add(new Moneda("MKD", "Denar Macedonio"));
        monedas.add(new Moneda("MMK", "Kyat Birmano"));
        monedas.add(new Moneda("MNT", "Tughrik Mongol"));
        monedas.add(new Moneda("MOP", "Pataca"));
        monedas.add(new Moneda("MRU", "Ouguiya Mauritana"));
        monedas.add(new Moneda("MUR", "Rupia Mauricia"));
        monedas.add(new Moneda("MVR", "Rufiyaa Maldiva"));
        monedas.add(new Moneda("MWK", "Kwacha Malauí"));
        monedas.add(new Moneda("MXN", "Peso Mexicano"));
        monedas.add(new Moneda("MYR", "Ringgit Malayo"));
        monedas.add(new Moneda("MZN", "Metical Mozambiqueño"));
        monedas.add(new Moneda("NAD", "Dólar Namibio"));
        monedas.add(new Moneda("NGN", "Naira Nigeriana"));
        monedas.add(new Moneda("NIO", "Córdoba Nicaragüense"));
        monedas.add(new Moneda("NOK", "Corona Noruega"));
        monedas.add(new Moneda("NPR", "Rupia Nepalesa"));
        monedas.add(new Moneda("NZD", "Dólar Neozelandés"));
        monedas.add(new Moneda("OMR", "Rial Omaní"));
        monedas.add(new Moneda("PAB", "Balboa Panameña"));
        monedas.add(new Moneda("PEN", "Nuevo Sol Peruano"));
        monedas.add(new Moneda("PGK", "Kina"));
        monedas.add(new Moneda("PHP", "Peso Filipino"));
        monedas.add(new Moneda("PKR", "Rupia Pakistaní"));
        monedas.add(new Moneda("PLN", "Złoty Polaco"));
        monedas.add(new Moneda("PYG", "Guaraní"));
        monedas.add(new Moneda("QAR", "Rial Qatarí"));
        monedas.add(new Moneda("RON", "Leu Rumano"));
        monedas.add(new Moneda("RSD", "Dinar"));
        monedas.add(new Moneda("RUB", "Rublo Ruso"));
        monedas.add(new Moneda("RWF", "Franco Ruandés"));
        monedas.add(new Moneda("SAR", "Riyal Saudí"));
        monedas.add(new Moneda("SBD", "Dólar"));
        monedas.add(new Moneda("SCR", "Rupia"));
        monedas.add(new Moneda("SDG", "Dinar Sudanés"));
        monedas.add(new Moneda("SEK", "Corona Sueca"));
        monedas.add(new Moneda("SGD", "Dólar"));
        monedas.add(new Moneda("SHP", "Libra"));
        monedas.add(new Moneda("SLL", "Leone"));
        monedas.add(new Moneda("SOS", "Chelín Somalí"));
        monedas.add(new Moneda("SRD", "Dólar Surinamés"));
        monedas.add(new Moneda("SSP", "South Sudanese Pound"));
        monedas.add(new Moneda("STN", "Dobra"));
        monedas.add(new Moneda("SVC", "Colón"));
        monedas.add(new Moneda("SYP", "Libra Siria"));
        monedas.add(new Moneda("SZL", "Lilangeni Suazi"));
        monedas.add(new Moneda("THB", "Baht Tailandés"));
        monedas.add(new Moneda("TJS", "Somoni Tayik"));
        monedas.add(new Moneda("TMT", "Manat Turcomano"));
        monedas.add(new Moneda("TND", "Dinar Tunecino"));
        monedas.add(new Moneda("TOP", "Pa'Anga Tongano"));
        monedas.add(new Moneda("TRY", "Nueva Lira"));
        monedas.add(new Moneda("TTD", "Dólar"));
        monedas.add(new Moneda("TWD", "Nuevo Dólar Taiwanés"));
        monedas.add(new Moneda("TZS", "Chelín Tanzano"));
        monedas.add(new Moneda("UAH", "Grivna Ucrainiana"));
        monedas.add(new Moneda("UGX", "Chelín Ugandés"));
        monedas.add(new Moneda("USD", "Dólar Estadounidense"));
        monedas.add(new Moneda("UYU", "Peso Uruguayo"));
        monedas.add(new Moneda("UZS", "Som Uzbeko"));
        monedas.add(new Moneda("VES", "Bolívar Soberano"));
        monedas.add(new Moneda("VND", "Dong Vietnamito"));
        monedas.add(new Moneda("VUV", "Vatu Vanuatense"));
        monedas.add(new Moneda("WST", "Tala Samoana"));
        monedas.add(new Moneda("XAF", "Franco Cfa"));
        monedas.add(new Moneda("XCD", "Dólar"));
        monedas.add(new Moneda("XOF", "Franco Cfa"));
        monedas.add(new Moneda("XPF", "Franco Cfp"));
        monedas.add(new Moneda("YER", "Rial Yemeni"));
        monedas.add(new Moneda("YUN", "Dinar Yugoslavo"));
        monedas.add(new Moneda("ZAR", "Rand Sudafricano"));
        monedas.add(new Moneda("ZMW", "Kwacha Zambiano"));
        monedas.add(new Moneda("ZWL", "Dólar Zimbabuense"));
    }
    
    private void insertarZonas() {
        // Inserción de zonas
        zonas.add(new Zona(1, "Africa"));
        zonas.add(new Zona(2, "América del Norte"));
        zonas.add(new Zona(3, "América del Sur"));
        zonas.add(new Zona(4, "Antillas/Caribe"));
        zonas.add(new Zona(5, "Asia"));
        zonas.add(new Zona(6, "Europa"));
        zonas.add(new Zona(7, "Europa del Este"));
        zonas.add(new Zona(8, "Medio Oriente"));
        zonas.add(new Zona(9, "Pacífico"));
    }
    
    private void insertarPaises() {
        // Inserción de países
        paises.add(new Pais(1, "Martinica", 4, "EUR", "MTQ", "MQ"));
        paises.add(new Pais(2, "Afganistán", 5, "AFN", "AFG", "AF"));
        paises.add(new Pais(3, "África del Sur", 1, "ZAR", "ZAF", "ZA"));
        paises.add(new Pais(4, "Albania", 7, "ALL", "ALB", "AL"));
        paises.add(new Pais(5, "Alemania", 6, "EUR", "DEU", "DE"));
        paises.add(new Pais(6, "Andorra", 6, "EUR", "AND", "AD"));
        paises.add(new Pais(7, "Angola", 1, "AOA", "AGO", "AO"));
        paises.add(new Pais(8, "Anguila", 4, "XCD", "AIA", "AI"));
        paises.add(new Pais(9, "Antigua y Barbuda", 4, "XCD", "ATG", "AG"));
        paises.add(new Pais(10, "Antillas Neerlandesas", 4, "ANG", "ANT", "AN"));
        paises.add(new Pais(11, "Arabia Saudí", 8, "SAR", "SAU", "SA"));
        paises.add(new Pais(12, "Argelia", 1, "DZD", "DZA", "DZ"));
        paises.add(new Pais(13, "Argentina", 3, "ARS", "ARG", "AR"));
        paises.add(new Pais(14, "Armenia", 7, "AMD", "ARM", "AM"));
        paises.add(new Pais(15, "Aruba", 4, "AWG", "ABW", "AW"));
        paises.add(new Pais(16, "Australia", 9, "AUD", "AUS", "AU"));
        paises.add(new Pais(17, "Austria", 6, "EUR", "AUT", "AT"));
        paises.add(new Pais(18, "Azerbaiyán", 7, "AZN", "AZE", "AZ"));
        paises.add(new Pais(19, "Bahamas", 4, "BSD", "BHS", "BS"));
        paises.add(new Pais(20, "Bahrein", 8, "BHD", "BHR", "BH"));
        paises.add(new Pais(21, "Bangladesh", 5, "BDT", "BGD", "BD"));
        paises.add(new Pais(22, "Barbados", 4, "BBD", "BRB", "BB"));
        paises.add(new Pais(23, "Bélgica", 6, "EUR", "BEL", "BE"));
        paises.add(new Pais(24, "Belice", 4, "BZD", "BLZ", "BZ"));
        paises.add(new Pais(25, "Benin", 1, "XOF", "BEN", "BJ"));
        paises.add(new Pais(26, "Bermuda", 4, "BMD", "BMU", "BM"));
        paises.add(new Pais(27, "Bhoutan", 5, "BTN", "BTN", "BT"));
        paises.add(new Pais(28, "Bielorrusia", 7, "BYN", "BLR", "BY"));
        paises.add(new Pais(29, "Birmania (Myanmar)", 5, "MMK", "MMR", "MM"));
        paises.add(new Pais(30, "Bolivia", 3, "BOB", "BOL", "BO"));
        paises.add(new Pais(31, "Bosnia y Herzegovina", 7, "BAM", "BIH", "BA"));
        paises.add(new Pais(32, "Botsuana", 1, "BWP", "BWA", "BW"));
        paises.add(new Pais(33, "Brasil", 3, "BRL", "BRA", "BR"));
        paises.add(new Pais(34, "Brunéi", 8, "BND", "BRN", "BN"));
        paises.add(new Pais(35, "Bulgaria", 7, "BGN", "BGR", "BG"));
        paises.add(new Pais(36, "Burkina Faso", 1, "XOF", "BFA", "BF"));
        paises.add(new Pais(37, "Burundi", 1, "BIF", "BDI", "BI"));
        paises.add(new Pais(38, "Cabo Verde", 1, "CVE", "CPV", "CV"));
        paises.add(new Pais(39, "Camboya", 5, "KHR", "KHM", "KH"));
        paises.add(new Pais(40, "Camerún", 1, "XAF", "CMR", "CM"));
        paises.add(new Pais(41, "Canadá", 2, "CAD", "CAN", "CA"));
        paises.add(new Pais(42, "Chad", 1, "XAF", "TCD", "TD"));
        paises.add(new Pais(43, "Chile", 3, "CLP", "CHL", "CL"));
        paises.add(new Pais(44, "China", 5, "CNY", "CHN", "CN"));
        paises.add(new Pais(45, "Chipre", 6, "EUR", "CYP", "CY"));
        paises.add(new Pais(46, "Ciudad del Vaticano", 6, "EUR", "VAT", "VA"));
        paises.add(new Pais(47, "Colombia", 3, "COP", "COL", "CO"));
        paises.add(new Pais(48, "Comoras", 1, "KMF", "COM", "KM"));
        paises.add(new Pais(49, "Congo (Brazzaville)", 1, "XAF", "COG", "CG"));
        paises.add(new Pais(50, "Congo/Kinshasa (RDC)", 1, "CDF", "COD", "CD"));
        paises.add(new Pais(51, "Corea del Norte", 5, "KPW", "PRK", "KP"));
        paises.add(new Pais(52, "Corea del Sur", 5, "KRW", "KOR", "KR"));
        paises.add(new Pais(53, "Costa de Marfil", 1, "XOF", "CIV", "CI"));
        paises.add(new Pais(54, "Costa Rica", 3, "CRC", "CRI", "CR"));
        paises.add(new Pais(55, "Croacia", 7, "HRK", "HRV", "HR"));
        paises.add(new Pais(56, "Cuba", 4, "CUC", "CUB", "CU"));
        paises.add(new Pais(57, "Dinamarca", 6, "DKK", "DNK", "DK"));
        paises.add(new Pais(58, "Dominique", 4, "XCD", "DMA", "DM"));
        paises.add(new Pais(59, "Ecuador", 3, "USD", "ECU", "EC"));
        paises.add(new Pais(60, "Egipto", 8, "EGP", "EGY", "EG"));
        paises.add(new Pais(61, "Emiratos Arabes Unidos", 8, "AED", "ARE", "AE"));
        paises.add(new Pais(62, "Eritrea", 8, "ERN", "ERI", "ER"));
        paises.add(new Pais(63, "Eslovaquia", 7, "EUR", "SVK", "SK"));
        paises.add(new Pais(64, "Eslovenia", 7, "EUR", "SVN", "SI"));
        paises.add(new Pais(65, "España", 6, "EUR", "ESP", "ES"));
        paises.add(new Pais(66, "Estados Unidos", 2, "USD", "USA", "US"));
        paises.add(new Pais(67, "Estonia", 7, "EUR", "EST", "EE"));
        paises.add(new Pais(68, "Etiopía", 1, "ETB", "ETH", "ET"));
        paises.add(new Pais(69, "Fiji", 9, "FJD", "FJI", "FJ"));
        paises.add(new Pais(70, "Filipinas", 5, "PHP", "PHL", "PH"));
        paises.add(new Pais(71, "Finlandia", 6, "EUR", "FIN", "FI"));
        paises.add(new Pais(72, "Francia", 6, "EUR", "FRA", "FR"));
        paises.add(new Pais(73, "Francia metropolitana", 6, "EUR", "FXX", "FR"));
        paises.add(new Pais(74, "FSU", 7, "RUB", "SUN", "RU"));
        paises.add(new Pais(75, "Gabón", 1, "XAF", "GAB", "GA"));
        paises.add(new Pais(76, "Gambia", 1, "GMD", "GMB", "GM"));
        paises.add(new Pais(77, "Georgia", 7, "GEL", "GEO", "GE"));
        paises.add(new Pais(78, "Ghana", 1, "GHS", "GHA", "GH"));
        paises.add(new Pais(79, "Gibraltar", 6, "GIP", "GIB", "GI"));
        paises.add(new Pais(80, "Gran Bretaña", 6, "GBP", "GBR", "UK"));
        paises.add(new Pais(81, "Grecia", 6, "EUR", "GRC", "GR"));
        paises.add(new Pais(82, "Grenade", 4, "XCD", "GRD", "GD"));
        paises.add(new Pais(83, "Groenlandia (Dinamarca)", 2, "DKK", "GRL", "GL"));
        paises.add(new Pais(84, "Guadalupe", 4, "EUR", "GLP", "GP"));
        paises.add(new Pais(85, "Guam (EE.UU.)", 5, "USD", "GUM", "GU"));
        paises.add(new Pais(86, "Guatemala", 3, "GTQ", "GTM", "GT"));
        paises.add(new Pais(87, "Guayana", 3, "GYD", "GUY", "GY"));
        paises.add(new Pais(88, "Guernesey", 6, "GGP", "", "GG"));
        paises.add(new Pais(89, "Guiana francés", 3, "EUR", "GUF", "GF"));
        paises.add(new Pais(90, "Guinea", 1, "GNF", "GIN", "GN"));
        paises.add(new Pais(91, "Guinea Bissau", 1, "XAF", "GNB", "GW"));
        paises.add(new Pais(92, "Haití", 4, "HTG", "HTI", "HT"));
        paises.add(new Pais(93, "Holanda", 6, "EUR", "NLD", "NL"));
        paises.add(new Pais(94, "Honduras", 3, "HNL", "HND", "HN"));
        paises.add(new Pais(95, "Hong-Kong", 5, "HKD", "HKG", "HK"));
        paises.add(new Pais(96, "Hungría", 7, "HUF", "HUN", "HU"));
        paises.add(new Pais(97, "India", 5, "INR", "IND", "IN"));
        paises.add(new Pais(98, "Indonesia", 5, "IDR", "IDN", "ID"));
        paises.add(new Pais(99, "Irak", 8, "IQD", "IRQ", "IQ"));
        paises.add(new Pais(100, "Irán", 8, "IRR", "IRN", "IR"));
        paises.add(new Pais(101, "Irlanda", 6, "EUR", "IRL", "IE"));
        paises.add(new Pais(102, "Isla de Man", 6, "IMP", "", "IM"));
        paises.add(new Pais(103, "Isla de Navidad", 9, "AUD", "CXR", "CX"));
        paises.add(new Pais(104, "Isla Mauricio", 1, "MUR", "MUS", "MU"));
        paises.add(new Pais(105, "Islandia", 6, "ISK", "ISL", "IS"));
        paises.add(new Pais(106, "Islas Caimán", 4, "KYD", "CYM", "KY"));
        paises.add(new Pais(107, "Islas Cocos", 9, "AUD", "CCK", "CC"));
        paises.add(new Pais(108, "Islas Cook", 9, "NZD", "COK", "CK"));
        paises.add(new Pais(109, "Islas del Norte Marianne", 5, "USD", "MNP", "MP"));
        paises.add(new Pais(110, "Islas Feroe", 6, "DKK", "FRO", "FO"));
        paises.add(new Pais(111, "Islas Heard y Macdonald", 9, "AUD", "HMD", "HM"));
        paises.add(new Pais(112, "Islas Marshall", 5, "USD", "MHL", "MH"));
        paises.add(new Pais(113, "Islas Salomón", 9, "SBD", "SLB", "SB"));
        paises.add(new Pais(114, "Islas Vírgenes Británicas", 4, "USD", "VGB", "VG"));
        paises.add(new Pais(115, "Islas Vírgenes de los Estados Unidos", 4, "USD", "VIR", "VI"));
        paises.add(new Pais(116, "Israel", 8, "ILS", "ISR", "IL"));
        paises.add(new Pais(117, "Italia", 6, "EUR", "ITA", "IT"));
        paises.add(new Pais(118, "Jamaica", 4, "JMD", "JAM", "JM"));
        paises.add(new Pais(119, "Japón", 5, "JPY", "JPN", "JP"));
        paises.add(new Pais(120, "Jersey", 6, "JEP", "", "JE"));
        paises.add(new Pais(121, "Jordania", 8, "JOD", "JOR", "JO"));
        paises.add(new Pais(122, "Kazajstán", 5, "KZT", "KAZ", "KZ"));
        paises.add(new Pais(123, "Kenia", 1, "KES", "KEN", "KE"));
        paises.add(new Pais(124, "Kirguistán", 5, "KGS", "KGZ", "KG"));
        paises.add(new Pais(125, "Kiribati", 5, "KID", "KIR", "KI"));
        paises.add(new Pais(126, "Kuwait", 8, "KWD", "KWT", "KW"));
        paises.add(new Pais(127, "La Reunión", 1, "EUR", "REU", "RE"));
        paises.add(new Pais(128, "Laos", 5, "LAK", "LAO", "LA"));
        paises.add(new Pais(129, "Lesotho", 1, "LSL", "LSO", "LS"));
        paises.add(new Pais(130, "Letonia", 7, "EUR", "LVA", "LV"));
        paises.add(new Pais(131, "Líbano", 8, "LBP", "LBN", "LB"));
        paises.add(new Pais(132, "Liberia", 1, "LRD", "LBR", "LR"));
        paises.add(new Pais(133, "Libia", 1, "LYD", "LBY", "LY"));
        paises.add(new Pais(134, "Liechtenstein", 6, "CHF", "LIE", "LI"));
        paises.add(new Pais(135, "Lituania", 7, "LTL", "LTU", "LT"));
        paises.add(new Pais(136, "Luxemburgo", 6, "EUR", "LUX", "LU"));
        paises.add(new Pais(137, "Macao", 5, "MOP", "MAC", "MO"));
        paises.add(new Pais(138, "Macedonia", 7, "MKD", "MKD", "MK"));
        paises.add(new Pais(139, "Madagascar", 1, "MGA", "MDG", "MG"));
        paises.add(new Pais(140, "Malasia", 5, "MYR", "MYS", "MY"));
        paises.add(new Pais(141, "Malawi", 1, "MWK", "MWI", "MW"));
        paises.add(new Pais(142, "Maldivas", 5, "MVR", "MDV", "MV"));
        paises.add(new Pais(143, "Malí", 1, "XOF", "MLI", "ML"));
        paises.add(new Pais(144, "Malta", 6, "EUR", "MLT", "MT"));
        paises.add(new Pais(145, "Marruecos", 1, "MAD", "MAR", "MA"));
        paises.add(new Pais(146, "Mauritania", 1, "MRU", "MRT", "MR"));
        paises.add(new Pais(147, "Mayotte", 1, "EUR", "MYT", "YT"));
        paises.add(new Pais(148, "México", 3, "MXN", "MEX", "MX"));
        paises.add(new Pais(149, "Micronesia", 9, "USD", "FSM", "FM"));
        paises.add(new Pais(150, "Moldavia", 6, "MDL", "MDA", "MD"));
        paises.add(new Pais(151, "Mónaco", 6, "EUR", "MCO", "MC"));
        paises.add(new Pais(152, "Mongolia", 5, "MNT", "MNG", "MN"));
        paises.add(new Pais(153, "Montenegro", 7, "EUR", "MNE", "ME"));
        paises.add(new Pais(154, "Montserrat", 4, "XCD", "MSR", "MS"));
        paises.add(new Pais(155, "Mozambique", 1, "MZN", "MOZ", "MZ"));
        paises.add(new Pais(156, "Namibia", 1, "NAD", "NAM", "NA"));
        paises.add(new Pais(157, "Nauru", 9, "AUD", "NRU", "NR"));
        paises.add(new Pais(158, "Nepal", 5, "NPR", "NPL", "NP"));
        paises.add(new Pais(159, "Nicaragua", 3, "NIO", "NIC", "NI"));
        paises.add(new Pais(160, "Níger", 1, "XOF", "NER", "NE"));
        paises.add(new Pais(161, "Nigeria", 1, "NGN", "NGA", "NG"));
        paises.add(new Pais(162, "Niue", 9, "NZD", "NIU", "NU"));
        paises.add(new Pais(163, "Norfolk", 9, "AUD", "NFK", "NF"));
        paises.add(new Pais(164, "Noruega", 6, "NOK", "NOR", "NO"));
        paises.add(new Pais(165, "Nueva Caledonia", 9, "XPF", "NCL", "NC"));
        paises.add(new Pais(166, "Nueva Zelanda", 9, "NZD", "NZL", "NZ"));
        paises.add(new Pais(167, "Omán", 8, "OMR", "OMN", "OM"));
        paises.add(new Pais(168, "Pakistán", 5, "PKR", "PAK", "PK"));
        paises.add(new Pais(169, "Palau", 9, "USD", "PLW", "PW"));
        paises.add(new Pais(170, "Palestina", 8, "ILS", "", "PS"));
        paises.add(new Pais(171, "Panamá", 9, "PAB", "PAN", "PA"));
        paises.add(new Pais(172, "Papuasia-Nueva-Guinea", 5, "PGK", "PNG", "PG"));
        paises.add(new Pais(173, "Paraguay", 3, "PYG", "PRY", "PY"));
        paises.add(new Pais(174, "Perú", 3, "PEN", "PER", "PE"));
        paises.add(new Pais(175, "Pitcairn", 9, "NZD", "PCN", "PN"));
        paises.add(new Pais(176, "Polinesia francese", 9, "XPF", "PYF", "PF"));
        paises.add(new Pais(177, "Polonia", 7, "PLN", "POL", "PL"));
        paises.add(new Pais(178, "Portugal", 6, "EUR", "PRT", "PT"));
        paises.add(new Pais(179, "Puerto Rico", 4, "USD", "PRI", "PR"));
        paises.add(new Pais(180, "Qatar", 8, "QAR", "QAT", "QA"));
        paises.add(new Pais(181, "República Centroafricana", 1, "XAF", "CAF", "CF"));
        paises.add(new Pais(182, "República Checa", 7, "CZK", "CZE", "CS"));
        paises.add(new Pais(183, "República Dominicana", 4, "DOP", "DOM", "DO"));
        paises.add(new Pais(184, "Ruanda", 1, "RWF", "RWA", "RW"));
        paises.add(new Pais(185, "Rumania", 7, "RON", "ROM", "RO"));
        paises.add(new Pais(186, "Rusia", 7, "RUB", "RUS", "RU"));
        paises.add(new Pais(187, "Sáhara Occidental", 1, "MAD", "ESH", "EH"));
        paises.add(new Pais(188, "Salvador", 3, "SVC", "SLV", "SV"));
        paises.add(new Pais(189, "Samoa Americana", 9, "USD", "ASM", "AS"));
        paises.add(new Pais(190, "Samoa Occidentales", 9, "WST", "WSM", "WS"));
        paises.add(new Pais(191, "San Cristóbal y Nieves", 4, "XCD", "KNA", "KN"));
        paises.add(new Pais(192, "San Marino", 6, "EUR", "SMR", "SM"));
        paises.add(new Pais(193, "San Pedro y Miquelón", 2, "EUR", "SPM", "PM"));
        paises.add(new Pais(194, "San Vicente y las Granadinas", 4, "XCD", "VCT", "VC"));
        paises.add(new Pais(195, "Santa Elena", 1, "SHP", "SHN", "SH"));
        paises.add(new Pais(196, "Santa Lucía", 4, "XCD", "LCA", "LC"));
        paises.add(new Pais(197, "Santo Tomé y Príncipe", 1, "STN", "STP", "ST"));
        paises.add(new Pais(198, "Senegal", 1, "XOF", "SEN", "SN"));
        paises.add(new Pais(199, "Serbia", 7, "RSD", "SRB", "RS"));
        paises.add(new Pais(200, "Seychelles", 1, "SCR", "SYC", "SC"));
        paises.add(new Pais(201, "Sierra Leona", 1, "SLL", "SLE", "SL"));
        paises.add(new Pais(202, "Singapur", 5, "SGD", "SGP", "SG"));
        paises.add(new Pais(203, "Sint Maarten", 4, "ANG", "", "SX"));
        paises.add(new Pais(204, "Siria", 8, "SYP", "SYR", "SY"));
        paises.add(new Pais(205, "Somalia", 1, "SOS", "SOM", "SO"));
        paises.add(new Pais(206, "Sri Lanka", 5, "LKR", "LKA", "LK"));
        paises.add(new Pais(207, "Sudán", 1, "SDG", "SDN", "SD"));
        paises.add(new Pais(208, "Sudán del Sur", 1, "SSP", "SSD", "SS"));
        paises.add(new Pais(209, "Suecia", 6, "SEK", "SWE", "SE"));
        paises.add(new Pais(210, "Suiza", 6, "CHF", "CHE", "CH"));
        paises.add(new Pais(211, "Surinam", 3, "SRD", "SUR", "SR"));
        paises.add(new Pais(212, "Svalbard y Jan Mayen", 6, "NOK", "SJM", "SJ"));
        paises.add(new Pais(213, "Swazilandia", 1, "SZL", "SWZ", "SZ"));
        paises.add(new Pais(214, "Tailandia", 5, "THB", "THA", "TH"));
        paises.add(new Pais(215, "Taiwán", 5, "TWD", "TWN", "TW"));
        paises.add(new Pais(216, "Tanzania", 1, "TZS", "TZA", "TZ"));
        paises.add(new Pais(217, "Tayikistán", 5, "TJS", "TJK", "TJ"));
        paises.add(new Pais(218, "Territorios británicos en el Océano Índico", 5, "GBP", "IOT", "IO"));
        paises.add(new Pais(219, "Timor Oriental", 5, "USD", "", "TL"));
        paises.add(new Pais(220, "Togo", 1, "XOF", "TGO", "TG"));
        paises.add(new Pais(221, "Tokelau", 9, "NZD", "TKL", "TK"));
        paises.add(new Pais(222, "Tonga", 9, "TOP", "TON", "TO"));
        paises.add(new Pais(223, "Trinidad y Tobago", 4, "TTD", "TTO", "TT"));
        paises.add(new Pais(224, "Túnez", 1, "TND", "TUN", "TN"));
        paises.add(new Pais(225, "Turkmenistán", 5, "TMT", "TKM", "TM"));
        paises.add(new Pais(226, "Turquía", 7, "TRY", "TUR", "TR"));
        paises.add(new Pais(227, "Turquía y Caicos", 4, "USD", "TCA", "TC"));
        paises.add(new Pais(228, "Tuvalu", 9, "AUD", "TUV", "TV"));
        paises.add(new Pais(229, "Ucrania", 7, "UAH", "UKR", "UA"));
        paises.add(new Pais(230, "Uganda", 1, "UGX", "UGA", "UG"));
        paises.add(new Pais(231, "Unión Europea", 6, "EUR", "EUR", "EU"));
        paises.add(new Pais(232, "Uruguay", 3, "UYU", "URY", "UY"));
        paises.add(new Pais(233, "Uzbekistán", 5, "UZS", "UZB", "UZ"));
        paises.add(new Pais(234, "Vanuatu", 9, "VUV", "VUT", "VU"));
        paises.add(new Pais(235, "varias islas estadounidenses", 2, "USD", "UMI", "UM"));
        paises.add(new Pais(236, "Venezuela", 3, "VES", "VEN", "VE"));
        paises.add(new Pais(237, "Vietnam", 5, "VND", "VNM", "VN"));
        paises.add(new Pais(238, "Wallis y Futuna", 9, "XPF", "WLF", "WF"));
        paises.add(new Pais(239, "Yemen", 8, "YER", "YEM", "YE"));
        paises.add(new Pais(240, "Yibuti", 1, "DJF", "DJI", "DJ"));
        paises.add(new Pais(241, "Yugoslavia", 7, "YUN", "YUG", "YU"));
        paises.add(new Pais(242, "Zambia", 1, "ZMW", "ZMB", "ZM"));
        paises.add(new Pais(243, "Zimbabue", 1, "ZWL", "ZWE", "ZW"));
    }
}
