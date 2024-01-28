package dev.aziz.dataanalysermicroservice.service;

import dev.aziz.dataanalysermicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);

}
