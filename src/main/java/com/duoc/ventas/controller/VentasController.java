package com.duoc.ventas.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin(origins = "*")
public class VentasController {

    @GetMapping
    public List<Venta> getVentas() {
        return List.of(
            new Venta(1L, "Laptop Dell XPS 15", 1500.0, 2),
            new Venta(2L, "Monitor LG 27 Pulgadas", 300.0, 1),
            new Venta(3L, "Teclado Mecánico Keychron K2", 100.0, 5)
        );
    }

    record Venta(Long id, String producto, Double precio, Integer cantidad) {}
}
