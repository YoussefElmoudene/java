package com.YoussefELmoudene.java.dao;

import com.YoussefELmoudene.java.bean.AccountId;
import com.YoussefELmoudene.java.bean.Arch_1004901;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArchDao extends JpaRepository<Arch_1004901, AccountId> {
}
