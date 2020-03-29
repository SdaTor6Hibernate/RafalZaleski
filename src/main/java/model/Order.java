package model;
import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORD_ID")
    private int orderId;
    @Column(name = "ORD_DATE")
    private LocalDateTime orderDate;
    @Column(name = "ORD_PRICE")
    private Double orderPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORD_USR_ID", referencedColumnName = "USR_ID")
    private User orderUser;
    @ManyToMany(mappedBy = "orders")
    private Set<Product> products = new HashSet<>();
}