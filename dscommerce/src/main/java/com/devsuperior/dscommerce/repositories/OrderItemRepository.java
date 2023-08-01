package com.devsuperior.dscommerce.repositories;


import com.devsuperior.dscommerce.entities.OrderItem;
import com.devsuperior.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

///para acessar o banco de dados é necessario extender o JPAREPOSITORY<ENTIDADE, TIPO DE ID>
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
