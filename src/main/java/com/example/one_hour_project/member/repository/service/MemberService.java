package com.example.one_hour_project.member.repository.service;

import com.example.one_hour_project.member.repository.controller.dto.JoinRequest;

public interface MemberService {
    String join(JoinRequest joinRequest);
}
