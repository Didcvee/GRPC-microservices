package ru.didcvee.test.service;

import ru.didcvee.test.model.Data;

import java.util.List;

public interface GRPCDataService {

    void send(Data data);

    void send(List<Data> data);



}
