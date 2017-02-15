import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = Roles.class )
public @interface Role {
	String value();

}