def gradingStudents(grades):
    for i in range(len(grades)):
        if grades[i] < 37:
            continue
        elif grades[i] % 5 >= 3:
            grades[i] = grades[i] + (5 - grades[i] % 5)
    return grades
