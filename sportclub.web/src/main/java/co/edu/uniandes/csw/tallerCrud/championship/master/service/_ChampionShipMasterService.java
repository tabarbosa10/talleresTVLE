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

package co.edu.uniandes.csw.tallerCrud.championship.master.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.inject.Inject;

import co.edu.uniandes.csw.tallerCrud.championship.master.logic.api.IChampionShipMasterLogicService;
import co.edu.uniandes.csw.tallerCrud.championship.master.logic.dto.ChampionShipMasterDTO;

public abstract class _ChampionShipMasterService {

    @Inject
    protected IChampionShipMasterLogicService championshipLogicService;

    @POST
    public ChampionShipMasterDTO createChampionShip(ChampionShipMasterDTO championship) {
        return championshipLogicService.createMasterChampionShip(championship);
    }

    @DELETE
    @Path("{id}")
    public void deleteChampionShip(@PathParam("id") Long id) {
        championshipLogicService.deleteMasterChampionShip(id);
    }
    
    @GET
    @Path("{id}")
    public ChampionShipMasterDTO getChampionShip(@PathParam("id") Long id) {
        return championshipLogicService.getMasterChampionShip(id);
    }

    @PUT
    @Path("{id}")
    public void updateChampionShip(@PathParam("id") Long id, ChampionShipMasterDTO championship) {
        championshipLogicService.updateMasterChampionShip(championship);
    }

}
