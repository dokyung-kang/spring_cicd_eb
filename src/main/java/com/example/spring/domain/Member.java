package com.example.spring.domain;

import com.example.spring.domain.common.BaseEntity;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    private Long id;

    private String name;
}