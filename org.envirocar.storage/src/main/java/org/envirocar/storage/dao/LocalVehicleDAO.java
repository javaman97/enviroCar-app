package org.envirocar.storage.dao;

import androidx.room.Dao;
import androidx.room.Query;

import org.envirocar.core.entity.Vehicles;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface LocalVehicleDAO extends BaseLocalCarDAO<Vehicles> {

    @Query("SELECT * FROM vehicles")
    Single<List<Vehicles>> getManufacturerVehicles();

    @Query("SELECT * FROM vehicles where manufacturer_id = :manuId AND id = :vehicleId")
    Single<Vehicles> getHsnTsnVehicle(String manuId,String vehicleId);
}
