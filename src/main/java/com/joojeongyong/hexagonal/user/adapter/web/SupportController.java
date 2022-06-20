package com.joojeongyong.hexagonal.user.adapter.web;

import com.joojeongyong.hexagonal.user.domain.BankInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(path = {"/api/support"})
@RestController
public class SupportController {

    @GetMapping("/banks")
    public ResponseEntity<List<BankInfoDto>> listBankInfo() {
        return ResponseEntity.ok(
            Arrays.stream(BankInfo.values())
                .map(BankInfoDto::from)
                .collect(Collectors.toList())
        );
    }
}
