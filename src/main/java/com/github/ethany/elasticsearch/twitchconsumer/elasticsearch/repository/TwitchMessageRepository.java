package com.github.ethany.elasticsearch.twitchconsumer.elasticsearch.repository;

import com.github.ethany.elasticsearch.twitchconsumer.elasticsearch.document.TwitchMessage;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TwitchMessageRepository extends ElasticsearchRepository<TwitchMessage, String> {
}
