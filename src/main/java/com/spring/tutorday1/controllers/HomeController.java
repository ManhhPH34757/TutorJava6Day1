package com.spring.tutorday1.controllers;

import com.spring.tutorday1.entities.HoaDon;
import com.spring.tutorday1.services.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class HomeController {

    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping()
    public ResponseEntity<Iterator<HoaDon>> getAll() {
        return ResponseEntity.ok(hoaDonService.findAll().iterator());
    }


}
