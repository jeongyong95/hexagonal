package com.joojeongyong.hexagonal.user.domain;

import com.joojeongyong.hexagonal.user.domain.EnumCommon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum BankInfo implements EnumCommon {
    KDB_BANK("002", "산업은행"),
    IBK_BANK("003", "기업은행"),
    KB_BANK("004", "국민은행"),
    SUHYUP("007", "수협은행/수협중앙회"),
    NH_BANK("011", "농협은행"),
    NONGHYUP("012", "농협중앙회"),
    WOORI_BANK("011", "우리은행"),
    SC_BANK("023", "SC제일은행"),
    CITY_BANK("027", "한국씨티은행"),
    DAEGU_BANK("031", "대구은행"),
    BUSAN_BANK("032", "부산은행"),
    GWANGJU_BANK("034", "광주은행"),
    JEJU_BANK("035", "제주은행"),
    JEONBUK_BANK("037", "전북은행"),
    GYUNGNAM_BANK("039", "경남은행"),
    KFCC("045", "새마을금고중앙회"),
    CU("048", "신협중앙회"),
    FSB("050", "상호저축은행"),
    HSBC_BANK("054", "HSBC은행"),
    DEUTSCHE_BANK("055", "도이치은행"),
    JP_MORGAN_BANK("057", "제이피모간체이스은행"),
    BOA_BANK("060", "BOA은행"),
    ICBC_BANK("062","중국공상은행"),
    NFCF("064", "산림조합중앙회"),
    E_POST_BANK("071", "우체국"),
    HANA_BANK("081","KEB하나은행"),
    SHINHAN_BANK("088","신한은행"),
    K_BANK("089", "K뱅크"),
    KAKAO_BANK("090", "카카오뱅크"),
    YUANTA_SECURITY("209", "유안타증권"),
    KB_SECURITY("218", "KB증권"),
    MIRAE_ASSET_SECURITY("238", "미래에셋대우"),
    SAMSUNG_SECURITY("240", "삼성증권"),
    KOREA_INVESTMENT_SECURITY("243", "한국투자증권"),
    NH_SECURITY("247", "NH투자증권"),
    KYOBO_SECURITY("261", "교보증권"),
    HI_SECURITY("262", "하이투자증권"),
    HM_SECURITY("263", "현대차투자증권"),
    KIWOOM_SECURITY("264", "키움증권"),
    E_BEST_SECURITY("265", "이베스트투자증권"),
    SK_SECURITY("266", "SK증권"),
    DAISHIN_SECURITY("267", "대신증권"),
    HANHWA_SECURITY("269", "한화투자증권"),
    HANA_SECURITY("270", "하나금융투자"),
    SHINHAN_SECURITY("278", "신한금융투자"),
    DONGBU_SECURITY("279", "동부증권"),
    EUGENE_SECURITY("280", "유진투자증권"),
    MERITZ_SECURITY("287", "메리츠종합금융증권"),
    BOOKOOK_SECURITY("290", "부국증권"),
    SHINYOUNG_SECURITY("291", "신영증권"),
    CAPE_SECURITY("292", "케이프투자증권"),
    SBI_BANK("103", "SBI 저축은행");

    private String BankCode;
    private String description;

    @Override
    public String getCode() {
        return this.BankCode;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
