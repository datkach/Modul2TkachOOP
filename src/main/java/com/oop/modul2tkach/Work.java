package com.oop.modul2tkach;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Work {
    private String title;
    private String description;
    private String image;
}
