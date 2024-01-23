package com.fmunmar310.pruebaroom.addTask.domain

import com.fmunmar310.pruebaroom.addTask.data.TaskRepository
import com.fmunmar310.pruebaroom.addTask.ui.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.delete(taskModel)
    }
}