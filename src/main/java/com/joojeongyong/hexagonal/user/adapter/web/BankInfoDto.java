package com.joojeongyong.hexagonal.user.adapter.web;

import com.joojeongyong.hexagonal.user.domain.BankInfo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BankInfoDto {
    private final String bankCode;
    private final String bankName;

    public static BankInfoDto from(BankInfo bankInfo) {
        return new BankInfoDto(bankInfo.getCode(), bankInfo.getDescription());
    }
}
