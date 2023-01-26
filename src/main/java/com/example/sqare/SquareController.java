package com.example.sqare;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    String number;

    @GetMapping("/api/square")
    public String returnSquare(int x) {
        this.number = String.valueOf(x*x);
        return number;
    }
}
