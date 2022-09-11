
 
package com.lesson.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



    @Entity
    @Table(name = "urunler")
    public class Urun {
        // Tedarikçi sınıfı tablelar kolonlar vs nin tanımlanması
	  @Id
          @GeneratedValue(strategy =  GenerationType.IDENTITY)
	  @Column(name = "urunNo")
	  private int urunNo; 
    
          @Column(name = "urunAdi")
	  private String urunAdi; 
	  
	  @Column(name = "stokMiktari")
	  private int stokMiktari;
           
          @Column(name = "fiyat")
	  private double fiyat;
          
          
          
	  
          public Urun(){
              
          }

        public Urun(String urunAdi, int stokMiktari, double fiyat) {
            
            
            this.urunAdi = urunAdi;
            this.stokMiktari = stokMiktari;
            this.fiyat = fiyat;
        }

        public int getUrunNo() {
            return urunNo;
        }

        public void setUrunNo(int urunNo) {
            this.urunNo = urunNo;
        }

        public String getUrunAdi() {
            return urunAdi;
        }

        public void setUrunAdi(String urunAdi) {
            this.urunAdi = urunAdi;
        }

        public int getStokMiktari() {
            return stokMiktari;
        }

        public void setStokMiktari(int stokMiktari) {
            this.stokMiktari = stokMiktari;
        }

        public double getFiyat() {
            return fiyat;
        }

        public void setFiyat(double fiyat) {
            this.fiyat = fiyat;
        }

    
       
        
          
    
    
}
