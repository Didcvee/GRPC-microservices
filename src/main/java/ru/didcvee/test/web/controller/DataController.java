package ru.didcvee.test.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.didcvee.test.model.Data;
import ru.didcvee.test.model.test.DataTestOptions;
import ru.didcvee.test.service.GRPCDataService;
import ru.didcvee.test.service.TestDataService;
import ru.didcvee.test.web.dto.DataDto;
import ru.didcvee.test.web.dto.DataTestOptionsDto;
import ru.didcvee.test.web.mapper.DataMapper;
import ru.didcvee.test.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final GRPCDataService gRPCDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {
        Data data = dataMapper.toEntity(dataDto);
        gRPCDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto dataTestOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(dataTestOptionsDto);
        testDataService.sendMessages(testOptions);
    }

}
