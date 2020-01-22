package parkingmanagement;
/*
import java.util.Array;
import java.util.ArrayList;

public class ArrayData {
    static String[] data_kendaraan;
    
    Array<String> data_kendaraan = new Array();
    //public static String data_kendaraan[] = {"","","","","",""}
            
    public static int i=0, j=3;
  */  
public class dataparkir{
    public String nokendaraan, jeniskendaraan, jammasuk;

    public dataparkir(String nokendaraan, String jeniskendaraan, String jammasuk) {
        this.nokendaraan = nokendaraan;
        this.jeniskendaraan = jeniskendaraan;
        this.jammasuk = jammasuk;
    }

    dataparkir(String nokendaraan, String jeniskendaraan, String jammasuk, String hargamasuk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
