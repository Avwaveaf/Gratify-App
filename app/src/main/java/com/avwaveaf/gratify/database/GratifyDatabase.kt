package com.avwaveaf.gratify.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.avwaveaf.gratify.models.Memory

@Database(entities = [Memory::class], version = 2)
@TypeConverters(MemoryTypeConverter::class, UUIDTypeConverter::class)
abstract class GratifyDatabase : RoomDatabase() {
    abstract fun memoryDao(): MemoryDao

    companion object {
        @Volatile
        private var INSTANCE: GratifyDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK) {
            INSTANCE ?: createDatabase(context).also {
                INSTANCE = it
            }
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            GratifyDatabase::class.java,
            "noteapp_db"
        ).addMigrations(migration_1_2).build()
    }
}

val migration_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE memory_data ADD COLUMN memory_image_path TEXT")
    }
}
