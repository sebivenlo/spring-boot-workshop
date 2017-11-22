package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.StudyProgram;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(Course.class)
public class Course_ { 

    public static volatile SingularAttribute<Course, StudyProgram> studyProgId;
    public static volatile SingularAttribute<Course, String> course;
    public static volatile SingularAttribute<Course, Integer> semester;
    public static volatile SingularAttribute<Course, Integer> id;
    public static volatile SingularAttribute<Course, Integer> credit;

}