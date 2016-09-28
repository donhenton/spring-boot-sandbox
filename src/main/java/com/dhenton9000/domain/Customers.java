/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.domain;

 
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dhenton
 */
@Entity
@Table(name = "customers")
public class Customers {

    private Integer customerNumber;
    private String customerName;
    
    
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMERNUMBER", nullable = false)
    public Integer getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(Integer n) {
        this.customerNumber = n;
    }
    
    
     @Column(name = "CUSTOMERNAME", length = 50)
    
    @Basic(optional = false)
    public String getCustomerName() {
        return trimField(customerName);
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public static String trimField(String f)
    {
        if (f != null) {
            return f.trim();
        } else {
            return null;
        }
    }
    
}
