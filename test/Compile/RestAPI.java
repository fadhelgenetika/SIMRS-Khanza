package Compile;

public class RestAPI {
    public static void main(String []args){
        String requestJson ="{" +
                          "\"request\":{" +
                                "\"t_sep\":{" +
                                    "\"noKartu\":\"11111\"," +
                                    "\"tglSep\":\"22222\"," +
                                    "\"ppkPelayanan\":\"33333\"," +
                                    "\"jnsPelayanan\":\"44444\"," +
                                    "\"klsRawat\":{"+
                                        "\"klsRawatHak\":\"55555\","+
                                        "\"klsRawatNaik\":\"66666\","+
                                        "\"pembiayaan\":\"77777\","+
                                        "\"penanggungJawab\":\"88888\""+
                                    "},"+
                                    "\"noMR\":\"99999\"," +
                                    "\"rujukan\": {"+
                                        "\"asalRujukan\":\"10101010\"," +
                                        "\"tglRujukan\":\"12121212\"," +
                                        "\"noRujukan\":\"1313131313\"," +
                                        "\"ppkRujukan\":\"141414141414\"" +
                                    "},"+
                                    "\"catatan\":\"1515151515\"," +
                                    "\"diagAwal\":\"1616161616\"," +
                                    "\"poli\": {" +
                                        "\"tujuan\": \"1717171717\"," +
                                        "\"eksekutif\": \"1818181818\"" +
                                    "},"+
                                    "\"cob\": {" +
                                        "\"cob\": \"1919191919\"" +
                                    "},"+
                                    "\"katarak\": {" +
                                        "\"katarak\": \"2121212121\"" +
                                    "},"+
                                    "\"jaminan\": {"+
                                        "\"lakaLantas\":\"2323232323\"," +
                                        "\"penjamin\": {" +
                                            "\"tglKejadian\": \"2424242424\"," +
                                            "\"keterangan\": \"2525252525\"," +
                                            "\"suplesi\": {" +
                                                "\"suplesi\": \"2626262626\"," +
                                                "\"noSepSuplesi\": \"2727272727\"," +
                                                "\"lokasiLaka\": {" +
                                                    "\"kdPropinsi\": \"2727272727\"," +
                                                    "\"kdKabupaten\": \"2828282828\"," +
                                                    "\"kdKecamatan\": \"292929\"" +
                                                "}" +
                                            "}" +
                                        "}"+
                                    "}," +
                                    "\"tujuanKunj\": \"303030\","+
                                    "\"flagProcedure\": \"31313131\","+
                                    "\"kdPenunjang\": \"323232\","+
                                    "\"assesmentPel\": \"34343434\","+
                                    "\"skdp\": {" +
                                        "\"noSurat\": \"35353535\"," +
                                        "\"kodeDPJP\": \"36363636\"" +
                                    "},"+
                                    "\"dpjpLayan\": \"37373737\","+
                                    "\"noTelp\": \"38383838\","+
                                    "\"user\":\"3939393939\"" +
                                   "}" +
                             "}" +
                         "}";
        
        System.out.println(requestJson);
    }
}
