package org.mycompany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Immutable;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * CustomersView entity
 *
 */
@ApiModel(description = "Represents a customer")
@Entity // makes a table out of this class
@Table(name = "CustomersView")
@Immutable
public class CustomersView {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(value = "The customer ID.", required = true)
    private Integer customer_id;

    @ApiModelProperty(value = "The customer first name.", required = true)
    private String firstName;

    @ApiModelProperty(value = "The customer last name.", required = true)
    private String lastName;

    @ApiModelProperty(value = "The customer email.", required = true)
    private String email;
    
    @ApiModelProperty(value = "The order date.", required = false)
    private Date order_date;
    
    @ApiModelProperty(value = "The order number.", required = false)
    private Integer order_number;
    
    @ApiModelProperty(value = "The product ID.", required = false)
    private Integer product_id;
    
    @ApiModelProperty(value = "The order quantity.", required = false)
    private Integer order_quantity;
    
    @ApiModelProperty(value = "The product name.", required = true)
    private String product_name;
    
    
    public <Optional> CustomersView() {
    }

	/*
	 * public CustomersView(Integer id, String firstName, String lastName, String
	 * email ) { this.customer_id = id; this.firstName = firstName; this.lastName =
	 * lastName; this.email = email; }
	 */

    public Integer getCustomerId() {
        return customer_id;
    }

    public void setId(Integer id) {
        this.customer_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getOrderDate() {
        return order_date;
    }

    public void setOrderDate(Date date) {
        this.order_date = date;
    }
    
    public Integer getOrderNumber() {
        return order_number;
    }

    public void setOrderNumber(Integer number) {
        this.order_number = number;
    }
    
    public Integer getProductID() {
        return product_id;
    }

    public void setProductID(Integer id) {
        this.product_id = id;
    }
    
    public Integer getOrderQuantity() {
        return order_quantity;
    }

    public void setOrderQuantity(Integer quantity) {
        this.order_quantity = quantity;
    }
    
    public String getProductName() {
        return product_name;
    }

    public void setProductName(String name) {
        this.product_name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}