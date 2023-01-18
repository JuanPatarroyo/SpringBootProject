/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 *
 * @author jpatarroyo
 */
@Entity
@Getter @Setter @NoArgsConstructor
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Column(name = "precio_producto")
    private Double precioProducto;

    public Producto(Long idProducto, String nombreProducto, Double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    
}
