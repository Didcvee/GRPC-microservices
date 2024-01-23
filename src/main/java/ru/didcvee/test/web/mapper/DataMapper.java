package ru.didcvee.test.web.mapper;

import org.mapstruct.Mapper;
import ru.didcvee.test.model.Data;
import ru.didcvee.test.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {



}
