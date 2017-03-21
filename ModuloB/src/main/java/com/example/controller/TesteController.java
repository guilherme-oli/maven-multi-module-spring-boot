package com.example.controller;

import com.example.util.DataAUtil;
import com.example.util.DataBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author guilherme
 */
@Controller
public class TesteController {
    
    @GetMapping("/testefilho")
    public String testeFilho() {
        DataAUtil.imprimirData();
        DataBUtil.imprimirData();
//        com.example.util.DataUtil.imprimirData();
        return "teste";
    }
}
