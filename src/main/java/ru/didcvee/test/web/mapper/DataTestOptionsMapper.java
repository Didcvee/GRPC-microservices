package ru.didcvee.test.web.mapper;

import org.mapstruct.Mapper;
import ru.didcvee.test.model.test.DataTestOptions;
import ru.didcvee.test.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto>{ }
