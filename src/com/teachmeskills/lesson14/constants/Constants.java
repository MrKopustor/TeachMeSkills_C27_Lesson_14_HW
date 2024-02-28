package com.teachmeskills.lesson14.constants;

public interface Constants {

    int DOC_LENGTH = 15;
    String REG_EXP_DOC_NUMBER = "docnum[0-9a-zA-Z&&[^\\r]]{9}";
    String REG_EXP_CONTRACT = "contract[0-9a-zA-Z&&[^\\r]]{7}";
    String PATH_ERROR_LOG = "C:\\Users\\user\\Desktop\\Java\\C27-onl\\Project\\TeachMeSkills_C27_Lesson_14_HW\\log\\error_log\\error_log";
    String PATH_EVENT_LOG = "C:\\Users\\user\\Desktop\\Java\\C27-onl\\Project\\TeachMeSkills_C27_Lesson_14_HW\\log\\event_log\\event_log";
    String PATH_INVALID_DOC = "C:\\Users\\user\\Desktop\\Java\\C27-onl\\Project\\TeachMeSkills_C27_Lesson_14_HW\\result\\invalid\\invalid_doc";
    String PATH_VALID_DOC = "C:\\Users\\user\\Desktop\\Java\\C27-onl\\Project\\TeachMeSkills_C27_Lesson_14_HW\\result\\valid\\valid_doc";
    String PATH_VALID_CONTRACT = "C:\\Users\\user\\Desktop\\Java\\C27-onl\\Project\\TeachMeSkills_C27_Lesson_14_HW\\result\\valid\\valid_сontract";
}
