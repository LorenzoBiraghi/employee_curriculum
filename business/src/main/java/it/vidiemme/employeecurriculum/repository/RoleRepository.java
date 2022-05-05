package it.vidiemme.employeecurriculum.repository;

import it.vidiemme.employeecurriculum.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * Find Role by his name
     * @param name
     * @return Optional Role object
     */
    public Optional<Role> findByName(String name);
}
