package com.ambika.flyway;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods later if needed
}
