package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.Account;
import sebivenlo.workshop.entity.Degree;
import sebivenlo.workshop.entity.StudyProgram;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(UserStudent.class)
public class UserStudent_ { 

    public static volatile SingularAttribute<UserStudent, Account> accountId;
    public static volatile SingularAttribute<UserStudent, StudyProgram> studyProgId;
    public static volatile SingularAttribute<UserStudent, Degree> degreeId;
    public static volatile SingularAttribute<UserStudent, String> surname;
    public static volatile SingularAttribute<UserStudent, String> name;
    public static volatile SingularAttribute<UserStudent, Boolean> fullTime;
    public static volatile SingularAttribute<UserStudent, Integer> semester;
    public static volatile SingularAttribute<UserStudent, Integer> id;
    public static volatile SingularAttribute<UserStudent, Integer> enrolYear;

}