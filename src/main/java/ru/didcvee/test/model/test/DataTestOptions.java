package ru.didcvee.test.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.didcvee.test.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;

}
