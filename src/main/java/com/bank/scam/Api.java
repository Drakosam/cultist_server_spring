package com.bank.scam;

import com.bank.scam.models.Response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Api {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("test")
    public Response<String> test(){
        return new Response<String>("xxxStat",200);
    }
}
