package abika.sinau.mynoteappcompose.di

import abika.sinau.mynoteappcompose.feature_note.data.data_source.NoteDatabase
import abika.sinau.mynoteappcompose.feature_note.data.repository.NoteRepositoryImpl
import abika.sinau.mynoteappcompose.feature_note.domain.repository.NoteRepository
import abika.sinau.mynoteappcompose.feature_note.domain.use_case.NoteUseCase
import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * @author by Abika Chairul Yusri on 5/10/2022
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

//    @Provides
//    @Singleton
//    fun provideNoteUseCases(repository: NoteRepository) : NoteUseCase {
//        return NoteUseCase(
//            getNote =
//        )
//    }
}