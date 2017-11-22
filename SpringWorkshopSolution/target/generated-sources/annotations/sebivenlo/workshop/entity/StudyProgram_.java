package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.Course;
import sebivenlo.workshop.entity.UserStudent;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(StudyProgram.class)
public class StudyProgram_ { 

    public static volatile SetAttribute<StudyProgram, Course> courseSet;
    public static volatile SingularAttribute<StudyProgram, Integer> id;
    public static volatile SingularAttribute<StudyProgram, String> studyProgram;
    public static volatile SetAttribute<StudyProgram, UserStudent> userStudentSet;

}