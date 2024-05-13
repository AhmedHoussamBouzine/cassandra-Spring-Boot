package org.example.cassandraecommerce.repositories;

import org.example.cassandraecommerce.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
}
