package com.luanribeiro.dr4_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String getStatus() {
        return "Serviço está ativo!";
    }

    @GetMapping("/test1")
    public String getTest1() {
        return "Teste está ativo!";
    }

}
