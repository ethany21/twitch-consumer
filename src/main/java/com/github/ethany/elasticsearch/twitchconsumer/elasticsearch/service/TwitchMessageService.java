package com.github.ethany.elasticsearch.twitchconsumer.elasticsearch.service;

import com.github.ethany.elasticsearch.twitchconsumer.elasticsearch.document.TwitchMessage;
import com.github.ethany.elasticsearch.twitchconsumer.elasticsearch.repository.TwitchMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwitchMessageService {

    private final TwitchMessageRepository twitchMessageRepository;

    public void save(final TwitchMessage twitchMessage) {
        twitchMessageRepository.save(twitchMessage);
    }
}
