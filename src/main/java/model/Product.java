package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(
                    name = "cart",
                    joinColumns = {@JoinColumn(name = "CRT_PRO_ID")},
                    inverseJoinColumns = {@JoinColumn(name = "CRT_ORD_ID")}
            )
    Set<Order> orders = new HashSet<>();
}
