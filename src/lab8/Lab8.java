/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.Scanner;
/**
 *
 * @author Technopc
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Islem dene1=new Islem();
    dene1.ekle("Alev", "Mutlu", "111", "Mail");
    dene1.yaz(0);
    dene1.ekle("Birgül", "Güler", "111", "Mail");
    dene1.yaz(1);
    dene1.ara("Birgül", "Güler");
    dene1.guncelle("Birgül", "Güler", "33");
    dene1.yaz(1);
    dene1.sil("Birgül", "Güler");
   dene1.yaz(1);
   dene1.ekle("Alev", "Mutlu", "44", "55");
   dene1.ekle("Zeynep", "Mut", "44", "55");
   dene1.ekle("Volkan", "Kara", "44", "55");
   dene1.ekle("Can", "Alp", "44", "55");
    dene1.ekle("Zeynep", "Ada", "44", "55");
        System.out.println("Arama yapmak istiyor musunuz? E");
        char cevap = in.next().charAt(0);
        if (cevap=='E' || cevap =='e') 
        { System.out.println("1-Ada Göre\n2-Soyada Göre\n");
        String don=in.next();
        switch(don)
        { case "1":dene1.siralaListele(1);break;
        case "2":dene1.siralaListele(2);break;
            }
        }  
        else System.out.println("Başka değer girdiniz.");
        }
    }
    

