package com.YoussefELmoudene.java.service;

import com.YoussefELmoudene.java.bean.Arch_1004901;
import com.YoussefELmoudene.java.dao.ArchDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchService {


    public List<Arch_1004901> findAll() {
        return archDao.findAll();
    }

    public Arch_1004901 save(Arch_1004901 arch) {
        return archDao.save(arch);
    }


    @Autowired
    private ArchDao archDao;
}
