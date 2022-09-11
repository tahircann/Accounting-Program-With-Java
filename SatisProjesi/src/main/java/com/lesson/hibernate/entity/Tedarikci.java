
package com.lesson.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



    @Entity
    @Table(name = "tedarikci")
    public class Tedarikci {
        // tedarikçi sınıfı tablelar kolonlar vs nin tanımlanması

	  @Id
          @GeneratedValue(strategy =  GenerationType.IDENTITY)
	  @Column(name = "TedarikciNo")
	  private int tedarikciNo; 
    
          @Column(name = "tedarikciAdi")
	  private String tedarikciAdi; 
	  
	  
	  
          public Tedarikci(){
              
          }

        public Tedarikci( String tedarikciAdi) {
            super();
            
            this.tedarikciAdi = tedarikciAdi;
        }

        public int getTedarikciNo() {
            return tedarikciNo;
        }

        public void setTedarikciNo(int tedarikciNo) {
            this.tedarikciNo = tedarikciNo;
        }

        public String getTedarikciAdi() {
            return tedarikciAdi;
        }

        public void setTedarikciAdi(String tedarikciAdi) {
            this.tedarikciAdi = tedarikciAdi;
        }
        
        @Override
	public String toString() {
		return "tedarikci [id=" + tedarikciNo + ", UTedarikciAdi=" + tedarikciAdi + "]";
	} 
 
          
          
          
          
}
