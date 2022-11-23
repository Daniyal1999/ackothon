package com.acko.ackothon.services;

import com.acko.ackothon.mapper.AnswerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AckoInternalData {

    public String getAnswerForGivenAckoQuestion(String word){
        return AnswerMapper.getQuestionToAnswerMapper().get(word);
    }

}
