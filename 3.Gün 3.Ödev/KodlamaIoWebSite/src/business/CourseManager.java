package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course) {
        Course[] courses = {new Course(1, "Java & React", "Yazılım Geliştirici Kampı",100), new Course(2, "C# & Angular", "Yazılım Yetiştirici Kampı",200)};
        for (Course course1 : courses) {
            if(course.getName() == course1.getName()){
                System.out.println("Bu kurs zaten mevcut.");
            }
            else if (course.getPrice() < 0) {
                System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
            }

        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getName() + " kursu eklendi.");
        }
    }
}
