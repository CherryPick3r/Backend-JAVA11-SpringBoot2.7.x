package com.cherrypicker.cherrypick3r.tag.dto;

import com.cherrypicker.cherrypick3r.tag.domain.Tag;
import lombok.Builder;
import lombok.Data;

@Data
public class TagPairDto {

    private String description;

    private Double value;

    @Builder
    public TagPairDto(String description, Double value) {
        this.description = description;
        this.value = value;
    }
}
