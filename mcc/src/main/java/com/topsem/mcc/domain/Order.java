package com.topsem.mcc.domain;

import com.topsem.common.domain.NamedEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 订单实体
 *
 * @author Chen on 15/1/19.
 */

@Entity
@Table(name = "T_ORDER")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Data
@EqualsAndHashCode(callSuper = false)
public class Order extends NamedEntity {

    /**
     * 订单总金额
     */
    private double totalAmount;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "order")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private List<OrderItem> orderItems;

    @CreatedDate
    @NotNull
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(nullable = false)
    private DateTime createdDate = DateTime.now();
}
