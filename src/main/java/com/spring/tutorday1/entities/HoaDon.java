package com.spring.tutorday1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @Column(name = "trang_thai", length = 50)
    private String trangThai;

    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @Column(name = "ngay_sua")
    private Instant ngaySua;

    @Nationalized
    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "so_dien_thoai", length = 20)
    private String soDienThoai;

}