package org.formation.dao;

import java.util.*;

import org.formation.entities.Client;
import org.formation.entities.Formation;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	@Query("select c from Client c where email like :x")
	public List<Client> findByEmail(@Param("x") String email);
}
