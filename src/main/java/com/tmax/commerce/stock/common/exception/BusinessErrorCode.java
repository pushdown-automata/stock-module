package com.tmax.commerce.stock.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum BusinessErrorCode implements ErrorCode {
    //TODO: 재고 비즈니스 로직에 맞게 수정
    NOT_FOUND_ITEM_CATEGORY(HttpStatus.NOT_FOUND),
    NOT_FOUND_ITEM_GROUP(HttpStatus.NOT_FOUND),
    NOT_FOUND_ITEM(HttpStatus.NOT_FOUND),
    NOT_FOUND_OPTION_GROUP(HttpStatus.NOT_FOUND),
    NOT_FOUND_OPTION(HttpStatus.NOT_FOUND),

    INVALID_PARAMETER_PRODUCT_PRICE(HttpStatus.BAD_REQUEST),
    INVALID_PARAMETER_CHOICE_COUNT(HttpStatus.BAD_REQUEST),

    INVALID_PARAMETER_SIZE_FILE(HttpStatus.BAD_REQUEST),
    INVALID_PARAMETER_CONTENT_TYPE_FILE(HttpStatus.BAD_REQUEST),

    EXCEED_LIMIT_RETRIES(HttpStatus.REQUEST_TIMEOUT),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR);

    private final HttpStatus httpStatus;

    @Override
    public String getName() {
        return getName();
    }
}