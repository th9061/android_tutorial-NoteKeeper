package com.ray.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming with Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)

        course = CourseInfo("kotlin_core", "Kotlin Fundamentals: The New Language")
        courses.set(course.courseId, course)

        course = CourseInfo("kotlin_android", "Kotlin With Android: Newly Improved")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        val courseList = courses.values.toList()
        var course = courseList[0]

        var noteInfo = NoteInfo(course, "lol00", "wow01")
        notes.add(noteInfo)

        course = courseList[1]
        noteInfo = NoteInfo(course, "lol01", "wow12")
        notes.add(noteInfo)

        course = courseList[2]
        noteInfo = NoteInfo(course, "lol02", "wow13")
        notes.add(noteInfo)

        course = courseList[3]
        noteInfo = NoteInfo(course, "lol03", "wow10")
        notes.add(noteInfo)

        course = courseList[4]
        noteInfo = NoteInfo(course, "lol04", "wow11")
        notes.add(noteInfo)

        course = courseList[5]
        noteInfo = NoteInfo(course, "lol05", "wow12")
        notes.add(noteInfo)

        course = courseList[6]
        noteInfo = NoteInfo(course, "lol06", "wow13")
        notes.add(noteInfo)
    }
}