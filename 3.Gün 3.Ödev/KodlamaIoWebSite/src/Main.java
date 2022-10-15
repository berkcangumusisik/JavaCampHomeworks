import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;


public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};

        Category category = new Category(5,"Flutter");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category);

        Course course = new Course(3,"Yazılıma Giriş","Programlamaya Giriş İçin Temel Kurs",30);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course);

        Instructor instructor = new Instructor(2,"Berkcan","Gümüşışık");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);
    }
}
