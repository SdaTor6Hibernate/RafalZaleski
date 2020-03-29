package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pro_id")
    private int productId;
    @Column(name="pro_name")
    private String productName;
    @Column(name="pro_price")
    private BigDecimal price;
    @Column(name="pro_description")
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pro_cat_ID", referencedColumnName = "cat_id")
    private Category category;
}
