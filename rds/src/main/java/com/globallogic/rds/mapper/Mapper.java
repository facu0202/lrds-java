package com.globallogic.rds.mapper;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Mapper<D, M> {

	static final Logger logger = LoggerFactory.getLogger(Mapper.class);

	public M toModel(D dto);

	public D toDto(M model);

}
