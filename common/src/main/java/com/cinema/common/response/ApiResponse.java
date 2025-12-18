package com.cinema.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private int status;
    private String code;
    private String message;
    private T data;
    private Instant timestamp;

    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .status(200)
                .code("SUCCESS")
                .message("Success")
                .data(data)
                .timestamp(Instant.now())
                .build();
    }

    public static ApiResponse<Void> error(int status, String code, String message) {
        return ApiResponse.<Void>builder()
                .status(status)
                .code(code)
                .message(message)
                .timestamp(Instant.now())
                .build();
    }

}
