package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.UserStudent;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(Degree.class)
public class Degree_ { 

    public static volatile SingularAttribute<Degree, String> degree;
    public static volatile SingularAttribute<Degree, Integer> id;
    public static volatile SetAttribute<Degree, UserStudent> userStudentSet;

}