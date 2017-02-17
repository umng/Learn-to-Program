import java.lang.annotation.*;

@Retention( RetentionPolicy.RUNTIME )
@interface Roles {
 Role[] value() default{};
}