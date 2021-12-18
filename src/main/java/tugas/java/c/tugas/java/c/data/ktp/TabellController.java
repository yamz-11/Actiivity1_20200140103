/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.java.c.tugas.java.c.data.ktp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wiratama
 */
@Controller
public class TabellController {
    
    @RequestMapping("/DataKTP")
    //@ResponseBody
    public String getTable(Model tiki){
        String result = "Tabel Data KTP";
        tiki.addAttribute("expedisi", result);
        
       
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(0,Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
        data.add(1,Arrays.asList("1.","5204131902020001","Athallariq","Sumbawa"));
        data.add(2,Arrays.asList("2.","5204131902020001","wiratama","Sumbawa"));
        data.add(3,Arrays.asList("3.","5204131904010001","Aditya","Langam"));
        data.add(4,Arrays.asList("4.","5204131105050001","Arya Sastra","Lombok"));
        data.add(5,Arrays.asList("5.","5204131202060001","Nopal Gita","Yogyakarta"));
        data.add(6,Arrays.asList("6.","5204130908030001","Adhitama","NTB"));
        data.add(7,Arrays.asList("7.","5204130711030001","Rabin","Bandung"));
        data.add(8,Arrays.asList("8.","5204131107010001","Satia S","Lombok Timur"));
        data.add(9,Arrays.asList("9.","5204130504010001","Alfian","Sumedang"));
        data.add(10,Arrays.asList("10.","5204131706200001","Gito","Bima"));
        data.add(11,Arrays.asList("11.","5204131408020001","Alam","Brebes"));
        data.add(12,Arrays.asList("12.","5204130704010001","Abi Ayu F","Gunung Kidul"));
        data.add(13,Arrays.asList("13.","5204130509010001","Maulana","Bandung"));
        data.add(14,Arrays.asList("14.","5204131109020001","Dhimas Aditya","Yogyakarta"));
        data.add(15,Arrays.asList("15.","5204132209010001","Raden M","Lomobk"));
        data.add(16,Arrays.asList("16.","5204131908020001","Arsil Fadil","NTB"));
        data.add(17,Arrays.asList("17.","5204130803010001","Memet Supandi","Cimahi"));
        data.add(18,Arrays.asList("18.","5204130211010001","Dawam Ahsan T","Utan"));
        data.add(19,Arrays.asList("19.","5204131805010001","Nasrul","Lopok"));
        data.add(20,Arrays.asList("20.","5204131704010001","Ilal Hamdi","Sumbawa"));
     
        tiki.addAttribute("tabel", data);
                
        return "tableviewer";
    }
}
