/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivityC.Cemilan_20200140105;

/**
 *
 * @author Inspiron
 */
public class Prosesdata {
    public Double getharga(String hrgsayur){
       
        Double hargasayur = Double.valueOf(hrgsayur);
        
        return hargasayur;
    }
    
    public Double getjumlah(String jmlsayur){
    
        Double jumlahsayur = Double.valueOf(jmlsayur);
    
        return jumlahsayur;
    }
    
    public Double gettotalbayar(Double jmlbayar, Double hrgdiskon){
    
        Double totalbayar = jmlbayar - hrgdiskon;
        
        return totalbayar;
    }
    
    public Double getjumlahbayar(Double hrgsayur, Double jmlsayur){
    
        Double jbayar = hrgsayur * jmlsayur;
    
        return jbayar;
    }
    
    public String getdiscount(Double jmlbayar){
    
        String discount = null;
        
        if (jmlbayar <16000) {
            discount = "0";
        }else if (jmlbayar <25000){
            discount = "10";
        }else{
            discount = "15";
        }
        return discount;
    }
    
    public Double gethargadiscount(Double jmlbayar, Integer disc){
        
        Double hrgdiskon = jmlbayar*disc/100;
    
        return hrgdiskon;
    }
    
    public void getdiskon(Double totalbayar, Double jmlbayar, Double hargadiskon, Integer diskon){
        
        if(jmlbayar < 16000){
            diskon = 0;
            totalbayar = jmlbayar - (jmlbayar*diskon/100);
            hargadiskon = jmlbayar*diskon/100;
            
        }else if( jmlbayar < 25000){
            diskon = 10;
            totalbayar = jmlbayar - (jmlbayar*diskon/100);
            hargadiskon = jmlbayar*diskon/100;
        }else {
            diskon = 15;
            totalbayar = jmlbayar - (jmlbayar*diskon/100);
            hargadiskon = jmlbayar*diskon/100;
        }
    }
    
    public Double getpembayaran(String uangbayar){
        
        Double pembayaran = Double.valueOf(uangbayar);
        
        return pembayaran;
    }
    
    public Double getkembalian(Double totalbayar, Double uangbayar){
        Double uangkembalian = uangbayar - totalbayar;
        
        return uangkembalian;
    }
}
