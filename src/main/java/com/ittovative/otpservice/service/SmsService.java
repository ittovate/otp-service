package com.ittovative.otpservice.service;

import com.ittovative.otpservice.dto.OtpRequestDto;

public interface SmsService {
    /**
     * Send string.
     *
     * @param otpRequestDto the otp request dto
     * @return the string
     */
    String send(OtpRequestDto otpRequestDto);
}
