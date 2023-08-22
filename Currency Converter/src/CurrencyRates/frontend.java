package CurrencyRates;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Scanner;

public class frontend {
    public static String[] enterCurrencies() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base currency code : ");
        String baseCr = scan.nextLine();
        System.out.println("Enter target currency code : ");
        String targetCr = scan.nextLine();

        backend backend =  new backend();
        JsonObject jsonObject = backend.ConnectAndGet();
        JsonElement baseValue = jsonObject.get(baseCr);
        JsonElement targetValue = jsonObject.get(targetCr);
        if(baseValue != null && targetValue != null){
            return new String[]{baseCr, targetCr ,baseValue.toString(), targetValue.toString()};
        }
        else{
            System.out.println("Proper Input Please...");
            showCurrencies();
            return enterCurrencies();
        }

    }
    public static void showCurrencies() {
        System.out.println("AED - United Arab Emirates");
        System.out.println("AFN - Afghanistan");
        System.out.println("ALL - Albania");
        System.out.println("AMD - Armenia");
        System.out.println("ANG - Netherlands Antilles");
        System.out.println("AOA - Angola");
        System.out.println("ARS - Argentina");
        System.out.println("AUD - Australia");
        System.out.println("AWG - Aruba");
        System.out.println("AZN - Azerbaijan");
        System.out.println("BAM - Bosnia and Herzegovina");
        System.out.println("BBD - Barbados");
        System.out.println("BDT - Bangladesh");
        System.out.println("BGN - Bulgaria");
        System.out.println("BHD - Bahrain");
        System.out.println("BIF - Burundi");
        System.out.println("BMD - Bermuda");
        System.out.println("BND - Brunei");
        System.out.println("BOB - Bolivia");
        System.out.println("BRL - Brazil");
        System.out.println("BSD - Bahamas");
        System.out.println("BTC - Bitcoin");
        System.out.println("BTN - Bhutan");
        System.out.println("BWP - Botswana");
        System.out.println("BYN - Belarus");
        System.out.println("BZD - Belize");
        System.out.println("CAD - Canada");
        System.out.println("CDF - Democratic Republic of the Congo");
        System.out.println("CHF - Switzerland");
        System.out.println("CLF - Unidad de Fomento (CLF)");
        System.out.println("CLP - Chile");
        System.out.println("CNH - China (offshore)");
        System.out.println("CNY - China");
        System.out.println("COP - Colombia");
        System.out.println("CRC - Costa Rica");
        System.out.println("CUC - Cuban convertible peso");
        System.out.println("CUP - Cuban peso");
        System.out.println("CVE - Cape Verde");
        System.out.println("CZK - Czech Republic");
        System.out.println("DJF - Djibouti");
        System.out.println("DKK - Denmark");
        System.out.println("DOP - Dominican Republic");
        System.out.println("DZD - Algeria");
        System.out.println("EGP - Egypt");
        System.out.println("ERN - Eritrea");
        System.out.println("ETB - Ethiopia");
        System.out.println("EUR - Euro");
        System.out.println("FJD - Fiji");
        System.out.println("FKP - Falkland Islands");
        System.out.println("GBP - United Kingdom");
        System.out.println("GEL - Georgia");
        System.out.println("GGP - Guernsey");
        System.out.println("GHS - Ghana");
        System.out.println("GIP - Gibraltar");
        System.out.println("GMD - The Gambia");
        System.out.println("GNF - Guinea");
        System.out.println("GTQ - Guatemala");
        System.out.println("GYD - Guyana");
        System.out.println("HKD - Hong Kong");
        System.out.println("HNL - Honduras");
        System.out.println("HRK - Croatia");
        System.out.println("HTG - Haiti");
        System.out.println("HUF - Hungary");
        System.out.println("IDR - Indonesia");
        System.out.println("ILS - Israel");
        System.out.println("IMP - Isle of Man");
        System.out.println("INR - India");
        System.out.println("IQD - Iraq");
        System.out.println("IRR - Iran");
        System.out.println("ISK - Iceland");
        System.out.println("JEP - Jersey");
        System.out.println("JMD - Jamaica");
        System.out.println("JOD - Jordan");
        System.out.println("JPY - Japan");
        System.out.println("KES - Kenya");
        System.out.println("KGS - Kyrgyzstan");
        System.out.println("KHR - Cambodia");
        System.out.println("KMF - Comoros");
        System.out.println("KPW - North Korea");
        System.out.println("KRW - South Korea");
        System.out.println("KWD - Kuwait");
        System.out.println("KYD - Cayman Islands");
        System.out.println("KZT - Kazakhstan");
        System.out.println("LAK - Laos");
        System.out.println("LBP - Lebanon");
        System.out.println("LKR - Sri Lanka");
        System.out.println("LRD - Liberia");
        System.out.println("LSL - Lesotho");
        System.out.println("LYD - Libya");
        System.out.println("MAD - Morocco");
        System.out.println("MDL - Moldova");
        System.out.println("MGA - Madagascar");
        System.out.println("MKD - North Macedonia");
        System.out.println("MMK - Myanmar");
        System.out.println("MNT - Mongolia");
        System.out.println("MOP - Macau");
        System.out.println("MRU - Mauritania");
        System.out.println("MUR - Mauritius");
        System.out.println("MVR - Maldives");
        System.out.println("MWK - Malawi");
        System.out.println("MXN - Mexico");
        System.out.println("MYR - Malaysia");
        System.out.println("MZN - Mozambique");
        System.out.println("NAD - Namibia");
        System.out.println("NGN - Nigeria");
        System.out.println("NIO - Nicaragua");
        System.out.println("NOK - Norway");
        System.out.println("NPR - Nepal");
        System.out.println("NZD - New Zealand");
        System.out.println("OMR - Oman");
        System.out.println("PAB - Panama");
        System.out.println("PEN - Peru");
        System.out.println("PGK - Papua New Guinea");
        System.out.println("PHP - Philippines");
        System.out.println("PKR - Pakistan");
        System.out.println("PLN - Poland");
        System.out.println("PYG - Paraguay");
        System.out.println("QAR - Qatar");
        System.out.println("RON - Romania");
        System.out.println("RSD - Serbia");
        System.out.println("RUB - Russia");
        System.out.println("RWF - Rwanda");
        System.out.println("SAR - Saudi Arabia");
        System.out.println("SBD - Solomon Islands");
        System.out.println("SCR - Seychelles");
        System.out.println("SDG - Sudan");
        System.out.println("SEK - Sweden");
        System.out.println("SGD - Singapore");
        System.out.println("SHP - Saint Helena");
        System.out.println("SLL - Sierra Leone");
        System.out.println("SOS - Somalia");
        System.out.println("SRD - Suriname");
        System.out.println("SSP - South Sudan");
        System.out.println("STD - São Tomé and Príncipe");
        System.out.println("STN - São Tomé and Príncipe (old)");
        System.out.println("SVC - El Salvador");
        System.out.println("SYP - Syria");
        System.out.println("SZL - Eswatini");
        System.out.println("THB - Thailand");
        System.out.println("TJS - Tajikistan");
        System.out.println("TMT - Turkmenistan");
        System.out.println("TND - Tunisia");
        System.out.println("TOP - Tonga");
        System.out.println("TRY - Turkey");
        System.out.println("TTD - Trinidad and Tobago");
        System.out.println("TWD - Taiwan");
        System.out.println("TZS - Tanzania");
        System.out.println("UAH - Ukraine");
        System.out.println("UGX - Uganda");
        System.out.println("USD - United States");
        System.out.println("UYU - Uruguay");
        System.out.println("UZS - Uzbekistan");
        System.out.println("VES - Venezuela");
        System.out.println("VND - Vietnam");
        System.out.println("VUV - Vanuatu");
        System.out.println("WST - Samoa");
        System.out.println("XAF - Central African CFA franc");
        System.out.println("XAG - Silver (one troy ounce)");
        System.out.println("XAU - Gold (one troy ounce)");
        System.out.println("XCD - East Caribbean dollar");
        System.out.println("XDR - Special Drawing Rights (International Monetary Fund)");
        System.out.println("XOF - West African CFA franc");
        System.out.println("XPD - Palladium (one troy ounce)");
        System.out.println("XPF - CFP franc");
        System.out.println("XPT - Platinum (one troy ounce)");
        System.out.println("YER - Yemen");
        System.out.println("ZAR - South Africa");
        System.out.println("ZMW - Zambia");
        System.out.println("ZWL - Zimbabwe");


    }
    public static int showOptions(){
        System.out.println("1- I'll Enter Currencies By Their Codes");
        System.out.println("2- I'm Gonna Look At Currency Table");
        System.out.println("3- Exit");
        System.out.println("Your Choose :");

        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        if(choose.equals("1") || choose.equals("2") || choose.equals("3")){
            return Integer.parseInt(choose);
        }
        else {
            System.out.println("Proper Inputs Please...");
            return showOptions();
        }
    }
}
