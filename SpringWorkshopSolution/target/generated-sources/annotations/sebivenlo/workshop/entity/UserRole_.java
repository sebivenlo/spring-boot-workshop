package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.Account;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, String> role;
    public static volatile SetAttribute<UserRole, Account> accountSet;
    public static volatile SingularAttribute<UserRole, Integer> id;

}