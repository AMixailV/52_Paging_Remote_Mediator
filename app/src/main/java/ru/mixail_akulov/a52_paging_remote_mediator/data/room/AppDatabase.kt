package ru.mixail_akulov.a52_paging_remote_mediator.data.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        LaunchRoomEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getLaunchesDao(): LaunchesDao

}