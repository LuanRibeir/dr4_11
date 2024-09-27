package com.luanribeiro.dr4_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String getStatus() {
        return "Serviço está ativo!";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Teste está ativo!";
    }

}
