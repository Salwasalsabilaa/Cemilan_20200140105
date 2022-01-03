/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivityC.Cemilan_20200140105;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Inspiron
 */
@Controller
public class data {
    
   @RequestMapping("/inputdata")
   public String inputandata(HttpServletRequest input, Model sayur){
       Prosesdata Pdata = new Prosesdata();
       
       String nmsayur = input.getParameter("Nama_Sayur");
       String hrgsayur = input.getParameter("Harga_Sayur");
       String jmlsayur = input.getParameter("Jumlah_Beli");
       String uangbayar = input.getParameter("bayar");
       
       Double hargasayur = Pdata.getharga(hrgsayur);
       Double jumlahsayur = Pdata.getjumlah(jmlsayur);
       Double jumlahbayar = Pdata.getjumlahbayar(hargasayur, jumlahsayur);
       String diskon = Pdata.getdiscount(jumlahbayar);
       Double hargadiskon = Pdata.gethargadiscount(jumlahbayar, Integer.valueOf(diskon));
       Double totalbayar = Pdata.gettotalbayar(jumlahbayar, hargadiskon);
       Double pembayaran = Pdata.getpembayaran(uangbayar);
       Double kembalian = Pdata.getkembalian(totalbayar, pembayaran);
       Pdata.getdiskon(totalbayar, jumlahbayar, hargasayur, Integer.valueOf(diskon));
       
       sayur.addAttribute("name",nmsayur);
       sayur.addAttribute("price",hrgsayur);
       sayur.addAttribute("kilo",jmlsayur);
       sayur.addAttribute("totalbayar",totalbayar);
       sayur.addAttribute("hargadisc",hargadiskon);
       sayur.addAttribute("disc",diskon);
       sayur.addAttribute("total10",jumlahbayar);
       sayur.addAttribute("jumlah",pembayaran);
       sayur.addAttribute("kembali",kembalian);
       return "ViewTable";
   }
}
