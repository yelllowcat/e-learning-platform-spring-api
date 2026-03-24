package com.spring.jpa.lectures;

import org.springframework.stereotype.Service;

@Service
public class LectureMapper {

    public LectureResponseDto toLectureDto(){
        return new LectureResponseDto("Grit");
    }
}
