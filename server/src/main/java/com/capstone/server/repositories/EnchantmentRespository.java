package com.capstone.server.repositories;

import com.capstone.server.models.Enchantment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnchantmentRespository extends JpaRepository<Enchantment,Long> {
}
