package org.sid.produit.dao;
import java.util.Optional;

import org.sid.produit.entities.ERole;
import org.sid.produit.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
