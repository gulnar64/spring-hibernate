package aze.coders.spring.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    @Id
    @Column(name = "customer_id",length = 10)
    private Integer id;

    @Column(name="customer_name", length=50)
    private String name;

    private String address;
}
