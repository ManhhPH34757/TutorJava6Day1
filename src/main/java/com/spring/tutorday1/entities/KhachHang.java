package com.spring.tutorday1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "khach_hang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ho_ten")
    private String hoTen;

    @Nationalized
    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "sdt", length = 20)
    private String sdt;

    @Column(name = "trang_thai", length = 50)
    private String trangThai;

    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @Column(name = "ngay_sua")
    private Instant ngaySua;

}