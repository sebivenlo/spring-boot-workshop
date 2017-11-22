package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.UserAdmin;
import sebivenlo.workshop.entity.UserRole;
import sebivenlo.workshop.entity.UserStudent;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> mail;
    public static volatile SingularAttribute<Account, UserRole> roleId;
    public static volatile SetAttribute<Account, UserAdmin> userAdminSet;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SetAttribute<Account, UserStudent> userStudentSet;

}