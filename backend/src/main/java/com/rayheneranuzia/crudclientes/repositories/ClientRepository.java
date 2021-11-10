package com.rayheneranuzia.crudclientes.repositories;

import com.rayheneranuzia.crudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
