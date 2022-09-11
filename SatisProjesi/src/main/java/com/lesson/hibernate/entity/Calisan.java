/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lesson.hibernate.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



    @Entity
    @Table(name = "calisan")
    public class Calisan {
        // Çalışan sınıfı tablelar kolonlar vs nin tanımlanması

	  @Id
          @GeneratedValue(strategy =  GenerationType.IDENTITY)
	  @Column(name = "calisanNo")
	  private int calisanNo; 
    
          @Column(name = "calisanAdi")
	  private String calisanAdi; 
	  
	  @Column(name = "calisanSadi")
	  private String calisanSadi; 
	  
          public Calisan(){
              
          }

        public Calisan( String calisanAdi, String calisanSadi) {
            super();
            
            this.calisanAdi = calisanAdi;
            this.calisanSadi = calisanSadi;
        }

        public int getCalisanNo() {
            return calisanNo;
        }

        public void setCalisanNo(int calisanNo) {
            this.calisanNo = calisanNo;
        }

        public String getCalisanAdi() {
            return calisanAdi;
        }

        public void setCalisanAdi(String calisanAdi) {
            this.calisanAdi = calisanAdi;
        }

        public String getCalisanSadi() {
            return calisanSadi;
        }

        public void setCalisanSadi(String calisanSadi) {
            this.calisanSadi = calisanSadi;
        }
        
        
	@Override
	public String toString() {
		return "calisan [id=" + calisanNo + ", CalisanAdi=" + calisanAdi + ", CalisanSAdi=" + calisanSadi  + "]";
	} 



    
    
	
    
    }

