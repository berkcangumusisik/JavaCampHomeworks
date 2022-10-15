package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        Instructor[] instructors = {new Instructor(1, "Engin ", "Demiroğ")};
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName() + " eğitmeni eklendi.");
        }
    }
}