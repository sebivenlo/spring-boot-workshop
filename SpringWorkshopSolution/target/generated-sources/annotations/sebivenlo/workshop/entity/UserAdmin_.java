package sebivenlo.workshop.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sebivenlo.workshop.entity.Account;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T07:14:53")
@StaticMetamodel(UserAdmin.class)
public class UserAdmin_ { 

    public static volatile SingularAttribute<UserAdmin, Account> accountId;
    public static volatile SingularAttribute<UserAdmin, String> surname;
    public static volatile SingularAttribute<UserAdmin, String> name;
    public static volatile SingularAttribute<UserAdmin, Integer> id;

}