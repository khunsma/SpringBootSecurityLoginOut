package com.khunsma.loginout.repository;

import com.khunsma.loginout.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
