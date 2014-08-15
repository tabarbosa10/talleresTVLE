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

package co.edu.uniandes.csw.tallerCrud.championship.master.persistence.entity;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class ChampionShipprizeEntityId implements Serializable{

    private Long championShipId;
    private Long prizeId;

    @Override
    public int hashCode() {
        return (int) (championShipId + prizeId);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ChampionShipprizeEntityId) {
            ChampionShipprizeEntityId otherId = (ChampionShipprizeEntityId) object;
            return (otherId.championShipId.equals(this.championShipId)) && (otherId.prizeId.equals(this.prizeId));
        }
        return false;
    }

}
