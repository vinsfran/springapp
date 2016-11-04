/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.springapp.service;

import java.io.Serializable;
import java.util.List;
import py.gov.asuncion.springapp.domain.Product;

/**
 *
 * @author vinsfran
 */
public interface ProductManager extends Serializable{
    
    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
}
