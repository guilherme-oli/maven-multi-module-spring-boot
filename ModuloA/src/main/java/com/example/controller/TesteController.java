package com.example.controller;

import com.example.util.DataAUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author guilherme
 */
@Controller
public class TesteController {
    
    @GetMapping("/testepai")
    public String testePai() {
        DataAUtil.imprimirData();
        return "teste";
    }
}
