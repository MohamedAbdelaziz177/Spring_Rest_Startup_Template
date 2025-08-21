package com.abdelaziz26.cishackit.Core.DTOs.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TokenResponse {

    private String accessToken;

    private String refreshToken;

    private Boolean success = true;

    private String error = "";
}
