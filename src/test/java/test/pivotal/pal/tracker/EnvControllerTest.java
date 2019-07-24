package test.pivotal.pal.tracker;

import org.junit.Test;

import java.util.Map;
import io.pivotal.pal.tracker.EnvController;

import static org.assertj.core.api.Assertions.assertThat;

public class EnvControllerTest {
<<<<<<< HEAD
    @Test
=======
    /*@Test
>>>>>>> 67d0fd1815d31741823ca1f315763021de97171b
    public void getEnv() throws Exception {
        EnvController controller = new EnvController(
            "8675",
            "12G",
            "34",
            "123.sesame.street"
        );

        Map<String, String> env = controller.getEnv();

        assertThat(env.get("PORT")).isEqualTo("8675");
        assertThat(env.get("MEMORY_LIMIT")).isEqualTo("12G");
        assertThat(env.get("CF_INSTANCE_INDEX")).isEqualTo("34");
<<<<<<< HEAD
        assertThat(env.get("CF_INSTANCE_ADDR")).isEqualTo("123.sesame.street");
    }
=======
        assertThat(env.get("CF_INSTANCE_ADDRESS")).isEqualTo("123.sesame.street");
    }*/

>>>>>>> 67d0fd1815d31741823ca1f315763021de97171b

}
