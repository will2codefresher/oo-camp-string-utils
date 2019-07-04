package string.utils;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StringUtilsTest {
    StringUtils test ;

    @Before
    public void setUp() throws Exception {
        test = new StringUtils("test");
    }

    @Test
    public void should_return_true_at_is_empty_when_string_is_null() {
        //given
        CharSequence target = null;

        // when
        boolean result = test.isEmpty(target);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_at_is_empty_when_string_length_is_zero() {
        //given
        String target = "";

        // when
        boolean result = test.isEmpty(target);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_at_is_blank_when_string_is_null() {
        // given
        String target = null;

        // when
        boolean result = test.isBlank(target);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_at_is_blank_when_string_length_is_zero() {
        // given
        String target = "";

        // when
        boolean result = test.isBlank(target);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_at_is_blank_when_string_only_contains_space() {
        // given
        String target = "   ";

        // when
        boolean result = test.isBlank(target);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_at_is_blank_when_string_contains_asci() {
        // given
        String target = "hello world";

        // when
        boolean result = test.isBlank(target);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_at_is_alpha_when_string_is_null() {
        // given
        String target = null;

        // when
        boolean result = test.isAlpha(target);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_at_is_alpha_when_string_length_is_zero() {
        // given
        String target = "";

        // when
        boolean result = test.isAlpha(target);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_at_is_alpha_when_string_only_contains_number() {
        // given
        String target = "123";

        // when
        boolean result = test.isAlpha(target);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_at_is_alpha_when_string_only_contain_letter() {
        // given
        String target = "helloworld";

        // when
        boolean result = test.isAlpha(target);

        // then
        assertThat(result).isTrue();
    }
}