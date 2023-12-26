package com.matheus.catalogo.Repository;

import com.matheus.catalogo.Entity.Itens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ItemRepository extends JpaRepository<Itens, Long> {

}
