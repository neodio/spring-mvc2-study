package hello.itemservice.validation;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.ObjectError;

public class MessageCodesResolverTest {

    MessageCodesResolver messageCodesResolver = new DefaultMessageCodesResolver();

    @Test
    void messageCodesResolverObject() {
        String[] messageCodes = messageCodesResolver.resolveMessageCodes("required", "item");

        for (String messageCode : messageCodes) {
            System.out.println("messageCodes = " + messageCodes);
        }

        assertThat(messageCodes).containsExactly("required.item", "required");
    }

}
