package dev.aziz.dataanalysermicroservice.service;

import dev.aziz.dataanalysermicroservice.model.Data;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServiceImpl implements KafkaDataService{

    @Override
    public void handle(Data data) {
        // There could be your logic. It could save Data to database etc.
        System.out.println("Data object is received: " + data.toString());
    }
}
