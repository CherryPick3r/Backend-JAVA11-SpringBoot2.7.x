package com.cherrypicker.cherrypick3r.shop.dto;

import com.cherrypicker.cherrypick3r.shopCard.domain.ShopCard;
import com.cherrypicker.cherrypick3r.tag.dto.TagPairDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class ShopCardResponse {

    public Long shopId;

    public String shopMainPhoto1;

    public String shopMainPhoto2;

    public String shopName;

    public String shopCategory;

    public String oneLineReview;

    public List<TagPairDto> topTags;

    public Long shopClipping;

    @Builder
    public ShopCardResponse(Long shopId, String shopMainPhoto1, String shopMainPhoto2, String shopName, String shopCategory, String oneLineReview, List<TagPairDto> topTags, Long shopClipping) {
        this.shopId = shopId;
        this.shopMainPhoto1 = shopMainPhoto1;
        this.shopMainPhoto2 = shopMainPhoto2;
        this.shopName = shopName;
        this.shopCategory = shopCategory;
        this.oneLineReview = oneLineReview;
        this.topTags = topTags;
        this.shopClipping = shopClipping;
    }

    public ShopCardResponse(ShopDto shopDto) {
        this.shopId = shopDto.getId();
        this.shopMainPhoto1 = shopDto.getMainPhotoUrl1();
        this.shopMainPhoto2 = shopDto.getMainPhotoUrl2();
        this.shopName = shopDto.getName();
        this.shopCategory = ""; // 카테고리 어떻게 채워줄까
        this.oneLineReview = shopDto.getOnelineReview();
        this.topTags = null;
        this.shopClipping = null;
    }

    public ShopCardResponse(ShopCard shopCard) {
        this.shopId = shopCard.getShopId();
        this.shopMainPhoto1 = shopCard.getShopMainPhoto1();
        this.shopMainPhoto2 = shopCard.getShopMainPhoto2();
        this.shopName = shopCard.getShopName();
        this.shopCategory = shopCard.getShopCategory();
        this.oneLineReview = shopCard.getOneLineReview();
        this.topTags = shopCard.getTopTags();
        this.shopClipping = shopCard.getShopClipping();
    }
}
