package com.devsuperior.dscommerce.repositories;


import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

///para acessar o banco de dados é necessario extender o JPAREPOSITORY<ENTIDADE, TIPO DE ID>
public interface OrderRepository extends JpaRepository<Order,Long> {

}
