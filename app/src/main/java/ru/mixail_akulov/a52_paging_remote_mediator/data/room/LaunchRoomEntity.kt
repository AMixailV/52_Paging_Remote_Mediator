package ru.mixail_akulov.a52_paging_remote_mediator.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.mixail_akulov.a52_paging_remote_mediator.domain.Launch

/**
 * Database (Room) entity for storing SpaceX Launch in the
 * local storage.
 */
@Entity(tableName = "launches")
data class LaunchRoomEntity(
    @PrimaryKey override val id: Long,
    override val name: String,
    override val description: String,
    override val imageUrl: String,
    override val year: Int,
    @ColumnInfo(index = true) override val launchTimestamp: Long,
    override val isSuccess: Boolean
) : Launch {

    constructor(launch: Launch) : this(
        id = launch.id,
        name = launch.name,
        description = launch.description,
        imageUrl = launch.imageUrl,
        year = launch.year,
        launchTimestamp = launch.launchTimestamp,
        isSuccess = launch.isSuccess
    )

}