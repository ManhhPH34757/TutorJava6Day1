package com.spring.tutorday1.services;

import com.spring.tutorday1.entities.HoaDon;
import com.spring.tutorday1.repositories.HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    public Iterable<HoaDon> findAll() {
        return hoaDonRepository.findAll();
    }
}
