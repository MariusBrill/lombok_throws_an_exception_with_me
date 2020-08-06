import lombok.Builder;
import javax.validation.constraints.NotBlank;
import java.util.Collections;
import java.util.Map;

@Builder
public class MyClass {

    public static final MyClass NO_TRACING_AND_ATTRIBUTES = MyClass.builder()
            .build();

    @Builder.Default
    private Map<@NotBlank String, String> attributes = Collections.emptyMap();
}
