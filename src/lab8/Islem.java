/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Technopc
 */
public class Islem {
    ArrayList<AdresDefteri> list=new ArrayList<AdresDefteri>();
      Scanner ino=new Scanner(System.in);
    Islem()
    {
    }
    public void ekle(String ad,String sad,String tel,String mail)
    {
        if (list.size()==0)
        {list.add(new AdresDefteri(ad,sad,tel,mail));
        System.out.println("Eklendi");
        }
        else 
        { int cont=0;
             for(int i=0; i<list.size();i++)
             {if((list.get(i).adi==ad)&&(list.get(i).soyadi==sad)) 
             { System.out.println("Bu kayıt var");
             cont=1;
             }
             }
            if(cont==0) {list.add(new AdresDefteri(ad,sad,tel,mail));
                System.out.println("Eklendi");}
        }
    }
    public void sil(String ad,String sad)
    { for(int i=0; i<list.size();i++)
    {
          if((list.get(i).adi==ad)&&(list.get(i).soyadi==sad)) 
              list.remove(i);
          
    }
    
    }
    public void guncelle(String ad,String sad,String mail)
    {for(int i=0; i<list.size();i++)
    {
          if((list.get(i).adi==ad)&&(list.get(i).soyadi==sad)) list.get(i).emaili=mail;
    }
   
    }
    public void ara(String ad,String sad)
    {for(int i=0; i<list.size();i++)
    {
             if((list.get(i).adi==ad)&&(list.get(i).soyadi==sad))
                    System.out.println("Kayıt bulundu="+list.get(i).adi+" "+list.get(i).soyadi+" "+list.get(i).telefonu+" "+list.get(i).emaili);
     }
   
    }
    public void yaz(int i)
    {if (list.size()==0)
        {
        System.out.println("Boş");
        }
        else
        if((i<list.size()) && list.size()!=0)
                    System.out.println(list.get(i).adi+" "+list.get(i).soyadi+" "+list.get(i).telefonu+" "+list.get(i).emaili);
        else System.out.println("Kayıt yok");
    }
    
    public void siralaListele(int i)
    { String w,x,y,z;
        System.out.println("Büyükten-küçüğe ise B, küçükten-büyüğe ise K tıklayın");
        char sira=ino.next().charAt(0);
        for (int a=0;a<list.size();a++) {
           System.out.println(list.get(a).adi+" "+list.get(a).soyadi+" "+list.get(a).telefonu+" "+list.get(a).emaili);
        }
        if (i==1 && (sira=='k' || sira=='K') )    
        {
        System.out.println("Ada Göre Küçükten Büyüğe Sıralama : ");
        for(int b=1;b<list.size();b++)
        {
          for (int a=0;a<list.size();a++) {
          if(list.get(b).adi.charAt(0)<list.get(a).adi.charAt(0)) {
             w= list.get(b).adi;list.get(b).adi=list.get(a).adi;list.get(a).adi=w;
             x=list.get(b).soyadi;list.get(b).soyadi=list.get(a).soyadi;list.get(a).soyadi=x;
             y=list.get(b).telefonu;list.get(b).telefonu=list.get(a).telefonu;list.get(a).telefonu=y;
             z=list.get(b).emaili;list.get(b).emaili=list.get(a).emaili;list.get(a).emaili=z;
            
             }  
          } }
        }
          if (i==1 && (sira=='b' || sira=='B') )    
        {
        System.out.println("Ada Göre Büyükten Küçüğe Sıralama : ");
            System.out.println(list.size());
        for(int b=1;b<list.size();b++)
        {
          for (int a=0;a<list.size();a++) {       
          if(list.get(a).adi.charAt(0)<list.get(b).adi.charAt(0)) {            
             w= list.get(b).adi;list.get(b).adi=list.get(a).adi;list.get(a).adi=w;
             x=list.get(b).soyadi;list.get(b).soyadi=list.get(a).soyadi;list.get(a).soyadi=x;
             y=list.get(b).telefonu;list.get(b).telefonu=list.get(a).telefonu;list.get(a).telefonu=y;
             z=list.get(b).emaili;list.get(b).emaili=list.get(a).emaili;list.get(a).emaili=z;
              
             }  
          } }
        }
          if (i==2 && (sira=='k' || sira=='K') )    
        {
        System.out.println("Soyada Göre Küçükten Büyüğe Sıralama : ");
        for(int b=1;b<list.size();b++)
        {
          for (int a=0;a<list.size();a++) {
          if(list.get(b).soyadi.charAt(0)<list.get(a).soyadi.charAt(0)) {
             w= list.get(b).adi;list.get(b).adi=list.get(a).adi;list.get(a).adi=w;
             x=list.get(b).soyadi;list.get(b).soyadi=list.get(a).soyadi;list.get(a).soyadi=x;
             y=list.get(b).telefonu;list.get(b).telefonu=list.get(a).telefonu;list.get(a).telefonu=y;
             z=list.get(b).emaili;list.get(b).emaili=list.get(a).emaili;list.get(a).emaili=z;
             }  
          } }
        }
          if (i==2 && (sira=='b' || sira=='B') )    
        {
        System.out.println("Soyada Göre Büyükten Küçüğe Sıralama : ");
        for(int b=1;b<list.size();b++)
        {
          for (int a=0;a<list.size();a++) 
          {
          if(list.get(a).soyadi.charAt(0)<list.get(b).soyadi.charAt(0)) {
             w= list.get(b).adi;list.get(b).adi=list.get(a).adi;list.get(a).adi=w;
             x=list.get(b).soyadi;list.get(b).soyadi=list.get(a).soyadi;list.get(a).soyadi=x;
             y=list.get(b).telefonu;list.get(b).telefonu=list.get(a).telefonu;list.get(a).telefonu=y;
             z=list.get(b).emaili;list.get(b).emaili=list.get(a).emaili;list.get(a).emaili=z;
             }  
          } 
        }
        }
        for (int a=0;a<list.size();a++) {
           System.out.println(list.get(a).adi+" "+list.get(a).soyadi+" "+list.get(a).telefonu+" "+list.get(a).emaili);
        }
          
    
    
}
}
