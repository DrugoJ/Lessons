package entites;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-24T20:06:54")
@StaticMetamodel(Blog.class)
public class Blog_ { 

    public static volatile SingularAttribute<Blog, Date> date;
    public static volatile SingularAttribute<Blog, String> author;
    public static volatile SingularAttribute<Blog, Long> id;
    public static volatile SingularAttribute<Blog, String> title;
    public static volatile SingularAttribute<Blog, String> article;

}