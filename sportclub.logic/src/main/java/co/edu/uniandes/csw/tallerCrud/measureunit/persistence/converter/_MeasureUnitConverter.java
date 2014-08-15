/* ========================================================================
 * Copyright 2014 tallerCrud
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 tallerCrud

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.tallerCrud.measureunit.persistence.converter;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


import co.edu.uniandes.csw.tallerCrud.measureunit.logic.dto.MeasureUnitDTO;
import co.edu.uniandes.csw.tallerCrud.measureunit.persistence.entity.MeasureUnitEntity;

public abstract class _MeasureUnitConverter {

	public static MeasureUnitDTO entity2PersistenceDTO(MeasureUnitEntity entity){
		if (entity != null) {
			MeasureUnitDTO dto = new MeasureUnitDTO();
					dto.setId(entity.getId());
					dto.setName(entity.getName());
					dto.setDescription(entity.getDescription());
			return dto;
		}else{
			return null;
		}
	}
	
	public static MeasureUnitEntity persistenceDTO2Entity(MeasureUnitDTO dto){
		if(dto!=null){
			MeasureUnitEntity entity=new MeasureUnitEntity();
					entity.setId(dto.getId());
			
					entity.setName(dto.getName());
			
					entity.setDescription(dto.getDescription());
			
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<MeasureUnitDTO> entity2PersistenceDTOList(List<MeasureUnitEntity> entities){
		List<MeasureUnitDTO> dtos=new ArrayList<MeasureUnitDTO>();
		for(MeasureUnitEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<MeasureUnitEntity> persistenceDTO2EntityList(List<MeasureUnitDTO> dtos){
		List<MeasureUnitEntity> entities=new ArrayList<MeasureUnitEntity>();
		for(MeasureUnitDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}