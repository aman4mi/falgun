package com.bits.bitsDemo.repository;

import com.bits.bitsDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Aman on 4/20/2019.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
